package entities;

public class Order {

    private String nome;
private String email;

    public Order(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
      return "Nome: "   +
              this.nome + 
          
              "\nEmail: "  + 
              this.email;
      
              
       

}

    
}
