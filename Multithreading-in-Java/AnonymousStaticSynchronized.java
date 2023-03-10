class Static_Synchronized_Method{
    static synchronized void print(){
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
class AnonymousStaticSynchronized{
    public static void main(String[] args){
        Thread t1 = new Thread(){
            public void run(){
             new Static_Synchronized_Method().print(); 
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                //Static_Synchronized_Method m = 
             Static_Synchronized_Method.print(); 
            }
        };
        t1.start();
        t2.start();
    }
}