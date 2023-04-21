package lecture_230407;

public class Queue {
    private int[] elements;
    private int size;

    // front: queue의 처음
    // rear : queue의 마지막
    private int front, rear;

    //Construct a queue with the default capacity 8
    public Queue() {
        elements = new int[8];
        front = -1;
        rear = -1;
    }

    // 뒤에서부터 하나씩 추가
    public void enqueue(int value) {
        elements[++rear] = value;
    }

    // 앞에서부터 하나씩 삭제
    public int dequeue() {
        return elements[++front];
    }

    public boolean empty() {
        // ref)https://stackoverflow.com/questions/32568261/how-can-i-avoid-arrayindexoutofboundsexception-or-indexoutofboundsexception
        if(this.rear == this.front)
            return true;
        else
            return false;
    }

    public int getSize() {
        this.size = front - rear;
        return this.size;
    }
}
