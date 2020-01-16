/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class MoviesListObject {
    public static void main(String[] args) {
        
     
       
   
    
    int x;
    Scanner input= new Scanner(System.in);
    System.out.println("How long of a list?");
     x=input.nextInt();
 Movies movies[] = new Movies[3];
      
       

       
    
       
     for (int i = 0; i < movies.length; i++) {
             System.out.println("Enter Next Movie");
             movies[i] = new Movies();
             movies[i].addTitle(input.next());
 
            
        }
        System.out.println("All movies entered");
        
        System.out.println("");
        
        System.out.println("Your List:");
       
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i].getTitle());
            
        }
    }
    
    
    }
    

