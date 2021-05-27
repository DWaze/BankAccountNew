package models_1;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private String firstName;
    private String lastName;
    private LocalDateTime birthDate;
    private Address address;
}
