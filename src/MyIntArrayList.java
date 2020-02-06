import java.util.Arrays;
import java.util.Random;

public class MyIntArrayList {

    private int[] intArray;

    // Constructor der laver 5 tilfældige tal fra 0 til 99
    public MyIntArrayList() {
        Random rand = new Random();
        intArray = new int[5];

        for(int i = 0; i < intArray.length; i++) {
            int randomInt = rand.nextInt(100);
            intArray[i] = randomInt;
        }
    }

    //  Retunerer index
    public int get(int index) {

        return intArray[index];
    }

    // Gemmer data i dataTransfer, overskriver det gamle array
    // sender data tilbage og tilføjer value bagerst i det nye array
    public void add(int value) {

        int newLength = intArray.length + 1;

        int[] dataTransfer = intArray;
        intArray = new int[newLength];

        for(int i = 0; i < newLength - 1; i++) {
            intArray[i] = dataTransfer[i];

        }
        intArray[newLength - 1] = value;
        System.out.println(value + " added!");
    }

    // Tilføjer et tal på positionen index og rykker alt en plads til højre
    public void add(int index, int number) {

        int newLength = intArray.length + 1;
        int[] dataTransfer = new int[newLength];

        int count = 0;

        for(int i = 0; i < intArray.length; i++) {
            if(index == i) {
                dataTransfer[i] = number;
                System.out.println(number + " placed on index " + index);
                count++;
            }
            dataTransfer[i + count] = intArray[i];
        }
        intArray = dataTransfer;
    }

    // En pænere add metoder, men snyder med Arrays.copyOf
    public void addCopyOf(int value) {

        int newLength = intArray.length + 1;

        intArray = Arrays.copyOf(intArray, newLength);

        intArray[newLength - 1] = value;
    }

    // Laver et nyt array uden tallet på plads index
    public void remove(int index) {

        int newLength = intArray.length - 1;
        int[] dataTransfer = new int[newLength];

        int count = 0;

        for(int i = 0; i < intArray.length; i++) {
            if(index == i) {
                System.out.println("You removed " + intArray[i]);
                count++;
            } else {
                dataTransfer[i - count] = intArray[i];
            }
        }

        intArray = dataTransfer;
    }


    // Viser længden på arrayet
    public int size() {

        return intArray.length;
    }

    // Overskriver intArray med et tomt array
    public void clear() {
        intArray = new int[0];
        System.out.println("Your array has been cleared!");
    }

    // Printer alle tallene i intArray til consollen (uden havelåge-kommaer :))
    public void printAll() {

        System.out.println("Your array: ");

        if(intArray.length == 0) {
            throw new ArrayIndexOutOfBoundsException("You're trying to print an empty array.");
        } else {
            System.out.print(intArray[0]);

            for(int i = 1; i < intArray.length; i++) {
                System.out.print(", " + intArray[i]);
            }
            System.out.println();
        }
    }
}
