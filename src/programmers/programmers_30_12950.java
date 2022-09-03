class programmers_30_12950 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int col = arr1.length;
        int row = arr1[0].length;
        int[][] answer = new int[col][row];
        for (int i=0; i<arr1.length; i++){
            for (int j=0; j<arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        programmers_30_12950 inst = new programmers_30_12950();

        System.out.println(inst.solution(new int[][]{ { 1,2 },{ 2,3 } }, new int[][]{ { 3,4 },{ 5,6 } }));
        System.out.println(inst.solution(new int[][]{ { 1 },{ 2 } }, new int[][]{ { 3 },{ 5 } }));
    }
}