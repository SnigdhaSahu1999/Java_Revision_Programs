class A extends Thread{
}
class B extends Thread{
}

public class MultiTaskingAndMultithreading{  
public static void main(String[] args) {  
    A ob1 = new A(){
        public void run(){
            System.out.println("Task A is running");
        }
    };
    ob1.start();
    B ob2 = new B(){
        public void run(){
            System.out.println("Task B is running");
        }
    };
    ob2.start();
}  
}  