package recursion;

import java.util.Scanner;

public class fib {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();

        int ans =fibo(n);
    }

    public static int fibo(int n){
        if(n==0||n==1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
