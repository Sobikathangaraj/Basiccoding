import java.util.*;
public class SumOfOriginal_Modified {    // 1325467
    public static void main(String[] args) {
        int n = 1325;                                     //246  1357
        int count=1;
        int n1=n;
        while(n>10)
        {
              count *=10;     // 456
              n=n/10;
        }
        //System.out.println(count);
       // System.out.println(n1);
        int even=0;
        int odd=0;
        while(n1!=0)
        {
            int digit=n1/count;    //1325
            System.out.println(digit);
            n1 %=count;                   // 2 5 4 6
            System.out.println(n1);
            if(digit%2==0) {
                even=even*10+digit;    //642
            }
            else{
               odd=odd*10+digit;   //5
            }

            count/=10;
        }
        System.out.println(odd+" "+even);
        int result=even+odd;
        System.out.println(result+n);
    }
}
