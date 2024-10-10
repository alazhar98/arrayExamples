import java.util.ArrayList;
import java.util.HashMap;

public class DistinctElementsInWindow {
    public static void main(String[] args){
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(1);
        input.add(3);
        input.add(4);
        input.add(2);
        input.add(3);

        int k = 4;

        ArrayList<Integer> result = countDistinctInWindow(input, k);
        System.out.println("Output: " + result);

    }


    public static ArrayList<Integer> countDistinctInWindow(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();// result arrayList
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        //to Initialize the first window
        for (int i = 0; i < k; i++) {
            // put every index in the array on frequency map
            frequencyMap.put(arr.get(i), frequencyMap.getOrDefault(arr.get(i), 0) + 1);
        }
        result.add(frequencyMap.size());//  Count elements in the first window

        for (int i = k; i < arr.size(); i++) {
            // Remove the element
            int outgoing = arr.get(i - k);
            frequencyMap.put(outgoing, frequencyMap.get(outgoing) - 1);
            if (frequencyMap.get(outgoing) == 0) {
                frequencyMap.remove(outgoing); // Remove from map if count is 0
            }
            // Add the new element coming into the window
            int incoming = arr.get(i);
            frequencyMap.put(incoming, frequencyMap.getOrDefault(incoming, 0) + 1);

            // Add the count of elements to the result
            result.add(frequencyMap.size());
        }
        return result;
    }
}