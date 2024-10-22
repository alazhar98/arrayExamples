import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SudokuValidator {
    public static void main(String[] args) {

        List<List<Character>> board = Arrays.asList(
                Arrays.asList('5', '3', '.', '.', '7', '.', '.', '.', '.'),
                Arrays.asList('6', '.', '.', '1', '9', '5', '.', '.', '.'),
                Arrays.asList('.', '9', '8', '.', '.', '.', '.', '6', '.'),
                Arrays.asList('8', '.', '.', '.', '6', '.', '.', '.', '3'),
                Arrays.asList('4', '.', '.', '8', '.', '3', '.', '.', '1'),
                Arrays.asList('7', '.', '.', '.', '2', '.', '.', '.', '6'),
                Arrays.asList('.', '6', '.', '.', '.', '.', '2', '8', '.'),
                Arrays.asList('.', '.', '.', '4', '1', '9', '.', '.', '5'),
                Arrays.asList('.', '.', '.', '.', '8', '.', '.', '7', '9')
        );
        boolean isValid = true;
        for (int r = 0; r < 9; r++) {
            HashSet<Character> seen = new HashSet<>();
            for (int c = 0; c < 9; c++) {
                char num = board.get(r).get(c);
                if (num != '.') {
                    if (seen.contains(num)) {
                        isValid = false;
                        break;
                    }
                    seen.add(num);
                }
            }

            if (!isValid) break;
        }
        if (isValid) {
            for (int c = 0; c < 9; c++) {
                HashSet<Character> seen = new HashSet<>();
                for (int r = 0; r < 9; r++) {
                    char num = board.get(r).get(c);
                    if (num != '.') {
                        if (seen.contains(num)) {
                            isValid = false;
                            break;
                        }
                        seen.add(num);
                    }
                }
                if (!isValid) break;

            }
        }
        if (isValid) {
            for (int startRow = 0; startRow < 9; startRow += 3) {
                for (int startCol = 0; startCol < 9; startCol += 3) {
                    HashSet<Character> seen = new HashSet<>();
                    for (int r = startRow; r < startRow + 3; r++) {
                        for (int c = startCol; c < startCol + 3; c++) {
                            char num = board.get(r).get(c);
                            if (num != '.') {
                                if (seen.contains(num)) {
                                    isValid = false; // Duplicate found in the box
                                    break;
                                }
                                seen.add(num);
                            }
                        }
                        if (!isValid) break;
                    }
                    if (!isValid) break;
                }
            }
        }

        System.out.println("Output: " + isValid);
    }
}
