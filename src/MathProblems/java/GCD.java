package MathProblems.java;

public class GCD {
    public static int operation (int a, int b){
        if(b==0) return a;
        return operation(b,a%b);

    }
    public static void main(String[] args) {
        int a=25,b=11;
        System.out.println(operation(a,b));
    }
}
