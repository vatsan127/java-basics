package org.example;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Console data!");
        TimeUnit.SECONDS.sleep(5);
        clearConsole();
        System.out.println("Console cleared!");
    }

    private static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                // If the operating system is Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // If the operating system is Unix-like (Linux, macOS)
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            // Handle exceptions as needed
            e.printStackTrace();
        }
    }
}
