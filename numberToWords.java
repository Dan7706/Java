import java.io.*;
import java.lang.*;
import static java.lang.Math.*;
import java.util.Scanner;


class Main
{
    public static void main (String[] args)
    {
        Solution sol = new Solution();
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = myObj.nextInt();
        //int number = 2147483647;
        System.out.println(sol.numberToWords(number));

        //myObj.close();
    }
}


class Solution
{
    static String[] ones = {"", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine",  " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen",  " Eighteen", " Nineteen"};

    static String[] tens = {"", " Ten", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety"};
    
    static String[] thousands = {"", " Thousand", " Million", " Billion"};

    public static String helper(int n) 
    {
        if (n < 20)
        {
            return ones[n];
        }
        if (n < 100)
        {
            return tens[n / 10] + helper(n % 10);
        }
        if (n < 1000) 
        {
            return helper(n / 100) + " Hundred" + helper(n % 100);
        }
        for (int i = 3; i >= 0; i--)
        {
            if (n >= Math.pow(1000, i))
            {
                return helper((int)(n / Math.pow(1000, i))) + thousands[i] + helper((int)(n % Math.pow(1000, i)));
            }
        }
        return "";
    }

    public static String numberToWords(int num)
    {
        if (num == 0)
        {
            return "Zero";
        }
        return helper(num).substring(1);
    }

}

