import java.io.PrintStream;
import java.util.Scanner;

public class ColLesson02 {
    public ColLesson02() {
    }

    public static void main(String[] args) {
        Word[] words = new Word[10];
        System.out.println("わからない単語とその意味をスペースで区切って入力してください。");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int index;
        for(index = 0; !input.equals("e"); input = sc.nextLine()) {
            String[] tmp = new String[2];
            tmp = input.split("");
            Word wd = new Word(tmp[0], tmp[1]);
            words[index] = wd;
            ++index;
            System.out.println("つぎの単語と意味を入力して下さい\"e\"で終了します。");
        }

        for(int i = 0; i < index; ++i) {
            PrintStream var10000 = System.out;
            String var10001 = words[i].getWord();
            var10000.println("単語" + var10001 + "日本語" + words[i].getMeaning());
        }

        System.out.println(index + "件、登録しました。");
    }
}
