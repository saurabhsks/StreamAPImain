import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> value= Arrays.asList(1,51,32,14,57,6,7,8,9);
        List<Integer> result2=value.stream().sorted().collect(Collectors.toList());

        System.out.println(result2);


    }
}
