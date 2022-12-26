import java.util.Iterator;
import java.util.List;

//Задание 1. Класс Группа содержит в себе коллекцию Студентов. По группе можно перемещаться с помощью итератора. 
//(Это повторяет 1-ю задачу из классной работы). 
//Остальные задачи надстраиваются поверх неё. 

public class StudentGroup implements Iterable<Student> {

    private List<Student> students;

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public int getSize() {
        return this.students.size();
    }

    public Student get(int index) {
        return students.get(index);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupListIterator(this);
    }
}
