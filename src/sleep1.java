public class sleep1 extends Thread {
    public  void run(){
        for(int i=0;i<10;i+=2){
            try{Thread.sleep(1000);}
            catch(InterruptedException e){
                System.out.println(e);}
                System.out.println(i);
            }
        }
     public static void main(String[] args) {
        sleep1 s1=new sleep1();
        sleep1 s2=new sleep1();
        s1.start();
        s2.start();
    }
}
