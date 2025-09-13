import java.time.LocalTime;

/* 
Нужно просто посчитать
*/
public class Solution {
    public static void main(String[] args) throws InterruptedException {
        LocalTime localTime = LocalTime.MIDNIGHT;
        LocalTime next = amazingMethod(localTime);
        while (next.isAfter(localTime)) {
            System.out.println(next);
            next = amazingMethod(next);
            Thread.sleep(500);
            if (next.isAfter(LocalTime.MIDNIGHT.plusMinutes(288 * 4))) {
                break;
            }
        }
    }
    static LocalTime amazingMethod(LocalTime base) 
{
        return base.plusMinutes(288);
    }
}
