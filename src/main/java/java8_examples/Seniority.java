package java8_examples;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;

@AllArgsConstructor
public enum Seniority {
    JUNIOR(10, 20),
    MEDIUM(21, 30),
    SENIOR(31, 40),
    UNKNOWN_SENIORITY(0, 0);

    public final int max;
    public final int min;

    public static Seniority getSeniority(Employee employee){
        return Arrays
                .stream(Seniority.values())
                .filter(seniority -> seniority.min <= employee.getSalary() && seniority.max >= employee.getSalary())
                .findFirst()
                .orElse(UNKNOWN_SENIORITY);
    }
}
