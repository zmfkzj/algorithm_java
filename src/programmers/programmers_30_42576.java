import java.util.HashMap;

class programmers_30_42576 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String,Integer> parti = new HashMap();
        HashMap<String,Integer> compl = new HashMap();
        for (String p:participant){
            if (parti.containsKey(p)){
                parti.put(p, parti.get(p)+1);
            }else {
                parti.put(p, 1);
            }
        }
        for (String p:completion){
            if (compl.containsKey(p)){
                compl.put(p, compl.get(p)+1);
            }else{
                compl.put(p, 1);
            }
        }
        for (String p: compl.keySet()){
            parti.put(p,parti.get(p)-compl.get(p));
        }
        for (String p: parti.keySet()){
            if (parti.get(p).equals(1)){
                answer=p;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        programmers_30_42576 inst = new programmers_30_42576();

        System.out.println(inst.solution(new String[]{ "leo", "kiki", "eden" }, new String[]{ "eden", "kiki" }));
        System.out.println(inst.solution(new String[]{ "marina", "josipa", "nikola", "vinko", "filipa" }, new String[]{ "josipa", "filipa", "marina", "nikola" }));
        System.out.println(inst.solution(new String[]{ "mislav", "stanko", "mislav", "ana" }, new String[]{ "stanko", "ana", "mislav" }));
    }
}