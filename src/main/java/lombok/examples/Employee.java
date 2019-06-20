package lombok.examples;

import lombok.*;
import lombok.experimental.Wither;

import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Value
@Builder
@AllArgsConstructor
@Wither
public class Employee {
    @NonNull
    private String name;
    @NonNull
    private Integer age;
    private int salary;

    @Singular("דג")
    private List<String> fish;

    @Singular
    private Map<String,Integer> beers;

}
