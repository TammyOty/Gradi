
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {



        /*
        Scrivere un programma che permetta all’utente di convertire una temperatura fornita in gradi
da Celsius a Fahrenheit e viceversa. Le formule sono:
gradi_Celsius = 5 (gradi_Fahrenheit - 32) / 9
gradi_Fahrenheit = (9 (gradi_Celsius) / 5) + 32
Nel codice dobbiamo usare una variabile di tipo char che deve contenere le lettere "C" o "c"
per Celsius e "F" o "f" per i Fahrenheit, in modo tale che sia questa variabile ad indirizzare il
programma nella scelta della formula corretta di conversione.
Ad esempio se imposto la variabile a "C" (oppure “c”) e gradi a 35, significa che voglio
convertire i 35 gradi Celsius in gradi Fahrenheit. Quindi si converte la temperatura in gradi
Fahrenheit se si inseriscono i Celsius e viceversa. Se vengono digitate lettere diverse da C,
c, F o f, si mostri un messaggio che riporta l'inserimento di una lettera non corretta.
Il programma puo' essere scritto usando lo switch

         */

        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scegli il tipo di conversione \n 1 - Digita 'c' : Da Fahrenheit a Celsius \n 2 - Digita 'f' Da Celsius a Fahrenheit");
        String scelta = scanner.next();

        switch(scelta){
            case "c":
            case "C":
                System.out.println("Digita una temperatura in Fahrenheit");
                a = scanner.nextInt();
                b=(a-32) * 5 / 9;
                System.out.println("La temperatura in celsuis è: " + b );
                break;

            case "f":
            case "F":
                System.out.println("Digita una temperatura in Celsius");
                b = scanner.nextInt();
                a = (b / 5 ) * 9 + 32;
                System.out.println("La temperatura in Fahrenheit è: " + a);
                break;
            default:
                System.out.println("Scegli un carattere valido");

        }
    }
}
