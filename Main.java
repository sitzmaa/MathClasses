import java.util.ArrayList;
// Java implementation of the permutor class
public class Main {

    public static void main(String[] args) {
        test();
    }

    public static void test(){
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        printArray(array);
        
    }

    public static void printArray(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
    }
}