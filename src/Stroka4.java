import java.util.ArrayList;
import java.util.Scanner;

public class Stroka4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк ");
        int n = in.nextInt();
        String cc = in.nextLine();
        ArrayList<String> list = new ArrayList<String>();
        for ( int i = 0; i < n; i++) {
            System.out.print("Введите строку " + (i+1) + " ");
            String s = in.nextLine();
            StringBuilder stroka = new StringBuilder();
            s.chars().distinct().forEach(c -> stroka.append((char) c));
            String s_stroka = stroka.toString();
            list.add(i, s_stroka);

        }
        int max = list.get(0).length();
        String str = list.get(0);
        for (int i= 0; i <n; i++) {

            if (list.get(i).length() > max){
                max = list.get(i).length();
                str = list.get(i);
            }
        }
        System.out.print("Ответ: " + str);
        }

}

