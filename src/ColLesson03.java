//import java.util.Scanner;
//
//public class ColLesson03 {
//    public ColLesson03() {
//    }
//
//    public static void main(String[] args) {
//        int max_size = true;
//        Word[] words = new Word[5];
//        System.out.println("わからない単語とその意味をスペースで区切って入力してください。");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//
//        int index;
//        for(index = 0; !input.equals("e"); input = sc.nextLine()) {
//            if (index > 5) {
//                System.out.println("登録制限を越えました。登録済みのデータは以下になります。");
//                break;
//            }
//
//            String[] tmp = input.split(" ");
//            Word wd = new Word(tmp[0], tmp[1]);
//            words[index] = wd;
//            ++index;
//            System.out.println("次の単語の意味を入力してして下さい。\"e\"で終了します。");
//        }
//
//        for(int i = 0; i < index; ++i) {
//            System.out.println(words[i]);
//        }
//
//        System.out.println(index + "件、登録しました。");
//    }
//}
