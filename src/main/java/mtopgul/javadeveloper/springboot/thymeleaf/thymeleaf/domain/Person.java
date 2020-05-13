package mtopgul.javadeveloper.springboot.thymeleaf.thymeleaf.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Muhammed Topgul.
 * Date: 13.05.2020
 * Time: 21:49
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private Integer id;
    private String firstName;
    private String lastName;
    private Address address;

    public Person(Integer id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public Person(Integer id, String firstName, Address address) {
        this.id = id;
        this.firstName = firstName;
        this.address = address;
    }
}
