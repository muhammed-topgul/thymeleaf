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
    private String name;
    private Address address;

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


}
