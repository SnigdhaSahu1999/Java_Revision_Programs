class Synchronized_Method{
    synchronized void print(){
        for(int i=0;i<5;i++){
        System.out.println(Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        }
    }
}
public class SynchronizedMethodExample extends Thread
{
	public static void main(String[] args) {
	    Synchronized_Method sm = new Synchronized_Method();
	    Thread t1 = new Thread(){
	        public void run(){
	            sm.print();
	        }
	    };
	    Thread t2 = new Thread(){
	        public void run(){
	            sm.print();
	        }
	    };
	    t1.start();
	    t2.start();
	}
}
