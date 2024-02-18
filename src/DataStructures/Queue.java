package DataStructures;

import javax.swing.JOptionPane;

public class Queue<T> {

    private Node<T> head, tail;
    private int size;

    //Constructor
    public Queue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Agrega un nodo a la cola
     *
     * @param data (Información a agregar)
     * @return Node agregado
     */
    public Node add(T data) {
        Node node = new Node(data);
        if (isEmpty()) {
            setHead(node);
            setTail(node);
        } else {
            Node pointer = getTail();
            pointer.setNext(node);
            setTail(node);
        }
        size++;
        return node;
    }

    /**
     * Desencola un Node pero retorna el Node eliminado
     *
     * @return Node desencolado
     */
    public T dispatch() {
        if (!isEmpty()) {
            Node pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            if (getHead() == null) {
                setTail(null);
            }
            size--;
            return (T) pointer.getData();
        }
        return null;
    }

    /**
     * Desencola un Node
     */
    public void remove() {
        if (!isEmpty()) {
            Node pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            if (getHead() == null) {
                setTail(null);
            }
            size--;
        }
    }

    /**
     * Imprime la cola
     */
    public void printQueue() {
        Node pointer = getHead();
        String sQueue = "";

        while (pointer != null) {
            if (pointer == getTail()) {
                sQueue += pointer.getData();

            } else {
                sQueue += pointer.getData() + ", ";
                pointer = pointer.getNext();
            }
        }
        JOptionPane.showMessageDialog(null, sQueue);
    }

    //Getters and Setters
    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return head == null;
    }
}