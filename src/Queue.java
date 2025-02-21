public class Queue {

    int arr[];
    int size;
    int front;
    int capacity;

    public Queue(int qsize){
        arr=new int[qsize];
        size=0;
        front=0;
        capacity=qsize;
    }
    public void push(int e){

        if(size==capacity){
            return;
        }

        arr[size++]=e;
    }
    public void pop(){

        if(size==0){
            return ;
        }
        for (int i = 1; i < size; i++) {
            arr[i-1] = arr[i];
        }
        size--;

    }

    public int Front(){
        if(size==0){
            return -1 ;
        }


        return arr[front];

    }

    void display() {

        for (int i = front; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        }

    public static void main(String[] args) {


        Queue q = new Queue(4);

        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.Front());
        q.pop();
        q.push(4);
        q.display();
    }
}

