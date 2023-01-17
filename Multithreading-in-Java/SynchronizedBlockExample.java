class Synchronized_Block{
    void print(){
      synchronized(this){
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
}
class MyThread1 extends Thread{
    Synchronized_Block sb1;
    MyThread1(Synchronized_Block sb1){
        this.sb1 = sb1;
    }
    public void run(){
        sb1.print();
    }
}
class MyThread2 extends Thread{
    Synchronized_Block sb2;
    MyThread2(Synchronized_Block sb2){
        this.sb2 = sb2;
    }
    public void run(){
        sb2.print();
    }
}

class SynchronizedBlockExample{
    public static void main(String[] args){
        Synchronized_Block sb = new Synchronized_Block(); // Only single object i.e shared resource is created
        MyThread1 m1 = new MyThread1(sb);
        MyThread1 m2 = new MyThread1(sb);
        m1.start();
        m2.start();
    }
}