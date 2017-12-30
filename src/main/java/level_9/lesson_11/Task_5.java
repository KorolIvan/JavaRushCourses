package level_9.lesson_11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task_5 {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        String vpl = "";
        String notVpl = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] c = s.toCharArray();
        for(int i = 0; i<c.length; i++){
            if(isVowel(c[i]) == true) {
                vpl += c[i]+" ";
            }else {
                if (c[i] != ' ') {
                    notVpl += c[i] + " ";
                }
            }
        }
        System.out.println(vpl);
        System.out.println(notVpl);
        //напишите тут ваш код
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
