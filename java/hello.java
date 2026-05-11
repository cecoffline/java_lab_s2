class OnetoFive extends Thread{
        public void run(){
            try{
                
                for(int i=0;i<=5;i++){
                    System.out.println(i);
                    Thread.sleep(2000);
                }
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
}

class FivetoOne extends Thread{
    public void run(){
        try{
            
            for(int i=5;i>=0;i--){
                System.out.println(i);
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

public class hello{
    public static void main(String []args){
        OnetoFive t1=new OnetoFive();
        FivetoOne t2=new FivetoOne();

        t1.start();
        t2.start();
    }
}