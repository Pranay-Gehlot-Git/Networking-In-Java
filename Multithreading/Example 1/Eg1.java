import java.io.*;
import java.lang.Thread;
import java.lang.Runnable;


class aaa implements Runnable
{
    aaa(){
        Thread t=new Thread(this);   
        t.start();
    }
public void run(){
    for(int i=500 ; i<600 ; i++){
        System.out.print(i+" ");
    }
}
}


public class Eg1 {
    public static void main(String[] args) {
        aaa a= new aaa();             
        for(int i=1 ; i<200 ; i++){
            System.out.print(i+" ");
        }    
    }
    
}



Another way to write the code for multithreading
class aaa extends Thread
{
aaa()
{
start();
}

public void run()
{
for(int i=111 ; i<200 ; i++)
{
System.out.print(i+" ");
}
}

}


class Eg1
{
   public static void main(Strig gg[]){
   
   aaa a=new aaa();
       for(int i=10 ; i<100 ; i++){
       System.out.print(i+" ");
       }
   
   
   
   }
}
