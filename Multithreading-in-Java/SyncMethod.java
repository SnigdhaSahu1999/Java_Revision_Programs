class SyncMethod implements Runnable{
    public synchronized void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(10);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args){
        SyncMethod m1 = new SyncMethod();
        Thread t1 = new Thread(m1,"First");
        Thread t2 = new Thread(m1,"Second");
        Thread t3 = new Thread(m1,"Third");
        t1.start();
        t2.start();
        t3.start();
    }
}