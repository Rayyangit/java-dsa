package QueueImpl;

public class CircularArrayQueue {

    int a[];
    int capacity;
    int front;
int size;
    public CircularArrayQueue(int n){
        capacity=n;
        size=0;
        a=new int[n];
        front=0;
    }

    void enqueue(int x){

        if(size==capacity){
            return;
        }

        int rear=(front+capacity)%capacity;
        a[rear]=x;
        size++;
    }

    int dequeue(){

        if(size==0){
            return -1;
        }
int res=a[front];
        front=(front+1)%capacity;
        size--;
        return res;

    }

    public static void main(String[] args) {

        CircularArrayQueue cq=new CircularArrayQueue(3);

        cq.enqueue(2);
        cq.enqueue(32);
        cq.enqueue(2);
        System.out.println(cq.dequeue());
    }
}
