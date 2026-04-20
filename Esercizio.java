//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
        //Variabili del programma
        String nome;

        //Creo l'oggetto in per l'input da tastiera
        Scanner in = new Scanner( System.in );

        while (true) {
            //Leggo l'input da tastiera
            System.out.print("Inserisci una parola (x per uscire): ");
            nome = in.nextLine();

            if (nome.equals("x")) {
                System.out.println("Programma terminato.");
                
            }

            //Output del nome acquisito da tastiera
            if (isPalindroma(nome)) {
                System.out.println("\"" + nome + "\" è palindroma!\n");
            } else {
                System.out.println("\"" + nome + "\" NON è palindroma.\n");
            }
        }

        
    }

    public static boolean isPalindroma(String parola) {
        Pila<Character> pila = new Pila<>();

        for (int i = 0; i < parola.length(); i++) {
            pila.push(parola.charAt(i));
        }

        String inversa = "";
        while (!pila.isEmpty()) {
            inversa += pila.pop();
        }

        return parola.equals(inversa);
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md