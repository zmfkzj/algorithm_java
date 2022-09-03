package programmers;
class programmers_30_12933 {
    public long solution(long n) {
        double answer = 0;
        double a = Math.pow(10, String.valueOf(n).length()-1);
        for (int i:String.valueOf(n).chars().map(x->x-'0').sorted().toArray()){
            answer=answer*0.1+i;
        }
        return (long) (answer*a);
    }


    public static void main(String[] args) {
        programmers_30_12933 inst = new programmers_30_12933();

        System.out.println(inst.solution(12345));
    }
}