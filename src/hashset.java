import java.util.*;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer>h=new HashSet<>();
        Scanner in = new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i:arr){
            h.add(i);
        }
        Iterator<Integer> itr= h.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
//        (or)
//        for (Integer integer : h) {
//            System.out.print(integer + " ");
//        }
    }
}
