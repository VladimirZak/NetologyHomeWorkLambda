package Lambda.Task2;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String error);
}
