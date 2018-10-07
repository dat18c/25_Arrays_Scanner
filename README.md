# 25_Arrays_Scanner

## Menu
Hvordan laver man en menu, som brugeren kan vælge ud fra?

Brug mønsteret, hvor en løkke gør noget indtil en boolsk variabel sættes til falsk
````
// run er sand så længe programmet skal køre
boolean run = true;

//check om programmet skal køres
while (run)
{
   
   // skriv menu og lad brugeren vælge vha. Scanner
   // afhængigt af valg startes forskellige underprogrammer
   if (valg == 1)
   {
     //kald første valgmulighed
   }
   
   else if (valg == 0)
   {
      // exit hvis brugeren taster 0
      run = false;
   }
}
````

## Arrays

* Array af primitiv datatype eller String
* Array på objekter, eg.
````
// lav først arrayet, so kan indeholde objekter af typen
Studerende[] stud = new studerende[3];

// traverser arrayet og læg studerende ind i arrayet
for (int i=0; i<stud.length; i++)
{
   //lav objektet til stud[i]
   stud[i] = new Studerende("Rap And", "Andedammen");
}
// alle studerende er nu initialiseret og gemt i arrayet

// lav om på studerende 2
stud[2].setNavn("Anders And");

// udskriv alle studerende vha. toString
for (int i=0; i<stud.length; i++)
{
   System.out.println(stud[i]);
}
````

## Øvelser

Lav et program, der læser 4 double, gemmer dem i et array og bagefter går arrayet igennem for at beregne gemmesnit (brug en forløkke til at fylde og en anden til at beregne gennemsnit

Ændr programmet, så det først spørger, hvor mange tal brugeren vil indtaste.

Brug Scanner til at input af oplysninger om studerende. Kan være en god ide at nøjes med et par studerende i stedet for 10.

Reges p. 548-549 ex. 1 - 3. Ex. 4 er en god udfordring (hint: check på to forskellige indeks i arrayet).

Lav en menu til jeres program, der kalder jeres underprogrammer/handlinger, som skal kunne foretages
