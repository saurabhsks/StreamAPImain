import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> value= Arrays.asList(1,51,32,14,57,6,7,8,9);
        Integer result1=value.stream()
                .reduce(0,(a,b)->a+b); //0 is the initialisation value

        Integer result2=value.stream()
                .reduce(1,(a,b)->a*b);  // 1 is initialisation value

        Integer max=value.stream()
                        .reduce(0,(a,b)->a>b?a:b);// Find max element using reduce

        Integer min=value.stream()
                .reduce(999999,(a,b)->a<b?a:b);// Find min element using reduce

        System.out.println(result1);
        System.out.println(result2);

        System.out.println(min);
        System.out.println(max);
    }
}
