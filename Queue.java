class Queue{
    private Node front, rear;
    private int size;

    public Queue(){
        front = null;
        rear = null;
        size = 0;
    }

    public class Node{
        Beverage info;
        Node next;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(Beverage info){
        if(isEmpty()){
            rear = new Node();
            rear.info = info;
            rear.next = null;
            front = rear;
        } else {
            rear.next = new Node();
            rear.next.info = info;
            rear = rear.next;
        }
        size++;
        System.out.println("One more " + info.name + " to be done");
    }

    public void dequeue(Money M){
        Beverage done = front.info;
        front = front.next;
        if(isEmpty()) rear = null;
        size--;
        System.out.println(done.name + " is Ready!!!");
        M.Add(done.price);
    }
    
    public Beverage front(){
        return !isEmpty() ? front.info : null;
    }
}