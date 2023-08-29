package aprovados_poo;

import entities.Notas;
import java.util.Scanner;

public class Aprovados_POO {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos vão ser cadastrados? ");
        int n = sc.nextInt();
        Notas[] vetor = new Notas[n];
        int i;
        for(i=0;i<vetor.length;i++){
            System.out.println("Cadastro do "+(i+1)+" ª aluno");
            sc.nextLine();
            
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            
            System.out.println("Nota do Primeiro Semestre: ");
            double nota1 = sc.nextDouble();
            
            System.out.println("Segundo Semestre: ");
            double nota2 = sc.nextDouble(); 
            
            System.out.println("");
            vetor[i] = new Notas(nome, nota1, nota2);
        }
        System.out.println("Alunos Aprovados ");
        for(i=0;i<vetor.length;i++){
          if((vetor[i].getNota1() + vetor[i].getNota2())/2 >=6){
              System.out.println(vetor[i].getNome());
          }                      
        }
        

    }
        




    }
    

