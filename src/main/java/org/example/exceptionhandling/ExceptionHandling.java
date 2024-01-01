package org.example.exceptionhandling;

public class ExceptionHandling {
    public static int tryReturn() {
        try {
//            return 1;
            throw new Exception();
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    public static void main(String[] args) {
        /* output will be 3 because the return statement in finally
        will override retrun statements in try and catch*/
        System.out.println(tryReturn());
    }
}
