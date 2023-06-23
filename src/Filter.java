import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Saurabh","Surya","Ishan","Isha");
        List<String>result1=names.stream().filter(i->i.startsWith("S")).collect(Collectors.toList());
        List<String>result2=names.stream().filter(i->i.endsWith("a")).collect(Collectors.toList());

        System.out.println(result1);
        System.out.println(result2);
    }
}
