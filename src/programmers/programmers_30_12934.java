package programmers;
class programmers_30_12934 {
    public long solution(long n) {
        double x = Math.sqrt(n);
        return x%1==0?(long) Math.pow(x+1,2):-1;
    }

    public static void main(String[] args) {
        programmers_30_12934 inst = new programmers_30_12934();

        System.out.println(inst.solution(121));
        System.out.println(inst.solution(3));
    }
}