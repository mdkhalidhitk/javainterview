package com.basedon.mystring;

import java.util.Arrays;

public class EqualityOfTwoArrays
{
    public static void main(String[] args)
    {    
        int[] arrayOne = {2, 5, 1, 7, 4};
         
        int[] arrayTwo = {2, 5, 1, 7, 6};
         
        boolean equalOrNot = true;
         
        if(arrayOne.length == arrayTwo.length)
        {
            for (int i = 0; i < arrayOne.length; i++)
            {
                if(arrayOne[i] != arrayTwo[i])
                {
                    equalOrNot = false;
                }
            }
        }
        else
        {
            equalOrNot = false;
        }
         
        if (equalOrNot)
        {
           // System.out.println("Two Arrays Are Equal");
        }
        else
        {
           // System.out.println("Two Arrays Are Not equal");
        }
        
        // for String Array 
        String abc="khalid~1~";
        System.out.println(abc.split("~"));
        String[] s11 = {"java", "j2ee", "struts", "hibernate"};
        
        String[] s22 = {"jsp", "spring", "jdbc", "hibernate"};
 
        String[] s3 = {"java", "j2ee", "struts", "hibernate"};
 
       // System.out.println(Arrays.equals(s1, s2));        //Output : false
 
       // System.out.println(Arrays.equals(s1, s3));      //Output : true
        
        String[] s1 = {"java", "swings", "j2ee", "struts", "jsp", "hibernate"};
        
        String[] s2 = {"java", "struts", "j2ee", "hibernate", "swings", "jsp"};
 
        Arrays.sort(s1);
 
        Arrays.sort(s2);
 
      //  System.out.println(Arrays.equals(s1, s2));  
        
        
        // Muliti dimision Array 
        
        String[][] s13 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
        
        String[][] s23 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
 
        System.out.println(Arrays.deepEquals(s13, s23));     //Output : true
         
        //Calling equals() method on same arrays will return false
         
        System.out.println(Arrays.equals(s13, s23)); 
        
        
        
        
    }
}
