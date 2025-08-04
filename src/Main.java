import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(4);
        l.add(2);

        System.out.println(l.stream().filter(i->(i%2!=0)).collect(Collectors.toList()).size());

        List<Integer> ll = null;

//        Optional.of(ll).isPresent();

        // Using a merge function to handle duplicate keys
        Map<Integer, Integer> map = l.stream()
                .collect(Collectors.toMap(
                        key -> key, // key mapper
                        value -> value, // value mapper
                        (existing, replacement) -> existing // merge function, keeping existing value
                ));

        System.out.println(map);
    }
}