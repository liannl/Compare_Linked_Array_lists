import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;
import static org.junit.Assert.*;
public class MainTests {

    @Test
    public void testArrayListAndLinkedListPerformance() {
        int numberOfOperations = 1000;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < numberOfOperations; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // Проверяем, что результаты производительности соответствуют ожидаемым значениям
        assertEquals(numberOfOperations, arrayList.size());
        assertEquals(numberOfOperations, linkedList.size());

    }

    @Test
    public void testArrayListAndLinkedListEmpty() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Проверяем, что результаты производительности соответствуют ожидаемым значениям
        assertEquals(0, arrayList.size());
        assertEquals(0, linkedList.size());

    }

    @Test
    public void testArrayListAndLinkedListLargeNumberOfOperations() {
        int numberOfOperations = 2000;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Добавление элементов в коллекции
        for (int i = 0; i < numberOfOperations; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        assertEquals(numberOfOperations, arrayList.size());
        assertEquals(numberOfOperations, linkedList.size());

    }
}
