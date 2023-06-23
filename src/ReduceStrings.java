import java.util.Arrays;
import java.util.List;

public class ReduceStrings {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Saurabhsks","Surya","Ishan","Isha");

        String result=names.stream().reduce((a,b)->a.length()>b.length()?a:b).get();
        System.out.println(result);

    }
}
