package H_Yellow.B.part3.Beans;

import java.util.Arrays;

public class DynamicStringArray {
    private String [] data;
    private int size;
    private int strategy;
    private static final int STRATEGY_DOUBLE = 0;
    private static final int STRATEGY_50 = 1;
    private static final int CAPACITY_DEFAULT = 5;

    public DynamicStringArray(int capacity, int strategy) {
        this.data = new String[capacity];
        this.strategy = strategy;
        size = 0;
    }
    public DynamicStringArray(){
        this(CAPACITY_DEFAULT,STRATEGY_50);
    }
    private String[] copy(String [] dest, int count ){
        return Arrays.copyOf(dest, count);
    }
    private void changeCapacity(int capacity) {
        data = copy(data, capacity);
    }
    private int getGrowCapacity(){
        return (strategy==0) ? data.length*2 : (int) (data.length * 1.5);
    }
    private void grow(){
        changeCapacity(getGrowCapacity());
    }
    public synchronized void add(String e){
        if (size>=data.length)grow();
        data[size] = e;
        size++;
    }
    public synchronized void remove(int index){
        if (index >= 0) {
            data[index] = null;
            int sofer = 0;
            size = 0;
            for (String e: data) {
                if (e != null) {
                    data[size] = data[sofer];
                    size++;
                    sofer++;
                } else sofer++;
            }
            data[size] = null;
        }
        else System.out.println("Invalid Index");
    }
    public synchronized int indexOf(String e){
        for (int i = 0; i < data.length; i++) {
           if (e.equals(data[i]) )return i;
        }
        System.out.println("Invalid String ");
        return -1;
    }
    public synchronized void remove(String e){
        remove(indexOf(e));
    }
    public synchronized void clip(){
        if (size >0 ){
            changeCapacity(size+1);
        }
        else System.out.println("Invalid index");
    }
    public synchronized boolean contains(String e){
        for (String s : data) {
            if (e.equals(s))return true;
        }
        return false;
    }
    public synchronized boolean isEmpty(){
        return size == 0;
    }
    public synchronized void clear (){
        for (String s : data) {
            if (s != null && size > 0 ){
                size--;
                data[size] = null;
            }
        }
    }
    public synchronized void clear(boolean clip) {
        if (clip){
            size = 0;
            data = new String[1];
            data[size] = null;
        }else {
            clip();
        }
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
