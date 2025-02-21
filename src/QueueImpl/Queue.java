package QueueImpl;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;

    }
}
public class Queue {

    Node front,rear;

    void enqueue(int data){

        Node newNode=new Node(data);

        if(front==null){
            front=rear=newNode;
            return;
        }

        rear.next=newNode;
        rear=newNode;

    }

    int dequeue(){
        int f= front.data;
        front=front.next;
        return f;

    }

    public static void main(String[] args) {

        Queue q=new Queue();
        q.enqueue(12);
        q.enqueue(13);
        q.enqueue(83);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }


}
