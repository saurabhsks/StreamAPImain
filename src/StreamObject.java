import java.util.Arrays;
import java.util.List;

public class StreamObject {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("Saurabh","Surya","Ishan","Bittu");
        names.forEach(e->{
            System.out.println(e);
        });
    }
}
