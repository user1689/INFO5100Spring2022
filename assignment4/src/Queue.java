public class Queue<T> {

    // arr used for store elements
    private final T[] arr;
    // the idx of element to be pop
    private int startIdx;
    // the idx of element to be push
    private int endIdx;
    // the number of elements in queue
    private int count;

    // Thread safe queue with blocking
    public Queue(int capacity) throws IllegalAccessException {
        if (capacity <= 0) {
            throw new IllegalAccessException();
        }
        arr = (T[])new Object[capacity];
    }

    public void add(T e) throws InterruptedException {
        while (true) {
            synchronized (this) {
                if (count != this.arr.length) {
                    enqueue(e);
                    break;
                }
            }
            Thread.sleep(200L);
        }
    }

    public T remove() throws InterruptedException {
        while (true) {
            synchronized (this) {
                if (this.count != 0) {
                    return dequeue();
                }
            }
            Thread.sleep(200L);
        }
    }

    public T peek() throws InterruptedException {
        while (true) {
            synchronized (this) {
                if (this.count != 0) {
                    T e = dequeue();
                    enqueue(e);
                    return e;
                }
            }
            Thread.sleep(200L);
        }
    }

    public boolean isEmpty() throws InterruptedException {
        synchronized (this) {
            if (this.count == 0) {
                return true;
            } else {
                return false;
            }
        }

    }

    // push
    public void enqueue (T e) {
        this.arr[this.startIdx] = e;
        if (++this.startIdx == this.arr.length) {
            this.startIdx = 0;
        }
        this.count++;
    }

    // pop
    public T dequeue() {
        T e = this.arr[this.endIdx];
        this.arr[this.endIdx] = null;

        if (++this.endIdx == this.arr.length) {
            this.endIdx = 0;
        }
        this.count--;
        return e;
    }
}
