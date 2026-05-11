class One implements Runnable{
    public void run(){
        System.out.println("One file");
    }
}

class Two implements Runnable{
    public void run(){
         System.out.println("Two file");
    }
}

public class runnable{
    public static void main(String []args){
        One o=new One();
        Two t=new Two();

        Thread t1=new Thread(o);
        Thread t2=new Thread(t);

        t1.start();
        t2.start();
    }
}