package org.example.loops;

import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        StringBuffer s=new StringBuffer();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            //a + (2^n-1 + b)+...
            //a=0,b=2,n=10
            int result=0;
            for( int e=0;e < n;e++){
                if(e==0){
                    int exp=(int)Math.pow(2, e) * b;
                    result = a+exp;

                    s.append(String.format("%-1d", result));
                    result=0;
                }else{
                    int j=0;
                    while( j <= e){
                        int exp=(int) Math.pow(2,j)* b;
                        result +=exp;
                        j++;
                    }
                    result += a;
                    s.append(" "+result);
                    result=0;
                }

            }
            System.out.println(s);
            s=new StringBuffer();
        }
        in.close();
    }
}
//testcase 1
//    2
//
//    0 2 10
//
//    5 3 5

//testcase2
//    3
//
//    3 3 3
//
//    0 0 5
//
//    6 6 10

