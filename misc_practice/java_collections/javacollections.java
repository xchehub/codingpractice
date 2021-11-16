import java.util.*;

public class javacollections {
    public static void main(String[] args) {
        List<String> rockBands = new ArrayList<>();
        rockBands.add("Gun N Roses");
        rockBands.add("Motely Crue");
        rockBands.add("Soda Stereo");

        System.out.println(rockBands.toString());

        rockBands.remove("Motely Crue");
        System.out.println(rockBands.toString());

        System.out.println(rockBands.isEmpty());
        System.out.println(rockBands.size());
        System.out.println(rockBands.contains("Gun N Roses"));

        rockBands.clear();
        System.out.println(rockBands.size());
    }
}