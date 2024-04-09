# Desafio 100

Comarando o Desempenho de uma ArrayList vs LinkedList

## Resultado

```java
import java.util.*;

public class Day100 {
    public static void main(String[] args) {
        int size = 100000;
        Random rand = new Random();
        List<Integer> arrayList = new ArrayList<>(), linkedList = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            int num = rand.nextInt(100);
            arrayList.add(num);
            linkedList.add(num);
        }

        long[] times = new long[6];
        times[0] = measureTime(() -> addElements(arrayList, size));
        times[1] = measureTime(() -> addElements(linkedList, size));
        times[2] = measureTime(() -> getElements(arrayList, size));
        times[3] = measureTime(() -> getElements(linkedList, size));
        times[4] = measureTime(() -> removeElements(arrayList));
        times[5] = measureTime(() -> removeElements(linkedList));

        System.out.printf("Adicionar: ArrayList: %d ns, LinkedList: %d ns\nObter: ArrayList: %d ns, LinkedList: %d ns\nRemover: ArrayList: %d ns, LinkedList: %d ns\n", times[0], times[1], times[2], times[3], times[4], times[5]);
    }

    static void addElements(List<Integer> list, int size) {
        for (int i = 0; i < size; i++) list.add(i);
    }

    static void getElements(List<Integer> list, int size) {
        for (int i = 0; i < size; i++) list.get(i);
    }

    static void removeElements(List<Integer> list) {
        list.clear();
    }

    static long measureTime(Runnable task) {
        long start = System.nanoTime();
        task.run();
        return System.nanoTime() - start;
    }
}
```