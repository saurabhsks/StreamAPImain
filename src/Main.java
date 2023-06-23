import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Integer> value= Arrays.asList(1,2,2,2,3,4,5,7,7);
        List<Integer>result=new ArrayList<>();
//        for(int i:value)
//        {
//            if(i%2==0){
//               result.add(i);
//            }
//        }
//        System.out.println(result);

        result=value.stream()
                .filter(i->i%2==0)
                .collect(Collectors.toList());

        System.out.println(value);
    }
}