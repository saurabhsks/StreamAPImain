import java.util.Arrays;
import java.util.List;

public class Max{
    public static void main(String[] args) {
        List<Integer> value= Arrays.asList(1,51,32,14,57,6,7,8,9);
        Integer result=value.stream()
                .max((x,y)->x.compareTo(y)).get();

        System.out.println(result);
    }
}