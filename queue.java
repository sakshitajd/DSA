import java.util.Queue;
import java.util.*;

public class queue {
    
    int arr[] = new int[5];
    int size;
    int front ;
    int rear ;

    public  void enqueue(int data){
        arr[rear] = data;
        rear ++;
        size++;
    }

    public int dequeue(int data){
        data = arr[front];
        front++;
        size--;

        return data;
    }

    public void show(){
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+"");
        }
    }

    public static void main(String[] args) {
        queue q = new queue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        q.dequeue(0);

      

        q.show();
    }

}
