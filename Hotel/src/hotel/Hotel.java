package hotel;

import entities.Order;
import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) {

Scanner sc = new Scanner (System.in);
        
        System.out.println("Quantas estadias vai ser feita?");
        int n = sc.nextInt();
        
        Order[] vetor = new Order[10];
        int i;
        for(i=1;i<=n;i++){
            System.out.println("Cadastro do "+i+" hospede");
            sc.nextLine();
            
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            
            System.out.println("Email");
            String email = sc.nextLine();
            
            System.out.println("Qual quarto você deseja? ");
            int vet = sc.nextInt();
            System.out.println("");
            vetor[vet] = new Order(nome,email);
            
        }
        
        for(i=0;i<vetor.length;i++){
            if(vetor[i] != null){
                System.out.println(vetor[i]);
                System.out.println("Quarto #"+i);
                System.out.println("");
            }
        }
        


    }
    
}
