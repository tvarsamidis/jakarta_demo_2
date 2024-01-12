package gr.codehub.jak20242.exceptions;

import gr.codehub.jak20242.model.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoClosableTest {

    public static void main(String[] args) {

        try {
            runExternalDemo("data\\simple_text_siyfsiveiy8ywiv.txt");
        } catch (Exception e) {
            System.out.println("I am sorry but this is not possible right now - please try again later");
        }
    }

    private static void runExternalDemo(final String fileName)  {
        System.out.println("Opening file");
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            while (true) {
                System.out.println("Reading file");
                String s = br.readLine();
                if (s == null) {
                    break;
                }
                System.out.println(s);
            }
        } catch (Exception e) {

        }
        System.out.println("Closing file");

    }


}
