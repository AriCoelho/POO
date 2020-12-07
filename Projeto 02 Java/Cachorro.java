package cachorro;
import java.util.Scanner; 
public class Cachorro {
    int energia;
    int fome;
    int feliz;
    int saude;
    boolean remedio;
    
    Cachorro(int energia,int fome, int feliz){
        this.energia=energia;
        this.fome=fome;
        this.feliz=feliz;
    }
     
    void passear(){
        if(energia>2){
            energia-=1;
            feliz+=3;
            System.out.println("Vamo passear!!!");
        }else{
            System.out.println("Nao to afim de sair hoje");
        }
    }
    
    void brincar(){
        if(energia>3){
            energia-=5;
            fome+=3;
            feliz+=3;
            System.out.println("Vamo brincar");
        }else{
            System.out.println("To cansado, quero dormir");
        }
    }
    
    void comer(){
        if(fome>2){
            fome-=6;
            energia+=2;
            feliz-=2;
            System.out.println("Que fome!Cade minha comida?");    
        }else{
            System.out.println("To de buxo cheio");
        }
    }
    
    void descansar(){
        if(energia<2){
            feliz-=1;
            energia+=10;
            System.out.println("Que soninho, vou dormir");
    }else{
            System.out.println("To cheio de energia, não quero dormir agora");
        
        }
    }
    
    void doente(){
        if(saude<3){
           feliz-=2;
           energia-=6;
           fome+=2;
           System.out.println("To dodoi,mas eu nao quero remedio");
           if(remedio=true){
               System.out.println("To curado!");
           }else{
            System.out.println("Ainda to doente, vou ter que tomar o remedio ruim");
          }
         }else{
            System.out.println("To novinho em folha");
        
        }
           
        }
    
    void alegria(){
        if(feliz>1){
            System.out.println(" Eu to muito feliz");
        }else{
            System.out.println("Comi um chinelo e levei bronca, to triste");
        }
    }
    
      public String toString() {
        return "Cachorrinho: energia:" + energia + " fome:" + fome + " feliz:" + feliz;
    }
      
      public static void main (String[] args){
         Scanner leitura  = new Scanner(System.in);
         System.out.println("Quanta energia o cachorro tem?");
           int energia = leitura.nextInt();
         System.out.println("Qual o nivel de fome do cachorrinho ?");
           int fome = leitura.nextInt();
         System.out.println("Qual o nivel de alegria dele ?");
           int feliz = leitura.nextInt();
         System.out.println("Como anda a saude dele ?");
           int saude = leitura.nextInt();
         leitura.close();         
  
          Cachorro bonitinho= new Cachorro(energia,fome,feliz);
          System.out.println(bonitinho);
          bonitinho.passear();
          bonitinho.brincar();
          bonitinho.descansar();
          bonitinho.comer();
          bonitinho.brincar();
          bonitinho.comer();
          bonitinho.passear();
          bonitinho.descansar();
          bonitinho.alegria();
          
          System.out.println(bonitinho);
          
           
           } 
         
      }  
