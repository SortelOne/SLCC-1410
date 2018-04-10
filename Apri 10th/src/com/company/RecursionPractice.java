package com.company;

public class RecursionPractice {

    public static void r(int count){
        if(count<0){
            return;
        }
        System.out.println(count);
        r(count-1);
        System.out.println(count);
    }

    public static int pow(int exp, int base, int ans){
        if(exp<=0)
            return ans;
        else return pow(exp-1, base , ans*base);
    }

    public static long factorial(int n){
        if(n==0)
            return n;
        else
            return n*factorial(n-1);
    }

    public static long fibonacci(long index){
        if(index==0)
            return 0;
        else if(index == 1)
            return 1;
        else return +fibonacci(index-2)+fibonacci(index-1);
    }
    public static void main(String[]args){
        r(5);
        pow(2, 3, 4);
        factorial(5);
        fibonacci(20);
    }
}
