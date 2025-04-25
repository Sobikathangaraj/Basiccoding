public class sumoffour {
    public static void main(String[] args) {
        int arr1[]={1,3,8,5,2,4,7,10};
        int arr2[]={3,4,7};
        int max= arr1[0];
        for(int i:arr1)
        {
            if(i>max)
            {
                max=i;
            }
        }
        int freq[]=new int[max+1];
        for(int i:arr1)
        {
            freq[i]++;
        }
        for(int i: arr2)
        {
            if(freq[i]==0)
            {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
