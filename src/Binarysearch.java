import java.util.*;

public class Binarysearch {
    public static void main(String[] args) {


            Scanner in = new Scanner(System.in);
//
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        long[] arr=new long[a];
        int sum=0;
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int n=a*(a+1)/2;
        System.out.println(n-sum);
        }
    }

