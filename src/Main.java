import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Переменная отвечающая за кол-во опреаций
        int numberOfOperations = 1000;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Добавление элементов в ArrayList
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfOperations; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long arrayListAddTime = endTime - startTime;

        // Добавление элементов в LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < numberOfOperations; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        long linkedListAddTime = endTime - startTime;

        // Удаление элементов из ArrayList
        startTime = System.nanoTime();
        for (int i = 0; i < numberOfOperations; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        endTime = System.nanoTime();
        long arrayListRemoveTime = endTime - startTime;

        // Удаление элементов из LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < numberOfOperations; i++) {
            linkedList.remove(linkedList.size() - 1);
        }
        endTime = System.nanoTime();
        long linkedListRemoveTime = endTime - startTime;

        // Получение элементов из ArrayList
        startTime = System.nanoTime();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        long arrayListGetTime = endTime - startTime;


        // Получение элементов из LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        long linkedListGetTime = endTime - startTime;


        // Вывод результатов
        System.out.println("Метод\t\t\tКоличество выполнений\tВремя выполнения (наносекунды)");
        System.out.println("----------------------------------------------------------");
        System.out.println("ArrayList.add()\t\t" + numberOfOperations + "\t\t\t" + arrayListAddTime);
        System.out.println("LinkedList.add()\t" + numberOfOperations + "\t\t\t" + linkedListAddTime);
        System.out.println("ArrayList.remove()\t" + numberOfOperations + "\t\t\t" + arrayListRemoveTime);
        System.out.println("LinkedList.remove()\t" + numberOfOperations + "\t\t\t" + linkedListRemoveTime);
        System.out.println("ArrayList.get()\t\t" + numberOfOperations + "\t\t\t" + arrayListGetTime);
        System.out.println("LinkedList.get()\t" + numberOfOperations + "\t\t\t" + linkedListGetTime);
    }
}
