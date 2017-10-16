/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dices;

import java.util.Random;

/**
 *
 * @author dpk
 */
public class DiceGen {
    
      int r1, r2 ,r3, r4, r5;
     
          public int d1(){  
        Random d = new Random();
        r1=d.nextInt(6)+1;
        return r1;
}     
       public int d2(){            
       Random d2 = new Random();
        r2=d2.nextInt(6)+1;
        return r2;
       }
       
       public int d3(){   
        Random d3 = new Random();
        r3=d3.nextInt(6)+1;
        return r3;
       }
       
        public int d4(){ 
        Random d4 = new Random();
        r4=d4.nextInt(6)+1;
        return r4;
        }
        
        public int d5(){ 
        Random d4 = new Random();
        r4=d4.nextInt(6)+1;
        return r4;
        }
    
    
    
}
