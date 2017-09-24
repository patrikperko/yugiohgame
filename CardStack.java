public class CardStack<T> {

    private class CardNode<T> {
        private T data;
        private CardNode<T> next;

        public CardNode(T data, CardNode<T> next) {
            this.data = data;
            this.next = next;
        }

        public void setData(T data) {
            this.data = data;
        }

        public void setNext(CardNode<T> next) {
            this.next = next;
        }
    }

    private CardNode<T> head;
    private int size;
    public CardStack() {
        this(null);
    }

    public CardStack(CardNode<T> head) {
        this.head = head;
    }

    public void enqueue(T data) {
        if (data == null) {
            throw new IllegalArgumentException("Data is null");
        }

        if (size == 0) {
            head.data = data;
        } else {
            CardNode<T> temp = head;
            temp.data = data;
            head = head.next;
            head = temp;
        }
        ++size;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NullPointerException("Deck is Empty");
        }

        T temp = head.data;
        if (size == 1) {
            head = null;
        } else {
            head = head.next;
        }
        --size;
        return temp;

    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

}