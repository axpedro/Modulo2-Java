public class PressaoArterial {

   public double sistolica;
   public double diastolica;

    public  void medicaoPA(double sistolica,double diastolica ){



        if(sistolica == 120 && diastolica ==80){
            System.out.println("Pressão Normal!");
        }
        else if(sistolica<120 || diastolica < 80) {
           System.out.println("Atenção, possivel pressão baixa");
        }
        else {
            System.out.println("Cuidado, possível pressão alta");
        }


    }



}
