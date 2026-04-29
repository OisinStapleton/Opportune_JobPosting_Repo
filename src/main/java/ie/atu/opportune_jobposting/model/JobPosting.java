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


    private int jobID;

    @NotBlank(message = "Title is required")
    private String jobTitle;

    @NotNull(message = "Description required")
    private String jobDescription;

    @NotNull(message = "Skills required")
    private String jobSkills;

    @Min(value = 20000)
    @Max(value = 200000)
    @PositiveOrZero(message = "Only positive numbers are alllowed")
    private int salaryRange;

    @NotBlank(message = "Location required")
    private String jobLocation;

    @PositiveOrZero(message = "Only positive numbers are allowed")
    private int jobEmployerID;

}
