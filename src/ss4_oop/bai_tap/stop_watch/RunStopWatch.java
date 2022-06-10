package ss4_oop.bai_tap.stop_watch;

public class RunStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        long sum = 0;
        for (long i = 0; i < 1000000000; i++) {
            sum += i;
        }
        stopWatch.endTime();
        System.out.println(stopWatch.getElapsedTime());
    }
}
