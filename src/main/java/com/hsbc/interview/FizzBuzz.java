package com.hsbc.interview;

public class FizzBuzz {
    public static void main(String arg[]){
        for (int i = 0; i <= 100; i++){
            System.out.println(fizzBuzz(i));
        }
    }

    public static String fizzBuzz(int i){
    String str = "";
        if (i%3 == 0){
            str = "Fizz";
            if(i%5 == 0){
                str = "FizzBuzz";
            }
        } else if (i % 5 == 0) {
            str = "Buzz";
        }else {
            str = Integer.toString(i);
        }
        return str;
    }

}
