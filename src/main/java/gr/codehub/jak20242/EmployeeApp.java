package gr.codehub.jak20242;

import gr.codehub.jak20242.model.Employee;

public class EmployeeApp {

    public static void main(String[] args) {

        Employee developer = new Employee();
        developer.setName("Thomas");

        developer.setAge(42);
        System.out.println(developer.getName() + " is " + developer.getAge() + " years old");

//        developer.setAge(42);
//        System.out.println(developer.getName() + " is " + developer.getAge() + " years old");
//
//        developer.setAge(0);
//        System.out.println(developer.getName() + " is " + developer.getAge() + " years old");


        System.out.println(developer.toString());


    }
}
