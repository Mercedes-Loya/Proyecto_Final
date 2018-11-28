/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mloya.controlador;

import com.mloya.vista.Book;
import com.mloya.vista.Magazine;
import com.mloya.vista.Movie;
import com.mloya.vista.Series;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author MARIA LOYA
 */
public class Coordinador {
    Movie movie= new Movie(this);
    Series series= new Series(this);
    Book book= new Book(this);
    Magazine magazine = new Magazine(this);
    
    public void showMenu(){
        
      int exit=0;
        do { 
            System.out.println("Bienvenidos a Netflix viewer");
            System.out.println("Selecciona una opcion: \n"
                               +"1.- Books \n"
                               +"2.- Magazine \n"
                               +"3.- Movies \n"
                               +"4.- Series \n"
                               +"\n ---------------------\n"
                               +"5.- Report \n"
                               +"6.- Report today \n"
                               +"0.- Exit");
            // leer la respuesta del ususario
            Scanner input =new Scanner(System.in);
            int response=input.nextInt();
            switch(response){
                case 0:
                    //salir
                    break;
                    
                case 1:
                    showBooks();
                    break;
                    
                    
                case 2: 
                    showMagazine();
                    break;
                    
                case 3: 
                  
                    showMovies();
                    break;
                    
                case 4: 
                    showSeries();
                    break;
                    
                case 5: 
                    makeReport();
                    break;
                    
                    
                case 6: 
//                    Date date = new Date();
                    makeReport(new Date());
                    break;
                    
                default:
                    System.out.println("");
                    System.out.println(".....¡Selecciona una opcion......!");
                    System.out.println("");
                    
                    break; 
            }
            
        } while (exit !=0);
           
    }
    private  void showMovies(){
//        int exit =0;
//        do { 
//            System.out.println("");
//            System.out.println("::MOVIES ::");
//            System.out.println("");
//            
//        } while (exit !=0);
            movie.setVisible(true);
    }
       
     private  void showSeries(){
//        int exit =0;
//        do { 
//            System.out.println("");
//            System.out.println("::SERIES ::");
//            System.out.println("");
//            
//        } while (exit !=0);
         series.setVisible(true);
    }
      private static void showChapter(){
        int exit =0;
        do { 
            System.out.println("");
            System.out.println("::CHAPTER ::");
            System.out.println("");
            
        } while (exit !=0);
    }
       private  void showBooks(){
//        int exit =0;
//        do { 
//            System.out.println("");
//            System.out.println("::BOOKS ::");
//            System.out.println("");
//            
//        } while (exit !=0);
         book.setVisible(true);
    }
        private  void showMagazine(){
//        int exit =0;
//        do { 
//            System.out.println("");
//            System.out.println("::MAGAZINE ::");
//            System.out.println("");
//            
//        } while (exit !=0);
          magazine.setVisible(true);
    }
         private static void makeReport(){
        
  
    }
        private static void makeReport(Date date){
            
        }
    
    
    
    
    
    
    
}
