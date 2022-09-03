public class programmers_30_12925 {
    public int getStrToInt(String s){
        int answer=0;
        int sign = 1;

        for (char c:s.toCharArray()) {
            switch (c) {
                case '-':
                    sign = -1;
                    break;
                case '+':
                    break;
                default:
                    answer = answer*10 +(c-48);
            }

        }
        return answer*sign;
    }

    public static void main(String args[]) {
        programmers_30_12925 strToInt = new programmers_30_12925();
        System.out.println(strToInt.getStrToInt("-1234"));
        System.out.println(strToInt.getStrToInt("1234"));
        System.out.println(strToInt.getStrToInt("-1"));
        System.out.println(strToInt.getStrToInt("1"));
        System.out.println(strToInt.getStrToInt("+1234"));
        System.out.println(strToInt.getStrToInt("1234"));
        System.out.println(strToInt.getStrToInt("-1234"));
        System.out.println(strToInt.getStrToInt("1234"));
    }
}
