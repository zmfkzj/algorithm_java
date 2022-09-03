public class WhileExam {
    public static void main(String[] args){
        int a = 5;
        int b = 3;

        char star = '*';
        for (int i = 0; i < b; i++) {
            for (int j=0; j<a; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
