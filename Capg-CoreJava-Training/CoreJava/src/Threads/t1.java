package Threads;
public class t1 {
    public static void main(String[] args){
        T t=new T();
        Thread t1=new Thread(t);
        Thread t2=new Thread(t);
        try{
            t1.start();
            t1.join();//used for syncornized processing
            t2.start();
        }catch(Exception e){
            System.out.println("Error"+e.getLocalizedMessage());
        }
    }
}

class T implements Runnable{
        public void run(){
            try{
                System.out.println("from T");
                Thread.sleep(1000);
                System.out.println("After 1sec");
            }catch(Exception e){
                System.out.println("Error"+e.getMessage());
            }
        }
}
