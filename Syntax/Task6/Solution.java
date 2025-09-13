import java.nio.charset.Charset;
import java.util.Scanner;

/* 
Купи слона
*/
class Solution {
    public static void main(String[] args) throws java.io.UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in, "Windows-1251");
        buyElephant(null, scanner);
    }

    static void buyElephant(String answer, Scanner scanner) throws java.io.UnsupportedEncodingException {
        if (answer == null) {
            System.out.println("Купи слона");
        } else if (answer.toLowerCase().equals("ок")) {
            System.out.println("Так-то лучше :) Список твоих отговорок:");
            throw new SecurityException();
        } else {
            System.out.println("Все говорят \"" + answer + "\", а ты купи слона");
        }
        String inp = scanner.nextLine();
        answer = new String(inp.getBytes("windows-1251"), Charset.forName("cp866")); //windows-1251
        try {
            buyElephant(answer, scanner);
        } catch (Exception e) {
            throw e;
        }
    }
}
