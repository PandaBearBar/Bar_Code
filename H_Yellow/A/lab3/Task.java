package H_Yellow.A.lab3;

public class Task implements Runnable {
    private DynamicStringArray array = new DynamicStringArray();

    @Override
    public void run() {
        array.add("a");
        System.out.println(array);
        array.add("b");
        array.add("c");
        array.add("d");
        array.add("e");
        System.out.println(array);
        array.add("f");
        System.out.println(array);
        array.add("g");
        array.add("h");
        array.add("i");
        System.out.println(array);
        array.add("j");
        array.add("k");
        System.out.println(array);
        array.remove("a");
        System.out.println(array);
        System.out.println(array.contains("a"));
        System.out.println(array.contains("b"));
        System.out.println(array.isEmpty());
        array.clear();
        System.out.println(array.isEmpty());
        System.out.println(array);
        array.clear(true);
        System.out.println(array);
    }
}
