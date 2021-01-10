   public double metodo_5(double eff, int Co, int I_input, int I_consumo){
        double Tcarica;
        //controllo del rapporto capacità/Ah
        if (Co/I_input<=4){
            //formula tempo di carica
        Tcarica=(Co*eff/I_input-I_consumo);
        System.out.print(" la batteria si caricherà in "+Tcarica);
        System.out.println(" ore");
        }
        else{
            System.out.println(" Stai friggendo la batteria. Ben fatto! ");
            return 0;
        }
         return Tcarica;
         }
