// s23015
// while break 文追加　nの値を0にしてループ終了
public class d51Q26kadai {
    public static void main(String[] args) {
        int n = 1;
        String s = "";

        while (n == 1) {
            switch (n) {
                case 1:
                    s += "one";
                    break;
                case 2:
                    s += "two";
                    break;
                default:
                    s += "?";
                    break;
            }
            n = 0; 
        }
        System.out.println(s);
    }
}

