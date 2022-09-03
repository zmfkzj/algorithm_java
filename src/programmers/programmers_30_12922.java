class programmers_30_12922 {
    public String solution(int n) {
        return "수박".repeat(n/2) + (n%2==1?"수":"");
    }


    public static void main(String[] args) {
        programmers_30_12922 inst = new programmers_30_12922();

        System.out.println(inst.solution(3));
        System.out.println(inst.solution(4));
    }
}