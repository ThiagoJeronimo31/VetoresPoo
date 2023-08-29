
package poo_mais.velho;

import entities.maisVelho;
import java.util.Scanner;

public class Poo_maisVelho {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();
        int i,mv=0;
        maisVelho[] vetor = new maisVelho[n];
        
        for(i=0;i<vetor.length;i++){
            sc.nextLine();
            System.out.println("Dados da "+(i+1)+"ª pessoa: ");
            
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            vetor[i] = new maisVelho(nome,idade);
        }
        
        for(i=0;i<vetor.length;i++){
           if(vetor[i].getIdade() > mv){
               mv = vetor[i].getIdade();
           }
        }
        
        for(i=0;i<vetor.length;i++){
            if(vetor[i].getIdade() == mv){
                System.out.println("Pessoa mais velha: "
                        + ""+vetor[i].getNome());
            }
        }
        
        
    }
    
}
