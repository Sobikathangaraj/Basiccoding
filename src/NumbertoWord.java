public class NumbertoWord {
    public static void main(String[] args) {

        // 1223
        int n , n1;
        n=n1= 1772344;
        int count = 1;
        int itr = 1; //err
        // Count Determining:
        while (n1 > 10)              //223334
        {
            count *= 10;
            n1 /= 10;
        }                                    //% removing first element       / Getting first element
//        System.out.println(count+" "+n);
        int digit = n / count;  //2
        n=n%count;   //err:n not modified
        count =  count/10; //err count not properly updated;
        System.out.println(count+" "+n);
        while (n > 0) {
            int d = n / count;
            n = n % count;    //10000
            count =  count/10; //err count not properly updated
            if (digit == d) {
                itr++;
                if (itr > 3) //err outside the if statement
                {
                    naming(itr);
                    switch (digit) {
                        case 1 -> System.out.print("One ");
                        case 2 -> System.out.print("Two ");
                        case 3 -> System.out.print("Three ");
                        case 4 -> System.out.print("Four ");
                        case 5 -> System.out.print("Five ");
                        case 6 -> System.out.print("Six ");
                        case 7 -> System.out.print("Seven ");
                        case 8 -> System.out.print("Eight");
                        case 9 -> System.out.print("Nine");

                    }
                    itr=1;
                }
            }else {
                naming(itr);
                //err out side the loop //err no else required
                switch (digit) {
                    case 1 -> System.out.print("One ");
                    case 2 -> System.out.print("Two ");
                    case 3 -> System.out.print("Three ");
                    case 4 -> System.out.print("Four ");
                    case 5 -> System.out.print("Five ");
                    case 6 -> System.out.print("Six ");
                    case 7 -> System.out.print("Seven ");
                    case 8 -> System.out.print("Eight ");
                    case 9 -> System.out.print("Nine ");
                }
                digit=d;
                itr=1;
            }
        }

        naming(itr);
        switch (digit) {
            case 1 -> System.out.print("One ");
            case 2 -> System.out.print("Two ");
            case 3 -> System.out.print("Three ");
            case 4 -> System.out.print("Four ");
            case 5 -> System.out.print("Five ");
            case 6 -> System.out.print("Six ");
        }

}


    public static void naming(int itr)
    {
        switch (itr) {
            case 2 -> System.out.print("Double ");
            case 3 -> System.out.print("Triple ");
        }
    }
}
