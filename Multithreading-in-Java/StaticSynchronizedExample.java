class Static_Synchronized_Method{
     synchronized static void print(){
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
class MyThread1 extends Thread{
    public void run(){
        Static_Synchronized_Method.print();
    }
}
class MyThread2 extends Thread{
    public void run(){
        Static_Synchronized_Method.print();
    }
}
class StaticSynchronizedExample{
    public static void main(String[] args){
        MyThread1 t1 = new MyThread1(); // synchronized static works for different objects
        MyThread2 t2 = new MyThread2();// the thread gets class level lock in synchronized static
        t1.start();
        t2.start();
    }
}