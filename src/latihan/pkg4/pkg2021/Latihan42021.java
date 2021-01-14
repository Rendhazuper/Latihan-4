/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg4.pkg2021;
import java.util.*;
/**
 *
 * @author GAMES
 */
public class Latihan42021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      int bil, hasil; 
        System.out.println("Masukan suatu bilangan : ");
        bil = input.nextInt();
        hasil = faktorial(bil);
        System.out.println("Nilai faktorial "+ bil +" adalah "+hasil);
        
    }
    private static int faktorial (int a){
        if (a == 1){
            return 1; 
          
    } else 
            return (a*faktorial(a-1));
}
}
