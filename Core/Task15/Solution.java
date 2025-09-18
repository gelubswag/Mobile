
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        int minByte = 255;
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                int currentByte = fileInputStream.read();
                if (currentByte < minByte) {
                    minByte = currentByte;
                }
            }
        }
        System.out.println(minByte);
        System.out.println((char) minByte);
    }
}
