public class Studerende
{
   //attributer
   private String navn;
   private String klasse;
   private double vaegt;
   private double hoejde;

   //konstruktører
   public Studerende()
   {
      this.navn = "";
      this.klasse = "";
      this.vaegt = 0.0;
      this.hoejde = 0.0;
   }
   public Studerende(String navn, String klasse)
   {
      this.navn = navn;
      this.klasse = klasse;
      this.vaegt = 0.0;
      this.hoejde = 0.0;
   }
   
   //get-metoder og set-metoder
   public String getNavn()
   {
      return this.navn;
   }
   public void setNavn(String navn)
   {
      this.navn = navn;
   }
   
   public String getKlasse()
   {
      return this.klasse;
   }
   public void setKlasse(String klasse)
   {
      this.klasse = klasse;
   }

   public double getHoejde()
   {
      return this.hoejde;
   }
   public void setHoejde(double hoejde)
   {
      this.hoejde = hoejde;
   }

   public double getVaegt()
   {
      return this.vaegt;
   }
   public void setVaegt(double vaegt)
   {
      this.vaegt = vaegt;
   }
   
   //metoder
   public boolean equals(Studerende stud)
   {
      return (this.getVaegt()==stud.getVaegt());
   }
   
   public void maalStuderende(double hoejde, double vaegt)
   {
      setHoejde(hoejde);
      setVaegt(vaegt);
   }
   
   public String toString()
   {
      String s = "";
      s += "Navn:\t\t" + getNavn() + "\n";
      s += "Klasse:\t" + getKlasse() + "\n";
      s += "Højde:\t" + getHoejde() + "\n";
      s += "Vægt:\t\t" + getVaegt() + "\n";
      return s;
   }
   
   public boolean equal(Studerende st)
   {
      if (this.getNavn().equals(st.getNavn())
      && this.getKlasse().equals(st.getKlasse())
      && this.getHoejde() == st.getHoejde()
      && this.getVaegt() == st.getVaegt())
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   public void beregnBMI()
   {
      //beregn BMI
      double bmi = getVaegt() /(getHoejde()*getHoejde());
      //udskriv BMI
      System.out.print("BMI: " + bmi);
      //klassificer BMI
      if (bmi < 18.5)
      {
         System.out.println(" undervægtig");
      }
      else if ((18.5 <= bmi) && (bmi < 25))
      {
         System.out.println(" normalvægtig");
      }
      else if ((25 <= bmi) && (bmi < 30))
      {
         System.out.println(" overvægtig");
      }
      else if (30 <= bmi)
      {
         System.out.println(" fed");
      }
   }
     
}