import java.util.ArrayList;
import java.util.Scanner;

public class ColLesson04 {
    public ColLesson04() {
    }

    public static void main(String[] args) {
        ArrayList<Word> words = new ArrayList();
        System.out.println("わからない単語とその意味をスペースで区切って入力してください。");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int index;
        for(index = 0; !input.equals("e"); input = sc.nextLine()) {
            String[] tmp = input.split("");
            Word wd = new Word(tmp[0], tmp[1]);
            words.add(wd);
            ++index;
            System.out.println("つぎの単語と意味を入力して下さい\"e\"で終了します。");
        }

        for(int i = 0; i < index; ++i) {
            System.out.println(words.get(i));
        }

        System.out.println(index + "件、登録しました。");
    }
}
