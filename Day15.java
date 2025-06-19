
// Problem Link : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/add-binary-strings3805

import java.util.*;
public class Day15 {
    public static void main(String[] args) {
        String a = "1010"; // Example binary string, you can change it to test with different inputs
        String b = "1101"; // Example binary string, you can change it to test with different inputs
        System.out.println("Sum of binary strings: " + addBinary(a, b));
    }

    static String addBinary(String s1, String s2) {
        StringBuilder str= new StringBuilder();
        
          int n=s1.length(),m=s2.length();
            int i=n-1,j=m-1;
            int carry=0;
          while(i>=0 && j>=0)
          {
             if(s1.charAt(i)=='1' && s2.charAt(j)=='1')
             {
               if(carry==0)
               {
                   str.append('0');
                   
               }
               else
               {
                   str.append('1');
               }
               carry=1;
             }
            else if(s1.charAt(i)=='0' && s2.charAt(j)=='0')
             {
                 if(carry==0)
               {
                   str.append('0');
                   
               }
               else
               {
                   str.append('1');
               } 
                carry=0;
             }
             else
             {
                  if(carry==0)
               {
                   str.append('1');
                   carry=0;
                   
               }
               else
               {
                   str.append('0');
                   carry=1;
               }
              
             }
           i--;
           j--;
          }
      while(i>=0)
      {
          if(s1.charAt(i)=='0')
          {
             if(carry==0)
               {
                   str.append('0');
                   
               }
               else
               {
                   str.append('1');
               }   
               carry=0;
          }
          else
          {
           if(carry==0)
               {
                   str.append('1');
                  
                   
               }
               else
               {
                   str.append('0');
                   carry=1;
               }      
          }
         i--;
      }
      while(j>=0)
      {
          if(s2.charAt(j)=='0')
          {
             if(carry==0)
               {
                   str.append('0');
                   
               }
               else
               {
                   str.append('1');
               }   
               carry=0;
          }
          else
          {
           if(carry==0)
               {
                   str.append('1');
                  
                   
               }
               else
               {
                   str.append('0');
                   carry=1;
               }      
          }
         j--;
     }
     if(carry==1)
     {
          str.append('1');
     }
    
      for(int k=str.length()-1;k>=0;k--)
      {
          if(str.charAt(k)=='1')
         {
             break;
         }
         else
         {
             str.deleteCharAt(k);
         }
      }
      
      return str.reverse().toString();
    }
}