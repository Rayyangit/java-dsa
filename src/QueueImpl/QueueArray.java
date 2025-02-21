package QueueImpl;

import java.util.Queue;

public class QueueArray {

    int a[];
    int capacity;
    int rear;

    public QueueArray(int n){
        capacity=n;
        a=new int[n];
        rear=-1;
    }
    void enqueue(int data){
        if(rear==capacity-1){
            throw new RuntimeException();
        }
        rear++;
        a[rear]=data;
    }
    int dequeue(){

        if(rear==-1){
            throw new RuntimeException();
        }

        int result=a[0];
        for(int i=0;i<rear;i++) {
            a[i]=a[i+1];
        }
        rear--;
        return result;
    }

    public static void main(String[] args) {

        QueueArray q=new QueueArray(3);

        q.enqueue(32);
        q.enqueue(33);
        q.enqueue(2);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
