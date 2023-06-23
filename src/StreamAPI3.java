import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPI3 {
    public static void main(String[] args) {
        List<Integer> value= Arrays.asList(1,1,2,3,3,3,3,5,7,7);
        Map<Object,Long> result=new HashMap<>();

        result=value.stream()
                .collect(Collectors.groupingBy(i->i,Collectors.counting()));
        System.out.println(result);
    }
}
