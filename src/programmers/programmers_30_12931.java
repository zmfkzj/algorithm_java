class programmers_30_12931 {
    public int solution(int n) {
        return String.valueOf(n).chars().map(x->x-'0').sum();
    }


    public static void main(String[] args) {
        programmers_30_12931 inst = new programmers_30_12931();

        System.out.println(inst.solution(123));
        System.out.println(inst.solution(987));
    }
}