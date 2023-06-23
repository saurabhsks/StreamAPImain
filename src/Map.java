import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        List<Integer> value= Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> result1=value.stream().
                map(i->i*i).collect(Collectors.toList());

        System.out.println(result1);

        List<Integer> result2=value.stream().
                map(i->i*i*i).collect(Collectors.toList());

        System.out.println(result2);

    }
}
