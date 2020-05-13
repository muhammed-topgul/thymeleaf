package mtopgul.javadeveloper.springboot.thymeleaf.thymeleaf.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
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
public class Address {

    @NotBlank(message = "Can not be null")
    @Size(min = 2, max = 10, message = "street error")
    private String street;

    @NotBlank(message = "Can not be null")
    @Size(min = 2, max = 10, message = "state error")
    private String state;

    @NotBlank(message = "Can not be null")
    @Size(min = 2, max = 10, message = "zip code error")
    private String zipCode;

}
