import java.util.ArrayList;
import java.util.Random;
/*
 * Permutor Class will take in an arraylist object
 * it can then be called to recieve permutations of the arraylist
 */
public class Permutor<T> {
    private final ArrayList<T> original;

    // Permutor assigns the input arraylist as its original
    public Permutor(ArrayList<T> original){
        this.original = original;
    }

    // Returns a pseduorandom permutation of the array
    public ArrayList<T> getRandomPermutation() {
        Random random = new Random();
        int index;
        ArrayList<T> returner = new ArrayList<T>(original);
        for (int i = 0; i < returner.size(); i++) {
            index = random.nextInt(returner.size());
            swap(returner, i, index);
        }
        return returner;
    }

    // Returns every permutation of the original arraylist
    // Return type ArrayList<ArrayList>>
    // Precondition: Permutor must be allocated
    public ArrayList<ArrayList<T>> getAllPermutations() {
        ArrayList<ArrayList<T>> returner = new ArrayList<ArrayList<T>>();
        ArrayList<T> tempArray;
        for (int i = 0; i < original.size(); i++) {
            for (int j = 0; j < original.size(); j++) {
                tempArray = new ArrayList<T>(original);
                swap(tempArray, i, j);
                returner.add(tempArray);
                if (j == (i-1)) {
                    j++;
                }
            }
        }
        return returner;
    }

    private void swap(ArrayList<T> list, int i, int j) {
        T holder = list.get(i);
        list.set(i, list.get(j));
        list.set(j, holder);
    }
}
