package cz.vsb.magistri.dto;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    Integer id;
    String firstName;
    String lastName;
    LocalDate dateOfBirth;
}
