
class shut_down_hook extends Thread{
    public void run(){
        System.out.println("This statement will be executed before the JVM crashes"); //  press ctrl+c to exit
    }
}

class Normal_thread_class extends Thread{
    public void run(){
        System.out.println("This is a normal thread class");
    }
}

public class ShutDownHookExample
{
	public static void main(String[] args) {
	    
	    Runtime r = Runtime.getRuntime(); //getRuntime() is a factory method
	    r.addShutdownHook(new shut_down_hook()); // adding the shut_down_hook class for ShutdownHook
	    
	    for(int t=0;t<10;t++){
	        Normal_thread_class obj = new Normal_thread_class();
	        obj.start();
	        try{
	            Thread.sleep(1000);
	        }
	        catch (Exception e) {}  
	    }
	}
}
