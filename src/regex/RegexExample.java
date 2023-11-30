/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author gaelb
 */
public class RegexExample {

    public static void main(String[] args) {
        // Definisci la tua espressione regolare
        String regex = "[a-zA-Z]+"; // Ad esempio, verifica se la stringa contiene solo lettere

        // Crea il pattern
        Pattern pattern = Pattern.compile(regex);

        // Stringa da controllare
        String inputString = "Hello";

        // Crea il matcher
        Matcher matcher = pattern.matcher(inputString);

        // Controlla se la stringa rispetta la regex
        if (matcher.matches()) {
            System.out.println("La stringa rispetta l'espressione regolare.");
        } else {
            System.out.println("La stringa non rispetta l'espressione regolare.");
        }
    }
}
