import javax.swing.*;

public class AufgabeUebung1 {


    static int alter = 19 ;

    public static void main(String[]args){



        String wert1 = JOptionPane.showInputDialog("Bitte geben sie etwas ein.");

        switch(wert1){

            case "20":
                int i = Integer.parseInt(wert1)*alter;
                JOptionPane.showMessageDialog(null, i);
                break;

            case "Peter Pan":
                JOptionPane.showMessageDialog(null,"Bangarang");
                break;

            default:
                System.err.println("SORRY DAS WAR FEHLERHAFT!");
        }
    }
}
