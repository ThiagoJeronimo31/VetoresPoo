
package poo_alturas;

import entities.calculo;
import java.util.Scanner;

public class Poo_alturas {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serão digitadas? ");
    int n = sc.nextInt();
    int i,ida=0,porcen;
    double soma=0,media;
    calculo[] vetor = new calculo[n];
    
    for(i=0;i<vetor.length;i++){
        System.out.println("Dados da "+(i+1)+"ª pessoa: ");
        sc.nextLine();
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Idade: ");
        int idade = sc.nextInt();
        
        System.out.println("Altura: ");
        double altura = sc.nextDouble();
        
        vetor[i] = new calculo(nome,idade,altura);
    }
for(i=0;i<vetor.length;i++){
    soma+= vetor[i].getAltura();
    if(vetor[i].getIdade() < 16){
        ida++;
    }
}
    media = soma/n;
    porcen = (ida*100)/n;
    System.out.println("Altura média: "+media);
    System.out.println("Pessoas com menos de 16 anos: "+porcen
            
            +"%");
    
    for(i=0;i<vetor.length;i++){
        if(vetor[i].getIdade() < 16)
            System.out.println(vetor[i].getNome());
    }
}

    

    }
    

