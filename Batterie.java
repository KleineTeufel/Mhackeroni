/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vorii;

/**
 *
 * @author pietro
 */
public class Batterie {
    
    public void metodo4(double Hp){
    
        double E, N=0.745699872;
        E=Hp*N;
        System.out.println("I Kw ottenuti sono ordunque "+E);
  }
    public void metodo6(int Ah, int A){
      int Tot, var;
      var=Ah/4;
      if(A>var){
          System.out.println("Acci acci, vuoi firggerla la batteria. invece che caricarla");
      }
      else{
          Tot=Ah/A;
          System.out.println("Il tempo nel quale essere improduttivi nell'attesa che si carichino le batterie è pari a "+Tot);
      }
  }  
    
}
