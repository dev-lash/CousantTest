/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cousanttest;

import java.util.Arrays;

/**
 *
 * @author -
 */
public class CousantTest {

    /**
     * @param args the command line arguments
     */
    
    
    public void encrypt(String word)
    {
        char [] letters = word.toCharArray();
        
        char [] check = {'Á','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char [] check1 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int [] take = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
        
        for(int i = 0; i < letters.length; i++)
        {
            for(int j = 0; j < check.length; j++)
            {
                if(letters[i] == check[j] || letters[i] == check1[j])
                {
                    int a = take[j];
                    
                    if(a % 2 == 0)
                    {
                        System.out.print("e" + a/2);
                    }
                    else
                    {
                        int p = (a * 3) + 1; 
                        System.out.print("o" + p);
                    }
                }
            }
        }
        
       
                
        
        

    }
    
    
    public void decrypt(String word)
    {
        
        
        char [] check = {'Á','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int [] take = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
        
        String [] letterO = word.split("o");
        
        
//        System.out.println(Arrays.toString(letterO));
        
        for(int i = 0; i < letterO.length; i++)
        {
            
            if(letterO[i].contains("e"))
            {
                String [] letterE = letterO[i].split("e");
                
                
                for(int z = 0; z < letterE.length; z++)
                {
                    if("".equals(letterE[z]))
                    {
                    }
                    else
                    {
                        int m = Integer.parseInt(letterE[z]);
                
                        int n = m*2;
                        
                        for(int y = 0; y < take.length; y++)
                        {
                            if(n == take[y])
                            {
                                System.out.print(check[y]);
                            }
                        }
                
//                        System.out.println(n);
                        
                        
                    }
                    
                }
                                
            }
            else
            {
                if("".equals(letterO[i]))
                {
                    
                }
                else
                {
                    int b = Integer.parseInt(letterO[i]);
                
                    int c = (b-1)/3;
                    
                    for(int y = 0; y < take.length; y++)
                    {
                        if(c == take[y])
                        {
                            System.out.print(check[y]);
                        }
                    }
                
                    
//                    System.out.println(c);
                    
                }
                                
            }
            
            
        }
                    
   
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        CousantTest t = new CousantTest();
        
        t.decrypt("e13o28e7o46");
        
//        t.encrypt("ZInO");
        
    }
    
}
