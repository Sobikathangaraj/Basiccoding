public class sumoftwo_large {
    public static void main(String[] args) {
        //sum of two larger elements
        int arr[]={1,2,3,4};
        int n =arr.length;

        int Max=Integer.MIN_VALUE;
        int i=0,j=1;
        while(j<n)
        {
            int sum=0;
            sum=arr[i]+arr[j];   //3
            i++;j++;             //2,3
            Max=Math.max(Max,sum);
        }
        System.out.println(Max);
    }
}
