package org.example.functionalprogramming.streams;

import java.util.stream.IntStream;

public class ParallelStreams {
    /*
     * Parallel Stream
     * splits the source of data into multiple parts
     * process them parallely
     * combine the result
     */

    public static void parallelStream() {
        long startTime = System.currentTimeMillis();
        int supplier = IntStream
                .rangeClosed(1, 100000)
                .parallel()
                .sum();
        long endTime = System.currentTimeMillis();
        System.out.println("TimeTaken : " + (endTime - startTime));
    }

    public static void main(String[] args) {
        parallelStream();
    }
}
