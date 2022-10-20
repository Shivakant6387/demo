class Runnable extends Thread{
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("hey"+i);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
public class Theads {
    public static void main(String[] args) {
        Runnable runnable =new Runnable() ;
           runnable.start();

    }
}
