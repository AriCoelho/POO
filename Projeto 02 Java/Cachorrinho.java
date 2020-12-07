package cachorrinho;
public class Cachorrinho{
    int energia;
    int fome;
    int feliz;
    
    Cachorrinho(int energia,int fome, int feliz){
        this.energia=energia;
        this.fome=fome;
        this.feliz=feliz;
    }
     
    void passeio(){
        if(energia>2){
            energia-=1;
            feliz+=2;
            System.out.println("Vamo passear!!!");
        }else{
            System.out.println("Nao to afim de sair hoje");
        }
    }
    
    void brincar(){
        if(energia>3){
            energia-=5;
            fome+=3;
            feliz+=2;
            System.out.println("Vamo brincar");
        }else{
            System.out.println("To cansado, quero dormir");
        }
    }
    
    void comer(){
        if(fome>2){
            fome-=3;
            energia+=2;
            feliz-=3;
            System.out.println("Que fome!Cade minha comida?");    
        }else{
            System.out.println("To de buxo cheio");
        }
    }
    
    void descansar(){
        if(energia<2){
            feliz-=1;
            energia+=4;
            System.out.println("Que soninho, vou dormir");
    }else{
            System.out.println("To cheio de energia, não quero dormir agora");
        
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
          Cachorrinho bonitinho= new Cachorrinho(15,0,6);
          System.out.println(bonitinho);
          
          bonitinho.passeio();
          bonitinho.brincar();
          bonitinho.brincar();
          bonitinho.descansar();
          bonitinho.comer();
          bonitinho.brincar();
          bonitinho.comer();
          bonitinho.passeio();
          bonitinho.alegria();
          
           System.out.println(bonitinho);
          
      }
}
