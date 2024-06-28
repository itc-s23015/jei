/*
s23015
stringbuilderクラスを使って与えられた引数を連結し、表示する課題実行の際は引数を受け取るよう設計
実行例
> java d49Q6kadai01 It カレッジ沖縄
*/

import java.lang.StringBuilder;

public class d49Q6kadai01 {
    public static void main(String[] args) {
	StringBuilder sb = new StringBuilder();
	for(int i = 0;i < args.length; i++) {
	    sb.append(args[i]);
	}
	System.out.println(sb.toString());
    }
}
