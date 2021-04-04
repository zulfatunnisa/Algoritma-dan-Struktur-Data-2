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
public class binary {
    public static void main(String[] args) {
        System.out.println("\t" + "***** BINARY SEARCH *****" +"\n");
        int B[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Data Yang Akan Dicari : ");
        int cari = input.nextInt();
        
        int indeksawal = 0;
        int indeksakhir = B.length - 1;
        int ketemu = 0;
        int point = 0;
        
        System.out.println("Isi Data Adalah : ");
        for (int i = 0; i<B.length; i++){
            System.out.print(B[i] +" ");
        }
        System.out.println("");
        System.out.println("");
        
        while ((indeksawal <= indeksakhir) && (ketemu== 0)){
        point = (indeksawal + indeksakhir) / 2;
        System.out.println("Indeks Pointer : "+ point);
            
            if(cari == B[point]){
                ketemu = 1;
                System.out.println("Data " +cari + " Telah Ditemukan pada Indeks ke "+ point);
        }
            else if (cari < B[point]){
                System.out.println("Cari dikiri ");
                indeksakhir = point - 1;
            }
            
            else {
                indeksawal = point + 1;
                System.out.println("Cari dikanan ");
            }
    }
        
        if (ketemu == 1)
            System.out.println("Kesimpulan : Data Ditemukan ");
        else
            System.out.println("Kesimpulan : Data Tidak Ditemukan ");
        
        System.out.println();
        System.out.println("***** Zulfatun Nisa *****");
    }
}

    

