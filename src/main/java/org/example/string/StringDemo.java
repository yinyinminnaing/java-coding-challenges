package org.example.string;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());

        int r=A.compareTo(B);
        if(r > 0){
            System.out.println("Yes");
        }else if(r <= 0){
            System.out.println("No");
        }
        String firstWord=A.substring(0, 1).toUpperCase().concat(A.substring(1));

        String secondWord=B.substring(0, 1).toUpperCase().concat(B.substring(1));
        System.out.println(firstWord+" "+secondWord);
    }
}
