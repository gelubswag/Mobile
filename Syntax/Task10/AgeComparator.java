import java.util.Comparator;
/* 
Сортировка по возрасту
*/
public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student2.age - student1.age;
    }
}
