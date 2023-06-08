package class_object;

import java.util.Date;

public class StopWatch {
    private Date startTime, endTime;

    public StopWatch() {
        this.startTime = new Date();
    }

    public void start() {
        this.startTime = new Date();
    }

    public void end() {
        this.endTime = new Date();
    }

    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        stopWatch.end();

        System.out.println("Start: " + stopWatch.startTime);
        System.out.println("Stop: "+ stopWatch.endTime);
        System.out.println("Elapsed time in milliseconds: " + stopWatch.getElapsedTime());

        stopWatch.start();
        for (int i = 0; i < 100000; i++) {
            for (int j = i + 1; j < 100000; j++) {
                for (int k = i + 1; k < 100000; k++) {
                    //code
                }
            }
        }
        stopWatch.end();
        System.out.printf("Thời gian thực thi của thuật toán sắp xếp là: %d ms", stopWatch.getElapsedTime());
    }
}

