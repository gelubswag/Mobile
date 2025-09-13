import java.util.ArrayList;
/* 
Бухгалтерия
*/
public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
        System.out.println("" + waitingEmployees);
        System.out.println("" + alreadyGotSalaryEmployees);
        paySalary("Гвинно");
        System.out.println("" + waitingEmployees);
        System.out.println("" + alreadyGotSalaryEmployees);
        paySalary(null);
    }
    public static void paySalary(String name) {
        if (name == null) {
            System.out.println("Неизвестный сотрудник");
            return;
        }
        if (waitingEmployees.contains(name)) {
            final int employeeIndex = waitingEmployees.indexOf(name);
            waitingEmployees.set(employeeIndex, null);
            alreadyGotSalaryEmployees.add(name);
        }
    }
}
