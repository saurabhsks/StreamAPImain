import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI2 {
    public static void main(String[] args) {
        List<Integer> value= Arrays.asList(1,2,3,3,3,3,5,7,7);
      //  List<Integer> result;
        long result=0;
       // List<Integer>result=new ArrayList<>();
//        for(int i:value)
//        {
//            if(i==3){
//               result++;
//            }
//        }
//        System.out.println(result);

//        result=value.stream()
//                .filter(i->i==3)// if wanted to store any particular number in list run this code
//                .collect(Collectors.toList());  //O/P={3,3,3,3}
//



//        result=value.stream()
//                .filter(i->i==3)
//                .collect(Collectors.toList())
//                .size();

        result=value.stream()
                .filter(i->i==3)
                .count();

        System.out.println(result); // O/P=4


    }
}
