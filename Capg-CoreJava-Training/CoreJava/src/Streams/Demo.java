package Streams;

public class Demo {
    String s = "madam";

    boolean isPal =
    s.equals(
        new StringBuilder(
            s.chars()
            .mapToObj(c -> String.valueOf((char)c))
            .reduce("", (a,b) -> b + a)
        ).toString()
    );

    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.isPal);
    }
}
