package com.company;



public class Main {

    public static void main(String[] args) {



        int num = 1979;


        int count = 0 ;

        while(num>0) {


            int rem = num % 10;


            if(rem == 3) {

                count = count +  1 ;

            }

            num = num/10;

        }


        System.out.println(count);

    }
}
