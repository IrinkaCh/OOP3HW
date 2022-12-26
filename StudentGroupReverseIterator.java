//Задание 3. Создайте класс ReverseIterator, который работает как итератор по группе в обратном направлении:
//• Он отслеживает текущую позицию в переборе
//• Он изначально выставлен на конечную позицию
//• Он движется справа налево
//Проверьте, как он работает.

import java.util.Iterator;

public class StudentGroupReverseIterator implements Iterator<Student> {

    private StudentGroup studentGroup;
    private int index;

    public StudentGroupReverseIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
        this.index = studentGroup.getSize();
    }

    @Override
    public boolean hasNext() {
        return index > 0;
    }

    @Override
    public Student next() {
        return studentGroup.get(--index);
    }
}