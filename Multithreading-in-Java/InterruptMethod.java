class MyThread extends Thread{
   public void run(){
       try{
       Thread.sleep(1000);
       }
       catch(InterruptedException e){
           System.out.println("Thread got interrupted while sleeping and exception is: "+e);
           System.out.println("Interruption handled");
       }
   }
}
class InterruptMethod{
    public static void main(String[] args){
        MyThread mt = new MyThread();
        mt.start();
        mt.interrupt();
        }
 }