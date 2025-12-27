public class swap {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        System.out.println("a="+a+" b="+b);
        int c=a;
        a=b;
        b=c;
        System.out.println("a="+a+" b="+b);

        int x=2;
        int y=3;
        System.out.println("x="+x+" y="+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x="+x+" y="+y);
/*
using XOR gate
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("x="+x+" y="+y);
*/
    }
}
