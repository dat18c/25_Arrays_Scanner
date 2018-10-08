import java.util.Scanner;

public class Menu
{
   public static void main(String[] args)
   {
      //løkkevariabel
      boolean koerProgram = true;
      int valg = 0;
      Scanner skanner = new Scanner(System.in);
      //whileløkke, der bliver ved indtil koerProgram er false
      while (koerProgram)
      {
         //udskriv menu - System.out.println()
         System.out.println("Menu. Tast et tal: ");
         //læs valg fra keyboard - skanner.nextInt()
         valg = skanner.nextInt();
         //find ud af hvad der blev valgt
         System.out.println("Du har valgt: " + valg);
         
         if (valg == 1)
         {
            //kald f.eks. reservationsmodulet
            //Reservation res = new Reservation();
            //res.reservationsMenu();
            System.out.println("Nu er vi igang med valg 1");
         }
         else if (valg == 0)
         {
            //der er valgt 0
            System.out.println("Tak for at du kørte programmet. Farvel!");
            koerProgram = false; //fortæller løkken at vi skal stoppe
         }
         /*else
         {
            System.out.println("Programmet burde ikke komme her til.");
            koerProgram = false;
         }*/
      }
      
   }
}