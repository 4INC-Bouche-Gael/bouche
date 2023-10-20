/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trycatch;

import java.util.Scanner;

/**
 *
 * @author gael.bouche
 */
public class TryCatchTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println(5/0);
        //codice dopo non viene eseguito perchè da errore
        //Utilizzo il trycatch per far proseguire il programma
        /*
        
        
        Scanner in = new Scanner(System.in);
        
        try {//inserire il comando da provare 
            System.out.println("inserisci il dividendo:");
            int dividendo = in.nextInt();
            System.out.println("inserisci il divisore:");
            int divisore = in.nextInt();
            
            int divisione = dividendo / divisore;

            int[] vett = {1,2,3};
            for (int i = 0; i < 3; i++) {
                System.out.println(vett[i]);
            }
            
        } catch (ArithmeticException e) {
            //possono esserci più exception per ogni try per indirizzare meglio l'errore
            //se voglio inserire più exception la generica deve essere messa per ultima (perche racchiude le altre)
            //conviene mettere sembre l'exceprion generico perchè potrebbe esserci un errore che non avevo considerato
            System.err.println("Impossibile dividere per 0");
            
        }   catch (ArrayIndexOutOfBoundsException e){
            System.err.println("oltre la lunghezza del vettore");
            
        }   catch (Exception e){
            System.err.println("Errore generico");
        }
        
        */
       
        //gestione di più errori simultanemente
        
        Scanner in = new Scanner(System.in);
        
        try {//inserire il comando da provare 
            System.out.println("inserisci il dividendo:");
            int dividendo = in.nextInt();
            System.out.println("inserisci il divisore:");
            int divisore = in.nextInt();
            
            int divisione = dividendo / divisore;           
            
        } catch (ArithmeticException e) {
            System.err.println("Impossibile dividere per 0");
            
        }   catch (Exception e){
            System.err.println("Errore generico");
        
        }        
        try {
            int[] vett = {1,2,3};
            for (int i = 0; i < 3; i++) {
                System.out.println(vett[i]);
            }
            
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("oltre la lunghezza del vettore");
            
        } catch (Exception e){
            System.err.println("Errore generico");
        
        }
    }
       
}
