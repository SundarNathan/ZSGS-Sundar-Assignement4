import java.util.LinkedList;
import java.util.List;

class LinkedListQueue{
    List<String> li= new LinkedList<>();

    void queue(String str)
    {
        li.add(str);
    }

    void dequeue(){
        li.removeFirst();
    }

    List<String> toLinkedList(){
        return li;
    }
}
public class Main {
    public static void main(String[] args) {

        LinkedListQueue lq= new LinkedListQueue();

        lq.queue("Alice");
        lq.queue("Bob");
        lq.queue("Charlie");
        lq.queue("Diana");

        lq.dequeue();
        lq.dequeue();

        System.out.println(lq.toLinkedList());
    }
}