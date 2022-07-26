import java.util.*;

public class Spiral {

    static List<List<Integer>> spiral2(int x, int y, int d) {
        List<List<Integer>> result = new ArrayList<>();
        int[] directionX = {1, 0, -1, 0};
        int[] directionY = {0, -1, 0, 1};
        int move = 1;
        int newX = x;
        int newY = y;
        int directionIndex = 0;

        result.add(Arrays.asList(newX, newY));

        while (move <= d) {
            // move x
            newX = newX+(directionX[directionIndex]*move);
            
            result.add(Arrays.asList(newX, newY));
            directionIndex = (directionIndex+1) % 4;
            if (move == d) {
                // stop at x equals to terminate condition
                break;
            }
            // move y
            newY = newY+(directionY[directionIndex]*move);
            
            result.add(Arrays.asList(newX, newY));
            directionIndex = (directionIndex+1) % 4;
            move++;
        }
        
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(spiral2(1,1,3).toArray()));
        System.out.println(Arrays.deepToString(spiral2(1,1,10).toArray()));
    }
}
