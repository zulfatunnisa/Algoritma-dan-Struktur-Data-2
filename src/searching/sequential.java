/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class sequential {
    public static void main(String[] args) {
        System.out.println("\t" + "***** SEQUENTIAL SEARCH *****" +"\n");
        String data[] = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", "Zulfa", "Tesla"};
        String key;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Data Yang Akan Dicari : ");
        key = input.nextLine();
        
        System.out.print("Isi Data Adalah : ");
            for (int i = 0; i<data.length; i++){
                System.out.print(data[i] + " ");
            }
        System.out.println("");
        System.out.println("");
        for (int i = 0; i<data.length; i++){
            if (key.equalsIgnoreCase(data[i])){
                System.out.print("Data " + key + " Berada di Indeks ke-" +i);
                break;
            }
        }
        System.out.println("\n");
        System.out.println();
        System.out.println("***** zulfatun nisa*****");
    }    
}


    

