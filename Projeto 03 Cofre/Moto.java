package moto;
import java.util.Scanner; 
class Pessoa{
    
    String nome;
    int idade;
      
    Pessoa (String nome, int idade){
          this.nome=nome;
          this.idade=idade;
        }
    
        public String toSting(){
          return "Nome:" + nome + "Idade:" + idade;
        }
 }

public class Moto{
      int potencia;
      int tempo;
      Pessoa motorista;
      
      Moto(int potencia, int tempo){
          this.potencia=potencia;
          this.tempo=tempo;
          this.motorista= null;
      }
      
      void subir(Pessoa pessoa){
          if(motorista==null){
              System.out.println("Pode subir na motinha" + "Nome:" + pessoa.nome + "Idade:" + pessoa.idade);
          } else {
              System.out.println("Tá ocupada, espere sua vez");
          }
      }
   
     Pessoa descer(){
        if(motorista==null){
            System.out.println("Moto não ocupada");
            return null;
        } else {
            Pessoa aux = motorista;
            motorista = null;
            System.out.println("Desce dai");
            return aux;
        }
    }
      
      void comprarTempo (int tempo){
           this.tempo += tempo;
           System.out.println("Foi colocado mais" + tempo + "minutos");
      }
      
      void dirigir(){
          if(this.motorista == null){
              System.out.println("Motinha livre");
          } else if(motorista.idade > 10){
              System.out.println("Nao pode andar de motinha");
          } else if(this.tempo >= tempo){
              this.tempo -= tempo;
              System.out.println("Andou por" + tempo + "minutos");
          } else {
              System.out.println("Va comprar mais tempo");
          }
      }
      
      String buzinar(){
         String buzina = "p";
         
           for(int i=0; i<potencia; i++)
            buzina += "e";
             buzina += "m";
            return buzina;
      }
    public static void main(String[] args) {
       
        Scanner leitura  = new Scanner(System.in); 
        Moto motinha = new Moto(1,0);
        Pessoa motorista = new Pessoa("",10);
        System.out.println("O que o motorista vai fazer ?");
      while(true){
          String line = leitura.nextLine();
          String[] m=line.split(" ");
          if(m[0].equals("Fim")){
             break; 
         } else if(m[0].equals("Subir")){
             motinha.subir(new Pessoa(m[1], Integer.parseInt(m[2])));
         } else if(m[0].equals("Descer")){
             motinha.descer();
         } else if(m[0].equals("Comprar mais tempo")){
             motinha.comprarTempo(Integer.parseInt(m[1]));
         } else if(m[0].equals("Dirigir")){
             motinha.dirigir();
         } else if(m[0].equals("Buzinar")){
             motinha.buzinar();
         } else {
             System.out.println("Comando invalido");
         }
    }
      leitura.close();
    }
  }   
 
