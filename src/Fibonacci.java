import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        // Fibonnaci series - 0,1,1,2,3,5,8,13.....
        // By recursion Method   -> Base condition
        System.out.println(fibo(8));
    }
    static int fibo(int n){

        if(n<2) return n;
        return fibo(n-1)+fibo(n-2);

    }

}