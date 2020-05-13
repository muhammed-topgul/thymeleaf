package mtopgul.javadeveloper.springboot.thymeleaf.thymeleaf.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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

    @NotNull(message = "Can not be null")
    private Integer id;

    @NotBlank(message = "Can not be null")
    @Size(min = 2, max = 10, message = "size must be between 2 and 10")
    private String firstName;

    @NotBlank(message = "Can not be null")
    @Size(min = 2, max = 10, message = "size must be between 2 and 10")
    private String lastName;

    @Valid
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
