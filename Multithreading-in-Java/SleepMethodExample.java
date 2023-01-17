class SleepMethodExample implements Runnable{
    public void run(){
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
        SleepMethodExample m1 = new SleepMethodExample();
        Thread t1 = new Thread(m1,"First");
        Thread t2 = new Thread(m1,"Second");
        Thread t3 = new Thread(m1,"Third");
        t1.start();
        t2.start();
        t3.start();
    }
}