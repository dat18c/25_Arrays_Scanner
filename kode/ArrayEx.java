import java.util.Arrays;
import java.util.Scanner;
//import java.util.*;

public class ArrayEx
{
   public static void main(String[] args)
   {
      int[] liste = new int[4];
      for (int i=0; i<liste.length; i++)
      {
         //gør noget i arrayet
         liste[i] = i;
      }
      
      /*System.out.println(liste[0]);
      System.out.println(liste[1]);
      System.out.println(liste[2]);
      System.out.println(liste[3]);*/
      for (int i=0; i<liste.length; i++)
      {
         System.out.println(liste[i]);
      }
      System.out.println(liste);
      System.out.println(Arrays.toString(liste));
      //kald metode med array
      printArray(liste);
   }
   
   //metode der tager et array som paramter
   public static void printArray(int[] minListe)
   {
      System.out.println(Arrays.toString(minListe));
   }
}