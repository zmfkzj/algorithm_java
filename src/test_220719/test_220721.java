import java.util.Arrays;
import java.util.HashMap;

public class test_220721 {
    public String[] solution(String[] arr, int n) {
        String[] answer = {};
        HashMap<String,Integer> map = new HashMap();
        for (String e:arr){
            if(map.containsKey(e)) {
                map.put(e, map.get(e) + 1);
            }else{
                map.put(e, 1);
            }
        }
        String[] uniqueArr = Arrays.stream(map.keySet().toArray()).filter(x->map.get(x)==1).toArray(String[]::new);

        return Arrays.stream(uniqueArr).sorted().sorted((a,b)->a.toCharArray()[n]-b.toCharArray()[n]).toArray(String[]::new);
    }

    public static void main(String[] args) {
        test_220721 method = new test_220721();
        System.out.println(Arrays.toString(method.solution(new String[]{"brush", "sun", "brush", "bed", "car"}, 1)));
        System.out.println(Arrays.toString(method.solution(new String[]{"banana", "cat", "car", "apple", "banana", "banana"}, 0)));
        System.out.println(Arrays.toString(method.solution(new String[]{"coke", "water", "glass", "dog", "dog", "yogurt", "vitamin"}, 2)));
    }
}