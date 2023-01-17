class A{
    synchronized void first(B b){  //object of B is passed here , calling of the first resource by A
        System.out.println("Thread 1 starts execution of A's first method");
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        b.last();  //A tries to call the second resource
    }
    synchronized void last(){
        System.out.println("Inside A's last method");
    }
}
class B{
    synchronized void second(A a){  //object of A is passed here , calling of the first resource by B
        System.out.println("Thread 2 starts execution of B's second method");
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        a.last();  //B tries to call the second resource
    }
    synchronized void last(){
        System.out.println("Inside B's last method");
    }
    
}
class Deadlock extends Thread{
    A a = new A();
    B b = new B();
    void func(){
       this.start(); // creation of child thread
       a.first(b);  //This line executed by main thread
    }
    public void run(){
       b.second(a); //This line executed by child thread
    }
}
public class DeadlockExample
{
	public static void main(String[] args) {
	    Deadlock d = new Deadlock();
	    d.func(); //This line executed by main thread
	}
}
//Since all the methods four are synchronized, hence deadlock condition will occur