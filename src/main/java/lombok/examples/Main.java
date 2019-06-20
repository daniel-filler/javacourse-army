package lombok.examples;

import java.io.File;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {




        Employee employee = Employee.builder().name("JACK").age(22)
                .beer("tuborg", 1)
                .beer("leff", 3)
                .דג("Salamon")
                .build();
        Employee employee1 = employee.withName("Noya");

        System.out.println(employee1);
    }
}
