package dices;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Dices {
  
    public static void main(String[] args)  {

        
        System.out.println();
        System.out.println("Welcome in:");
        System.out.println();
        
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("|~~~~~~~~~~~           ~~~~~~~~~~~|");
        System.out.println("|~~~~~~      THE DICES      ~~~~~~|");
        System.out.println("|~~~~~~~~~~~           ~~~~~~~~~~~|");
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println();
      
        System.out.println("If You want to Start Press 1. You want to read the manual press 0 (zero) ");
        
       int s;
       Scanner sInp = new Scanner(System.in);
       s=sInp.nextInt();
       
       if (s==0){
          Manual man = new Manual();
           // String linia = man.linia;
            FileReader fr = null;
            String linia = "";
            // OTWIERANIE PLIKU:
            try {
            fr = new FileReader("D:\\plik.txt");
            } catch (FileNotFoundException e) {
            System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
            System.exit(1);
            }
            BufferedReader bfr = new BufferedReader(fr);
            // ODCZYT KOLEJNYCH LINII Z PLIKU:
            try {
            while((linia = bfr.readLine()) != null){
            System.out.println(linia);
            }
            } catch (IOException e) {
            System.out.println("BŁĄD ODCZYTU Z PLIKU!");
            System.exit(2);
            }
            // ZAMYKANIE PLIKU
            try {
            fr.close();
            } catch (IOException e) {
            System.out.println("BŁĄD PRZY ZAMYKANIU PLIKU!");
            System.exit(3);
            }
    }
          
          
       
       
        
        
        System.out.println();
        //System.out.println("How many players??? max 4");
        
        int pls = 0;
        
        while (pls==0){
            System.out.println("How many players??? max 4");
        try{
            
        Scanner plsInp = new Scanner(System.in);
        pls=plsInp.nextInt();
        }
        catch (InputMismatchException e){
       //throw new InputMismatchException(){
            System.out.println("buu  "+e);
        }
        }
        
        System.out.println(pls+ " Players. Lets start he game!");
        
        
        for(int i =1; i<=pls;i++){
            System.out.println();
            System.out.println(); 
         
            System.out.println("====================================================================");
            System.out.println(); 
            System.out.println("                           PLAYER no. "+i);
            System.out.println(); 
            System.out.println("====================================================================");
            
            if(i==1){          
            LetsPlay p1 = new LetsPlay();
            p1.GameBody();
            }
            if(i==2){          
            LetsPlay p2 = new LetsPlay();
            p2.GameBody();
            }
            if(i==3){          
            LetsPlay p3 = new LetsPlay();
            p3.GameBody();
            }
            if(i==4){          
            LetsPlay p4 = new LetsPlay();
            p4.GameBody();
            }
            //else
              //  System.out.println("MAX 4 PLAYERS!!! Try Again");
             
       
        }
                   
    }
}






