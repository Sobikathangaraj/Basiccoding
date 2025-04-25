import java.util.TreeSet;

public class exists_set {
    public static void main(String[] args) {
        TreeSet<Integer>l=new TreeSet<>();
        int arr[]={1,2,3,4};
        //int k=2;
        for(int i:arr)
        {
            l.add(i);
        }
        for(Integer itr:l)
        {
            if(l.contains(5))
            {
                System.out.println("True");
            }
            System.out.println("False");
            return;
        }
    }
}
