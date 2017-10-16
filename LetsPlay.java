/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dices;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dpk
 */
public class LetsPlay {
    
    public int result1, result2, result3, result4, result5;
    
        
    public void GameBody(){
    
  
   
        DiceGen Dice = new DiceGen();

        result1 = Dice.d1();
        result2 = Dice.d2();
        result3 = Dice.d3();
        result4 = Dice.d4();
        result5 = Dice.d5();
        

        String ThrowAns;
         System.out.println("Your Dices!");
         System.out.println("Dice:   I   II   III   IV   V");
         System.out.println("Note:   "+result1+ "   "+result2+ "    "+result3+ "     "+result4+ "    "+result5);
         

         System.out.println("Do You want to throw again?  (y/n)" );

         Scanner ThrowInp = new Scanner(System.in);
         ThrowAns = ThrowInp.nextLine();
         System.out.println(ThrowAns);
         
//while(0==0){
        if (ThrowAns.equals("y")){
try{               
         for(int count = 0; count<2;count++){

             if(count<2){

                 System.out.println();
                 System.out.println();
                 System.out.println("How many dices do You want to rethrow? (1-4)");
                 System.out.println("If You are finished press '0' zero");

         Scanner HowMany = new Scanner(System.in);
              int howManyVal;

              
           howManyVal=HowMany.nextInt();

           if(howManyVal <5){
           if(howManyVal==0){
         System.out.println();
         System.out.println(); 
         
         System.out.println("==================================");
         System.out.println("Your Dices!");
         System.out.println("Dice:   I   II   III   IV   V");
         System.out.println("Note:   "+result1+ "   "+result2+ "    "+result3+ "     "+result4+ "    "+result5);
         System.out.println("==================================");
         break;
                        }

           else  if (howManyVal> 0 || howManyVal<5){
               //System.out.flush();
              //  System.out.println("how many   " +howManyVal);
                      //System.out.println("wityh dice");
                      for(int i =0;i <howManyVal;i++ ){

                         // System.out.println("wityh dice");


                    Scanner DiceNum = new Scanner(System.in);
                          int reThrow;
                     
                         System.out.println("Enter witch dice (1-5)");
                          reThrow =DiceNum.nextInt();
                     
                            switch (reThrow) {
                                case 1:
                                    result1 = Dice.d1();
                                    break;
                                case 2:
                                    result2 = Dice.d2();
                                    break;
                                case 3:
                                    result3 = Dice.d3();
                                    break;
                                case 4:
                                    result4 = Dice.d4();
                                    break;
                                case 5:
                                    result5 = Dice.d5();
                                    break;
                                default:
                                    break;
                            }
                           
                    }
         System.out.println();
         System.out.println(); 
         System.out.println("==================================");
            if (count==0)
                System.out.println("       SECOND THROW"); 
            else if (count==1)
                    System.out.println("       THIRD THROW"); 
            /*else if (count==2)
                    System.out.println("       FOURTH THROW"); 
*/
                
        System.out.println(); 
            System.out.println("Your Dices!");
         System.out.println("Dice:   I   II   III   IV   V");
         System.out.println("Note:   "+result1+ "   "+result2+ "    "+result3+ "     "+result4+ "    "+result5);
         System.out.println("==================================");
                     }
           
              }
              else {
                  System.out.println();
                  System.out.println("  TRY AGAIN ");
                  count-=1;
              }
           }
         
                             else{
                             System.out.println("Correct your input!");
               
              }
   
         }
         
         
          }
                     catch(InputMismatchException exception){
                          System.out.println("This is not an integer");
                          
                      }
        }

        else if("n".equals(ThrowAns)){
         
         System.out.println();
         System.out.println();
         System.out.println("==================================");
         System.out.println("Your Dices!");
         System.out.println("Dice:   I   II   III   IV   V");
         System.out.println("Note:   "+result1+ "   "+result2+ "    "+result3+ "     "+result4+ "    "+result5);
         System.out.println("==================================");
//break;
            }
        else {
            System.out.println();
            System.out.println("    TRY AGAIN!  y/n");
        }
               
//}

    }
    public void Score  (){
        
        int sc=0;
                
                            if (result1==result2&&result3==result4&&result2==result3&&result4==result5){
                               sc=1000; 
                            }
                            if (result1==result2&&result3==result4&&result2==result3){
                                sc=500;
                            }
                            if (result1==result2&&result3==result4&&result2==result3){
                                sc=500;
                            }
                            
   
        
        
    }
    
}
