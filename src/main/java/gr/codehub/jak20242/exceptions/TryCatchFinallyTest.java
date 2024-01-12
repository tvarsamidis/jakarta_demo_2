package gr.codehub.jak20242.exceptions;

import java.io.IOException;

public class TryCatchFinallyTest {

    private static int getValue() {
        try {
            System.out.println("In try");
            String x = "5";  // try "4", "100", "a2", null
            System.out.println("Calling parseInt");
            int i = Integer.parseInt(x);
            System.out.println("Before IOException");
            if (i == 100)
                throw new IOException();
            System.out.println("Leaving try, will return i=" + i);
            return i;
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("In Exception, will return -1");
            return -1;
        } catch (IOException e) {
            System.out.println("In Exception, will return -2");
            return -2;
        } catch (Throwable w) {
            System.out.println("In Throwable, will return -3");
            return -3;
        } finally {
            System.out.println("In finally, will return -4");
            /// !!!!!!!! return -4;
        }
    }

    public static void main(String[] args) {
        System.out.println("In main method, starting");
        int i = getValue();
        System.out.println("In main method i is " + i);
    }
}
