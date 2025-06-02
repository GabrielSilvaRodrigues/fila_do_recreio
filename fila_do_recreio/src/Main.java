import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> notas = new ArrayList<>();
        Queue<Integer> notasDesodernadas = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int quantidadeFilas = sc.nextInt();
        for(int i =0;i<quantidadeFilas; i++){
            int quantidadeAlunos=sc.nextInt();
            for(int j =0;j<quantidadeAlunos; j++){
                int nota = sc.nextInt();
                notas.add(nota);
                notasDesodernadas.offer(nota);
            }
            Collections.sort(notas);
            int ficaLugar=0;
            for(int j=notas.size()-1; j>=0;j--){
                int l1 = notas.get(j);
                int l2 = notasDesodernadas.peek();
                notasDesodernadas.poll();
                if(l1==l2){
                    ficaLugar++;
                }
            }
            System.out.println(ficaLugar);
            notas.clear();
            notasDesodernadas.clear();
        }
        sc.close();
    }
}