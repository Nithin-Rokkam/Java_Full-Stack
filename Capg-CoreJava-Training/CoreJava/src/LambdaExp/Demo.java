package LambdaExp;

public class Demo {
    public static void main(String[] args) {

        //inner anonymos class for the method sayHello
        Greetings g=new Greetings() {
            public void sayHello(){
                System.out.println("Hello from anonymos class");
            }
        };
        g.sayHello();

        //------------------------------------------
        //Lambda exp for sayHello method from interface
        Greetings g2 = () -> {System.out.println("Hello from Lambda exp");};
        g2.sayHello();

        //------------------------------------------
        //Lambda func with one parameter(no paranthesis)
        Printer p= prt -> {return prt;};
        int res= p.print(90);
        System.out.println("ans :"+res);

        //-------------------------------------------
        //Lambda func with multiple parameters
        Add a1= (a,b) -> {return a+b;};
        int resadd=a1.add(2,4);
        System.out.println("REs of add :"+resadd);


        //-------------------------------------------
        //Lambda with blocks multiple smts
        Sub s= (a,b) ->{
            System.out.println("Sub from lambda with multi-smts");
            return a-b;
        };
        int resSub=s.sub(3,2);
        System.out.println("resSub :"+resSub);

        //-----------------------------------------
        //Lambda in thread (Runnable) 
        //old way
        Runnable r=new Runnable(){
            public void run(){
                System.out.println("From runnable");
            };
        };
        Thread t1=new Thread(r);
        t1.start();

        //new way
        Runnable r2=() -> {System.out.println("From runnable new way");};
        Thread t2=new Thread(r2);
        t2.start();

        //-----------------------------------------
        //lambda for method reference using for-each
        List<String> l=new Array.asList("a","b","c");
        l.forEach( (x)->System.out.println(x.toUpperCase()));
        
        
    }
}

@FunctionalInterface //only one abstract method is allowed in this type of interface
interface Greetings  {
    void sayHello();
}

@FunctionalInterface
interface Printer {
    int print(int message);
}

@FunctionalInterface
interface Add{
    int add(int a,int b);
}

@FunctionalInterface
interface Sub{
    int sub(int a,int b);
}