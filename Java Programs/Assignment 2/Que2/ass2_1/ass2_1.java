import java.io.*;
import java.util.*;
class Q {
    //int item;
    boolean flag =false;
    Stack<Integer> stack = new Stack<Integer>();
    void display_stack(){
        System.out.println(stack);
    }
    synchronized void put(){
        if(flag){
            try {
                wait();
            }catch(InterruptedException e){
                System.out.println("interrupted");
            }
        }
        //this.item=item;
        for(int i=0;i<15;i++)
        stack.push(i);
        display_stack();
        flag=true;
        notify();
    }
    synchronized void get(){
        if(!flag){
            try {wait();}
            catch(InterruptedException e){
                System.out.println("interrupted");
            }
        }
       // display_stack();
        for(int i=0;i<15; i++)
        {
            int r = stack.pop();
            System.out.println(r);
        }
        flag = false;
        notify();
    }
}
class StackInsert implements Runnable{
    Q q;
    StackInsert( Q q){
    this.q=q;
    new Thread(this).start();
}
public void run(){
    //static int i=0;
    while(true)
    {
        q.put();
    }
}
}
class StackDelete implements Runnable{
    Q q;
    StackDelete(Q q){
        this.q=q;
        new Thread(this).start();
    }
    public void run(){
        while(true)
        {
            q.get();
        }
    }
}
class ass2_1{
    public static void main(String args[]){
        Q q =new Q();
        new StackInsert(q);
        new StackDelete(q);
    }
}
