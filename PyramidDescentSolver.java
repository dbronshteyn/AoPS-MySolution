import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PyramidDescentSolver {

    private static class State {
        int row, col;
        int product;
        String path;

        State(int row, int col, int product, String path) {
            this.row = row;
            this.col = col;
            this.product = product;
            this.path = path;
        }
    }

    public static String solve(List<List<Integer>> pyramid, int target) {
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(0, 0, pyramid.get(0).get(0), ""));

        while (!queue.isEmpty()) {
            State current = queue.poll();

            if (current.row == pyramid.size() - 1) {
                if (current.product == target) {
                    return current.path;
                }
                continue;
            }

            // Go left
            int leftProduct = current.product * pyramid.get(current.row + 1).get(current.col);
            if (leftProduct <= target) {
                queue.add(new State(current.row + 1, current.col, leftProduct, current.path + "L"));
            }

            // Go right
            int rightProduct = current.product * pyramid.get(current.row + 1).get(current.col + 1);
            if (rightProduct <= target) {
                queue.add(new State(current.row + 1, current.col + 1, rightProduct, current.path + "R"));
            }
        }

        return null; // No solution found
    }

    public static void main(String[] args) {
        List<List<Integer>> pyramid = List.of(
                List.of(1),
                List.of(2, 3),
                List.of(4, 1, 1));
        int target = 2;
        System.out.println(solve(pyramid, target)); // Outputs: LR

        pyramid = List.of(
                List.of(2),
                List.of(4, 3),
                List.of(3, 2, 6),
                List.of(2, 9, 5, 2),
                List.of(10, 5, 2, 15, 5));
        target = 720;
        System.out.println(solve(pyramid, target)); // Outputs: LRLL
    }
}
