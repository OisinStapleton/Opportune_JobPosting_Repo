package ie.atu.opportune_jobposting.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class JobPosting {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    @NotBlank(message = "Title is required")
    @Size(min = 2, max = 100)
    private String title;

    @NotBlank(message = "Description required")
    @Size(min = 5, max = 300)
    private String description;

    @NotBlank(message = "Skills required")
    private String skills;

    @Min(value = 20000, message = "Minimum Salary is 20000")
    @Max(value = 200000, message = "Maximum Salary is 20000")
    private int salary;

    @NotBlank(message = "Location required")
    private String location;

    @NotNull(message = "Employer ID required")
    @Positive(message = "Employer ID must be positive")
    private int employerId;

}
