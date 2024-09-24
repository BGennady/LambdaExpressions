package LambdaExpressions.Worker;


public class Worker {
    private OnTaskDoneListener callback;

    // конструктор класса Worker, принимает интерфейс OnTaskDoneListener
    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    // метод для симуляции выполнения задач
    public void start() {
        for (int i = 0; i < 100; i++) {
            callback.onDone("Task " + i + " is done");
        }
    }
}