package models_1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    private String city;
    private String streetName;
    private int streetNumber;
    private String country;
}
