public class AugabeUebung2 {
    public static void main(String[] args)
    {
        for (int i = 1; i<6; i++)
        {
            printName();
            printAge();
        }

    }

    public static void printName()
    {
        String meinName = "Theresa";
        System.out.println(meinName);
    }
/*Benutze ich i+=2 statt i++ wird mir der wert nur zweimal anstatt der erwünschten dreimal ausgegeben.
  Mit i+=2 wird der wert erhöht bis er den wert 2 erreicht hat..*/

//Aufgabe 3

    public static void printAge()
    {
        System.out.println("Alter des Entwicklers ist " + AufgabeUebung1.alter);

    }
}
