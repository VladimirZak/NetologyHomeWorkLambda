package Lambda.Task2;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errCallback) {
        this.callback = callback;
        this.errCallback = errCallback;
    }

    public void start() {
        for (int i = 0; i < 50; i++) {
            if (i+1 != 33)
            callback.onDone("Task " + (i+1) + " is done");
            else {
                errCallback.onError("Error! Task " + 33 + " didn't complete.");
            };
        }
    }
}
