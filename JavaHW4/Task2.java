package JavaHW4;

import java.util.LinkedList;


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task2 {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}

class MyQueue<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Добавляет элемент в конец очереди
    public void enqueue(T element) {
        list.addLast(element);
    }

    // Возвращает и удаляет первый элемент очереди
    public T dequeue() {
        if (!list.isEmpty()) {
            return list.removeFirst();
        }
        return null; // Возвращаем null, если очередь пуста
    }

    // Возвращает первый элемент очереди без его удаления
    public T first() {
        if (!list.isEmpty()) {
            return list.getFirst();
        }
        return null; // Возвращаем null, если очередь пуста
    }

    // Возвращает все элементы очереди
    public LinkedList<T> getElements() {
        return new LinkedList<>(list); // Возвращаем копию списка, чтобы избежать изменений снаружи
    }
}