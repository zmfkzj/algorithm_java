package programmers;


import java.util.HashMap;

public class programmers_30_118666 {
    public String solution(String[] survey, int[] choices) {
        HashMap<String, Integer> score = new HashMap<>();
        score.put("R",0);
        score.put("T",0);
        score.put("C",0);
        score.put("F",0);
        score.put("J",0);
        score.put("M",0);
        score.put("A",0);
        score.put("N",0);
        int[] scores = new int[]{3,2,1,0,1,2,3};
        for (int i = 0; i < survey.length; i++) {
            String s = survey[i];
            String s1 = s.substring(0,1);
            String s2 = s.substring(1,2);
            String[] types = new String[]{s1, s1, s1, s1, s2, s2, s2};

            int c = choices[i];
            score.put(types[c-1], score.get(types[c-1])+scores[c-1]);
        }
        String base_result = "RCJA";
        if(score.get("R")<score.get("T")){
            base_result = base_result.replace("R","T");
        }
        if(score.get("C")<score.get("F")){
            base_result = base_result.replace("C","F");
        }
        if(score.get("J")<score.get("M")){
            base_result = base_result.replace("J","M");
        }
        if(score.get("A")<score.get("N")){
            base_result = base_result.replace("A","N");
        }
        return base_result;
    }

    public static void main(String[] args){
        programmers_30_118666 inst = new programmers_30_118666();
        System.out.println(inst.solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5,3,2,7,5}));
        System.out.println(inst.solution(new String[]{"TR", "RT", "TR"}, new int[]{7,1,3}));

    }
}
