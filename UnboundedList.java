package list;

import java.util.Arrays;

public class UnboundedList {
	
	private int capacity;
    private int size;
    private int[] a;

    //constructor
    public UnboundedList() {
        capacity = 5;
        size = 0;
        a = new int[capacity];
    }

    //method to check size and capacity is equal array is full then 
    public void addElement(int element) {
        if (size == capacity) {
            capacity *= 2;//if array is full capacity is multiply by 2 to increase array size 
            a = Arrays.copyOf(a, capacity);//this is used to get copy of array to assign a data
        }
        a[size] = element;
        size++;
    }

    public void toprintList() {
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 UnboundedList unboundedList = new UnboundedList();
	        for (int i = 0; i < 20; i++) {
	            unboundedList.addElement(i);
	        }
	        unboundedList.toprintList();
	}

}
