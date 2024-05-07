package datastructure;
import java.util.Scanner;
public class TwoQueuesInOneArray {

	    private int[] array;
	    private int front1, rear1, front2, rear2;
	    private int capacity;

	    public TwoQueuesInOneArray(int capacity)
	    {
	        this.capacity = capacity;
	        this.array = new int[capacity];
	        this.front1 = 0;
	        this.rear1 = -1;
	        this.front2 = capacity - 1;
	        this.rear2 = capacity;
	    }

	    public void enqueueToQueue1(int data)
	    {
	        if (isFull())
	        {
	            System.out.println("Queue is full");
	            return;
	        }
	        rear1 = (rear1 + 1) % capacity;
	        array[rear1] = data;
	    }

	    public void enqueueToQueue2(int data)
	    {
	        if (isFull())
	        {
	            System.out.println("Queue is full");
	            return;
	        }
	        rear2 = (rear2 - 1 + capacity) % capacity;
	        array[rear2] = data;
	    }

	    public int dequeueFromQueue1()
	    {
	        if (isEmpty(1))
	        {
	            System.out.println("Queue 1 is empty");
	            return -1; // or throw an exception
	        }
	        int data = array[front1];
	        front1 = (front1 + 1) % capacity;
	        return data;
	    }

	    public int dequeueFromQueue2()
	    {
	        if (isEmpty(2))
	        {
	            System.out.println("Queue 2 is empty");
	            return -1; // or throw an exception
	        }
	        int data = array[front2];
	        front2 = (front2 - 1 + capacity) % capacity;
	        return data;
	    }

	    public boolean isFull()
	    {
	        return (rear1 + 1) % capacity == front2;
	    }

	    public boolean isEmpty(int queueNumber)
	    {
	        if (queueNumber == 1)
	        {
	            return front1 > rear1;
	        } else if (queueNumber == 2)
	        {
	            return front2 < rear2;
	        } else {
	            System.out.println("Invalid queue number");
	            return true; // or throw an exception
	        }
	    }

	    public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter capacity of queues: ");
	        int capacity = scanner.nextInt();
	        TwoQueuesInOneArray queues = new TwoQueuesInOneArray(capacity);
	        System.out.println("Enter elements for Queue 1:");
	        for (int i = 0; i < capacity; i++)
	        {
	            System.out.print("Element " + (i + 1) + ": ");
	            queues.enqueueToQueue1(scanner.nextInt());
	        }

	        System.out.println("Enter elements for Queue 2:");
	        for (int i = 0; i < capacity; i++)
	        {
	            System.out.print("Element " + (i + 1) + ": ");
	            queues.enqueueToQueue2(scanner.nextInt());
	        }

	        System.out.println("Dequeued elements from Queue 1:");
	        for (int i = 0; i < capacity; i++)
	        {
	            System.out.println("Dequeued element: " + queues.dequeueFromQueue1());
	        }

	        System.out.println("Dequeued elements from Queue 2:");
	        for (int i = 0; i < capacity; i++)
	        {
	            System.out.println("Dequeued element: " + queues.dequeueFromQueue2());
	        }

	        scanner.close();
	    }
	}
