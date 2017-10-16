
package dices;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Manual {
  

   FileReader fr = null;
   public String linia = "";

   // OTWIERANIE PLIKU:
   
   public void ReadManul(){
   try {
     fr = new FileReader("D:\\manual.txt");
   } catch (FileNotFoundException e) {
       System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
       //System.exit(1);
   }

   BufferedReader bfr = new BufferedReader(fr);
   // ODCZYT KOLEJNYCH LINII Z PLIKU:
   try {
     while((linia = bfr.readLine()) != null){
        System.out.println(linia);
     }
    } catch (IOException e) {
        System.out.println("BŁĄD ODCZYTU Z PLIKU!");
        //System.exit(2);
   }

   // ZAMYKANIE PLIKU
   try {
     fr.close();
    } catch (IOException e) {
         System.out.println("BŁĄD PRZY ZAMYKANIU PLIKU!");
         //System.exit(3);
    }
   
        }
   
    }

    
