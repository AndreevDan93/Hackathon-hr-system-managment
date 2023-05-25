package hackathon.ru.data.dto.candidate;

import lombok.*;

import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

import static javax.persistence.TemporalType.TIMESTAMP;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CandidateDto {

    @NotBlank(message = "Expected salary should not be Empty")
    private String expectedSalary;

    @Temporal(TIMESTAMP)
    @NotBlank(message = "Birthday should not be Empty")
    private Date birthday;

    @NotBlank(message = "First Name should not be Empty")
    private String firstName;

    @NotBlank(message = "Mid Name should not be Empty")
    private String midName;

    @NotBlank(message = "Last Name should not be Empty")
    private String lastName;

    //    заполняется на беке парсингом
    private String fio;

    @NotBlank(message = "email should not be Empty")
    @Email(message = "Incorrect Email")
    private String email;

    @NotBlank(message = "phone should not be Empty")
    private String phone;

    @NotBlank(message = "telegram should not be Empty")
    private String telegram;

    @NotBlank(message = "skills should not be Empty")
    private String skills;

    @Lob
    private String description;

    @NotNull(message = "city should not be Empty")
    private Long cityId;

//    связи

    private List<Long> educationsIds;

    private List<Long> experiencesIds;

    private List<Long> applicationsIds;
}