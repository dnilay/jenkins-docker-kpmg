package org.example.model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@Builder
@EqualsAndHashCode

public class Employee {
    private String employeeId;

    private String firstName;
    private String lastName;
    private String email;

    @Override
    public String toString() {
        return
                "employeeId='" + employeeId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'';
    }
}
