package az.atlacademy.spring2.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public class User {
    private String name;
    private String lastname;
    private int age;
    private String adress;


}
