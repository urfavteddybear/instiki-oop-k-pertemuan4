/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array1dimensi;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Array1Dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] nama = new String[5];
        
        nama[0] = "Budi";
        nama[1] = "Anjay";
        nama[2] = "Uhuy";
        nama[3] = "asdlsad";
        nama[4] = "asdlsadasdas";
        
        Scanner inp = new Scanner(System.in);
        
        for(int idx=0; idx<5; idx++ ){
            System.out.print("Data orang ke-"+String.valueOf(idx+1)+": ");
            nama[idx] = inp.nextLine();
        }
        
//        String NamaTeman = nama[2];
//        System.out.printf("Data Nama: %s",nama[2]);
        
        //Menampilkan data Array dengan perulangan For
        
        for(int idx=0; idx<5; idx++ ){
            System.out.println("Nama ke-"+(idx+1)+":"+nama[idx]);
//            nama[idx] = inp.nextLine();
        }
        
        for(String nm : nama){
            System.out.println(nm);
        }
    }
    
}
