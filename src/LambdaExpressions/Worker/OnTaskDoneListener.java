package LambdaExpressions.Worker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}