package hb;

import com.sun.source.tree.Scope;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

/**
 * @author Raphael Paquin
 * @version 01
 * 2024-09-09
 */
public class Main {

    public static int Quiz() {
        int resultat = 0;
        try {
            File fichier = new File("src/main/resources/input.txt");
            Scanner lecteur = new Scanner(fichier);

            while (lecteur.hasNextLine()) {
                String ligne = lecteur.nextLine();
                System.out.println(ligne);
                StringBuilder num = new StringBuilder();


                for (char c : ligne.toCharArray()) {
                    if (Character.isDigit(c)) {
                        num.append(c);
                    }
                }

                resultat += Integer.parseInt(String.valueOf(num.toString().charAt(0)) + num.toString().charAt(num.length() - 1));
            }

            lecteur.close();
        } catch (FileNotFoundException e) {
            System.out.println("Le fichier n'a pas été trouvé.");
        }
        return resultat;
    }

    public static void main(String[] args) {
        int result = Quiz();
        if (result == 54159) {
            System.out.println("BRAVO");;
        } else {
            System.out.println("Incorrect answer: " + result + " The expected output is 54159");
        }
    }
}