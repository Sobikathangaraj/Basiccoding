import java.util.*;
//24    2^1/4! + 2^2/4! +  2^3/4! + 2^4/4!
public class Taylor_Series {
    public static void main(String[] args) {
      int n=24;
      int factor=n%10;  //4
      int start=n/=10;   //2
      int value=1;
      int result=0;

      recursion(factorial(factor),start,value,result);
    }
    public static int factorial(int factor){
           if(factor==0) return 0;
           return factorial(factor-1);
    }
    public static void recursion(int factor,int start,int value,int result)
    {
        if (value>factor) return;
         result +=((int)(Math.pow(start,value))/factor);
        recursion(factorial(factor),start,value+1,result);
        System.out.println(result);
    }
}
