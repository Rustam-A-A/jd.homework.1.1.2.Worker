public class Main {

    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener failedListener = System.out::println;;

        Worker worker = new Worker(listener, failedListener);

        worker.start();
    }
}
