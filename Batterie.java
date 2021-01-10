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
     /**
     * Questo metodo ti trasforma i cavalli in Kilowatt
     *
     *
     */
        double E, N=0.745699872;
        E=Hp*N;
        System.out.println("I Kw ottenuti sono ordunque "+E);
  }
    public void metodo6(int Ah, int A){
        // buona la pasta
        /**
        *Questo metodo ti calcora i tempi di scarica di una batteria
        *
        */
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
    public void metodo7(int W, int h){
        /**
         * Questo metodo di restituisce i watt-ora, inserendo i watt e le ore
         */
        int Wh;
        Wh=W*h;
        System.out.println("Pijiete sto Wh: "+Wh);
    }
    
}
