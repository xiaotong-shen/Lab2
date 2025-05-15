import java.util.List;

public class DataTypes {
    public static long sum(List<Integer> numbers) {

        long s = 0;
        // the solution is changing it to long
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}
