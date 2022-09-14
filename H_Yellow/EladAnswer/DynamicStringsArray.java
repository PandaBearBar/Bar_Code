package H_Yellow.EladAnswer;

/*
Created by Elad on 12/03/2022

*/

import java.util.Arrays;
import java.util.Objects;

public class DynamicStringsArray {
    private String[] data;
    private int size;
    private int strategy;
    public static final int STRATEGY_DOUBLE = 0;
    public static final int STRATEGY_50 = 1;
    public static final int CAPACITY_DEFAULT = 5;

    public DynamicStringsArray(int capacity, int strategy) {
        this.data = new String[capacity];
        this.strategy = strategy;
    }

    public DynamicStringsArray() {
        this.data = new String[CAPACITY_DEFAULT];
        this.strategy = 1;
    }

    private String[] copy(String[] dest, int count) {
        System.arraycopy(data, 0, dest, 0, count);
        return dest;
    }

    private void changeCapacity(int capacity) {
        data = Arrays.copyOf(data, capacity);
    }

    private int getGrowCapacity() {
        return strategy == 0 ? data.length * 2 : (int) (data.length * 1.5);
    }

    private void grow() {
        changeCapacity(getGrowCapacity());
    }

    public synchronized void add(String element) {
        data[size] = element;
        size++;
        if (size == data.length) {
            grow();
        }
    }

    public synchronized void remove(int index) {
        if (index > 0 || index < data.length - 1) {
            for (int i = index; i < data.length; i++) {
                if (i == data.length - 1) {
                    data[i] = null;
                } else {
                    data[i] = data[i + 1];
                }
            }
            size--;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public synchronized void clip() {
        if (size >= 1) {
            data = Arrays.copyOf(data, size);
        } else {
            System.out.println("Size must be greater than 0");
        }
    }

    public synchronized boolean contains(String element) {
        for (String s : data) {
            if (Objects.equals(element, s)) {
                return true;
            }
        }
        return false;
    }

    public synchronized boolean isEmpty() {
        return size == 0;
    }

    public synchronized void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
    }

    public synchronized void clear(boolean clip) {
        if (clip) {
            data = Arrays.copyOf(data, 1);
            data[0] = null;
        } else {
            clear();
        }
    }

    @Override
    public String toString() {
        return "DynamicStringsArray{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
