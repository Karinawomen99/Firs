package dz9.StreamApiOperation;

import java.util.List;

public class AnyMatchExample5 {
    public static void main(String[] args) {
       List<Integer> numbers =List.of(4,3,7,8,9,23);
       boolean hasEven =numbers.stream()
               .anyMatch(n->n %2 == 0);
       System.out.println("Содержит четное число:"+hasEven);
    }
}
