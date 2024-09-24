package LambdaExpressions.Worker;

public class Main {
    public static void main(String[] args) {
        // лямбда-выражение для определения поведения слушателя
        OnTaskDoneListener listener = System.out::println;

        // создаем экземпляр класса Worker и передаем слушателя в конструктор
        Worker worker = new Worker(listener);

        // запуск
        worker.start();
    }
}