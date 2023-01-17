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
class MyThread1 extends Thread{
    Synchronized_Method sm;
    MyThread1(Synchronized_Method sm){
        this.sm = sm;
    }
    public void run(){
        sm.print();
    }
}
class MyThread2 extends Thread{
    Synchronized_Method sm;
    MyThread2(Synchronized_Method sm){
        this.sm = sm;
    }
    public void run(){
        sm.print();
    }
}
class NormalSyncMethod{
    public static void main(String[] args){
        Synchronized_Method sm = new Synchronized_Method();
        MyThread1 m1 = new MyThread1(sm);
        MyThread2 m2 = new MyThread2(sm);
        m1.start();
        m2.start();
    }
}