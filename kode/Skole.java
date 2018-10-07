public class Skole
{
   
   public static void main(String[] args)
   {
      
      //lav 3 studerende - sekretæren kender navne og klasser
      Studerende stud1 = new Studerende("Rip", "Dat18F");
      Studerende stud2 = new Studerende("Rap", "Dat18F");
      Studerende stud3 = new Studerende("Rup", "Dat18F");

      //sæt 3 studerendes højde og vægt - underviser måler
      stud1.maalStuderende(1.72, 87);
      stud2.maalStuderende(1.82, 67);
      stud3.maalStuderende(1.92, 67);
           
      //beregn bmi - udskriv navn og så beregn BMI
      System.out.println("Studerende: " + stud1.getNavn());
      stud1.beregnBMI();
      System.out.println();
      System.out.println("Studerende: " + stud2.getNavn());
      stud2.beregnBMI();
      System.out.println();
      System.out.println("Studerende: " + stud3.getNavn());
      stud3.beregnBMI();
      System.out.println();
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      /*
      // opret array med plads til studerende
      Studerende[] stud = new Studerende[3];
      for (int i=0; i<stud.length; i++)
      {
         // læg nye studerende i arrayet
         stud[i] = new Studerende("Rap And", "Andedammen");
      }
      
      //ændr en studerende
      stud[2].setNavn("Anders And");
      
      //mål studerende
      stud[0].maalStuderende(1.72, 87);
      stud[1].maalStuderende(1.82, 67);
      stud[2].maalStuderende(1.92, 67);
      
      //udskriv studerende vha. toString
      for (int i=0; i<stud.length; i++)
      {
         System.out.print(stud[i]);
         stud[i].beregnBMI();
         System.out.println();
      }
      
      //gør to studerende ens (0 og 1)
      stud[1].maalStuderende(1.72, 87);
      //sammenlign studerende (0 og 1)
      System.out.println(stud[0].equals(stud[1]));
      */
      
   }
}