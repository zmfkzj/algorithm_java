package programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class programmers_30_12915 {
    public String[] solution(String[] strings, int n) {
        Stream<String> firstSortedStrings = Arrays.stream(strings).sorted();
        return firstSortedStrings.sorted(Comparator.comparingInt(x -> x.chars().toArray()[n])).toArray(String[]::new);
    }

    public static void main(String[] args){
        programmers_30_12915 inst = new programmers_30_12915();
        System.out.println(Arrays.toString(inst.solution(new String[]{"sun", "bed", "car"}, 1)));
        System.out.println(Arrays.toString(inst.solution(new String[]{"abce", "abcd", "cdx"}, 2)));

    }
}
