/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicolas
 */
  import java.util.Scanner;
public class movieNoSave {
    
  
    
    public static void main(String[] args) {
        
    int length;
    Scanner input = new Scanner(System.in);
        System.out.println("How long a list");
        length=input.nextInt();
        for (int d = 0; d < length; d++) {
            System.out.println("Movie?");
            System.out.println(input.next());
            
        }
    
}
}
