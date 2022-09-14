package H_Yellow.A.lab3;

import java.util.Arrays;

public class DynamicStringArray {
    private String[] data;
    private int size;
    private int strategy;
    public static final int STRATEGY_DOUBLE = 0;
    public static final int STRATEGY_50 = 1;
    public static final int CAPACITY_DEFAULT = 5;

    public DynamicStringArray(int capacity, int strategy) {
        data = new String[capacity];
        this.strategy = strategy;
        size = 0;
    }

    public DynamicStringArray() {
        this(CAPACITY_DEFAULT, STRATEGY_50);
    }

    public int getStrategy() {
        return strategy;
    }

    public void setStrategy(int strategy) {
        this.strategy = strategy;
    }

    private String[] copy(String[] dest, int count) {
        return Arrays.copyOf(dest, count);
    }

    private void changeCapacity(int capacity) {
        data = copy(data, capacity);
    }

    private int getGrowCapacity() {
        return (strategy == 1) ? (int) (data.length * 1.5) : data.length * 2;
    }

    private void grow() {
        changeCapacity(getGrowCapacity());
    }

    public synchronized void add(String e) {
        if (size == data.length) grow();
        data[size] = e;
        size++;
    }

    public synchronized void remove(int index)throws ArrayIndexOutOfBoundsException{
        if (index >= data.length || index < 0) throw new ArrayIndexOutOfBoundsException();
        data[index] = null;
        size = 0;
        for (String e : data) {
            if (e != null){
                data[size] = e;
                size++;
            }
        }
        data[size] = null;
    }
    public synchronized int indexOf(String e){
        int indexOf = 0;
        for (String el : data) {
            if (e.equals(el))return indexOf;
            indexOf++;
        }
        return -1;
    }
    public synchronized void remove(String e){
        remove(indexOf(e));
    }
    public synchronized void clip() throws ArrayIndexOutOfBoundsException {
        int new_size = data.length;
        if (new_size<1)throw new ArrayIndexOutOfBoundsException();
        for (String e  :data) {
            if (e == null)new_size--;
        }
        data =copy(data, new_size);
    }
    public synchronized boolean contains(String e){
        for (String el : data) {
            if (e.equals(el))return true;
        }
        return false;
    }
    public synchronized boolean isEmpty(){
        int space =0;
        for (String e : data) {
            if (e != null) space++;
        }
        return space == 0;
    }
    public synchronized void clear(){
        int index = 0;
        for (String e  : data) {
            if (e!=null)data[index]=null;
            index++;
        }
    }
    public synchronized void clear(boolean clip){
        if (clip)data = new String[]{null};
        else clip();
        size = data.length;
    }

    @Override
    public synchronized String toString() {
        return "DynamicStringArray{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                ", strategy=" + strategy +
                ", data length =" + data.length+
                '}';
    }
}
