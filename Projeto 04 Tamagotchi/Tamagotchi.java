package jogo;
import java.util.Scanner;
public class Tamagotchi{
    private int diamantes;
    private int idade;
    private int energia;
    private int energiaMax;
    private int fome;
    private int fomeMax;
    private int limpeza;
    private int limpezaMax;
    private boolean vivo;
    
 Tamagotchi(int diamantes, int idade, int energia, int energiaMax, int fome, int fomeMax, int limpeza, int limpezaMax, boolean vivo){
     
      this.energia=energiaMax;
      this.fome=fomeMax;
      this.limpeza=limpezaMax;
      this.energiaMax=energiaMax;
      this.fomeMax=fomeMax;
      this.limpezaMax=limpezaMax;
      this.diamantes=0;
      this.idade=0;
      this.vivo=true;
      
  }
  
  void setEnergia (int value){
      this.energia=value;
      if(energia<=0){
         this.energia=0;
         this.vivo=false;
         System.out.println("Morreu de fraqueza");
      }
      if(energia > energiaMax){
          energia=energiaMax;
      }
  }
  
  int getEnergia(){
      return energia;
  }
  
  void setFome(int value){
      this.fome=value;
      if(fome<=0){
         this.fome=0;
         this.vivo=false;
         System.out.println("A fome do seu pet chegou a 0, ele morreu");
      }
      if(fome > fomeMax){
          fome=fomeMax;
      }
  }
   int getFome (){
       return fome;
   }
 
  void setLimpeza(int value){
      this.limpeza=value;
      if(limpeza<=0){
         this.limpeza=0;
         this.vivo=false;
         System.out.println("Seu pet estava muito sujo, ele morreu por falta de banho");
      }
      if(limpeza > limpezaMax){
          limpeza=limpezaMax;
      }
  }
  
  int getBanho(){
      return limpeza;
  }
  
  boolean tavivo(){
      if(!vivo){
          System.out.println("Seu pet morreu");
          return false;
      }
      return true;
  }
  
 public boolean isVivo(){
    return vivo;
}
 
 void brincar(){
     if(!tavivo())
        return;
         setEnergia(energia-2);
         setFome(fome-1);
         setLimpeza(limpeza-3);
         diamantes+=1;
         idade+=1;
 }
 
 void comer(){
     if(!tavivo())
        return;
         setEnergia(energia-1);
         setFome(fome+4);
         setLimpeza(limpeza-2);
         idade+=1;
 }
 void banho(){
     if(!tavivo())
        return;
         setEnergia(energia-3);
         setFome(fome-1);
         setLimpeza(limpezaMax);
         idade+=2;
 }
  void dormir(int igualar){
     if(!tavivo())
        return;
     if(energia==energiaMax-5){
         setEnergia(energiaMax);
          idade+=igualar;
     }else{
         System.out.println("Sem sono");
     }
 }
  public String toString(){
    return "Energia:" + energia + "/" + energiaMax + "Fome:" + fome + "/" + fomeMax + "Limpeza:" + limpeza + "/" + limpezaMax + "Diamantes:" + diamantes + "Idade:" + idade; 
  }
}

class Jogo {
    public static void main(String[] args){
        
        Scanner leitura = new Scanner(System.in);
        Tamagotchi fofo =new Tamagotchi(0,0,0);
        System.out.println("O que o tamagotchi vai fazer ?");
        while(true){
        String line = leitura.nextLine();
        String[] t=line.split(" ");
          if(t[0].equals("Fim")){
             break; 
          }else if(t[0].equals("Tamagotchi novo:")){
                fofo = new Tamagotchi (Integer.parseInt(t[1]), Integer.parseInt(t[2]),Integer.parseInt(t[3]));
         } else if (t[0].equals("Brincar")){
            fofo.brincar(); 
            System.out.println(fofo);
         }else if (t[0].equals("Comer")){
            fofo.comer(); 
            System.out.println(fofo);
         }else if (t[0].equals("Banho")){
            fofo.banho(); 
            System.out.println(fofo);
         }else if (t[0].equals("Dormir")){
            fofo.dormir(Integer.parseInt(t[1]));
            System.out.println(fofo);
         } else {
              System.out.println("Comando invalido");
         }
        }
        leitura.close();
}
} 
