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
