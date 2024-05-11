package org.example.oop;

public class FindDivisor {
    public static void main(String[] args) {
        int n = 1000;
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                sum += i;
                //1+2+3+6
            }
        }
        System.out.println(sum);
    }
}
