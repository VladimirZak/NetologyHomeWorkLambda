package Lambda.Task2;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}