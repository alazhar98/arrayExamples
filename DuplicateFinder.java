import java.util.*;

public class DuplicateFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integers (comma to separated): ");
        String input = scanner.nextLine();

        String[] numbers = input.split(",");
        // two HashMap for positions and counts
        Map<Integer, List<Integer>> positions = new HashMap<>();
        Map<Integer, Integer> counts = new HashMap<>();
        //loop to find duplicates
        for (int i = 0; i < numbers.length; i++) {
            int num = Integer.parseInt(numbers[i]);
            // to track positions
            if (!positions.containsKey(num)) {
                positions.put(num, new ArrayList<>());
            }
            positions.get(num).add(i);
            // to track count
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        int sum = 0;
        //display duplicates+ positions
        for (Map.Entry<Integer, List<Integer>> entry : positions.entrySet()) {
            int num = entry.getKey();
            List<Integer> posList = entry.getValue();
            // if its appears more than one time
            if (posList.size() > 1) {
                System.out.println(num + ": Occurs " + posList.size() + " times at positions " + posList);
                sum += num; // Add to the sum
            }
        }
        System.out.println("Sum " + sum);
    }
}
