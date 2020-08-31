package edu.employee.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
@Builder
public class Employee {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private Double salary;
}
