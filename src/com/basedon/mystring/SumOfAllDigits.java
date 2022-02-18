package com.basedon.mystring;

public class SumOfAllDigits {
    static void checkArmstrongNumber(int number)
    {
        int copyOfNumber = number;
 
        int noOfDigits = String.valueOf(number).length();
 
        int sum = 0;
 
        while (copyOfNumber != 0)
        {
            int lastDigit = copyOfNumber % 10;
 
            
 
            sum = sum + lastDigit;
 
            copyOfNumber = copyOfNumber / 10;
        }
        
        //System.out.println("Sum \n"+sum);
    }
    
    
    // using recursive method 
    int sum=0;
    int sumOfAllDigits(int inputNumber)
    {
        if(inputNumber == 0)
        {
            //if input number is 0, returning sum
 
            return sum;
        }
        else
        {
            //Getting last digit of input number
 
            int lastDigit = inputNumber%10;
 
            //Adding last digit to sum
 
            sum = sum + lastDigit;
 
            //Removing last digit from input number
 
            inputNumber = inputNumber/10;
 
            //Calling the function recursively
 
            sumOfAllDigits(inputNumber);
        }
 
        return sum;
    }
    public static void main(String[] args) {
	checkArmstrongNumber(234);
	SumOfAllDigits sumoF= new SumOfAllDigits();
	System.out.println(sumoF.sumOfAllDigits(567));
	
	
    }

}
