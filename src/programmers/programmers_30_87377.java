import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class programmers_30_87377 {
    public String[] solution(int[][] line) {
        List<int[]> crossPoints = new ArrayList<>();
        for (int i = 0; i < line.length; i++) {
            for (int[] line2 : Arrays.stream(line).toList().subList(i+1, line.length)) {
                Float[] crossPoint = cross(line[i], line2);
                if (crossPoint!=null){
                    float sum = crossPoint[0]+crossPoint[1];
                    if(sum%1==0){
                        crossPoints.add(Arrays.stream(crossPoint).mapToInt(Float::intValue).toArray());
                    }
                }
            }
        }
        int xmin = crossPoints.stream().min((p1,p2)->p1[0]-p2[0]).get()[0];
        int xmax = crossPoints.stream().min((x1,x2)->x2[0]-p1[0]).get()[0];
        int ymin = crossPoints.stream().min((x1,x2)->x1[0]-x2[0]).get()[0];
        int ymax = crossPoints.stream().min((x1,x2)->x2[0]-x1[0]).get()[0];
        List<String> field = new ArrayList<>();
        for

        String[] answer = {};
        return answer;
    }

    public Float[] cross(int[] line1, int[] line2){
        Float a = (float) line1[0];
        Float b = (float) line1[1];
        Float c = (float) line1[2];
        Float d = (float) line2[0];
        Float e = (float) line2[1];
        Float f = (float) line2[2];

        if ((a*d-b*c)==0){
            return null;
        }else{
            return new Float[]{(b*f-e*d)/(a*d-b*c), (e*c-a*f)/(a*d-b*c)};
        }
    }

    public static void main(String[] args){
        programmers_30_87377 inst = new programmers_30_87377();
        System.out.println(inst.solution(new int[]{1,2,3,4,5}));

    }
}
