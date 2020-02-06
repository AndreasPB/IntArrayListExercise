public class Main {

    public static void main(String[] args) {
        System.out.println("IntArray Exercise!");

        MyIntArrayList intArray = new MyIntArrayList();

        intArray.printAll();
        System.out.println("get index 3: " + intArray.get(2));
        System.out.println("Array size: " + intArray.size());

        intArray.add(1337);
        intArray.printAll();

        intArray.add(3, 333);
        intArray.printAll();

        intArray.remove(2);
        intArray.printAll();

        intArray.clear();
        intArray.printAll();
    }
}
