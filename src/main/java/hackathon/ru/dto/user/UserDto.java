package hackathon.ru.dto.user;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    @NotBlank(message = "Email should not be Empty")
    @Email(message = "Incorrect Email")
    private String email;

    @NotBlank(message = "Password should not be Empty")
    @Size(min = 3, max = 100, message = "Password should be between at 3 to 100 symbols")
    private String password;

    @NotBlank(message = "First Name should not be Empty")
    private String firstName;

    @NotBlank(message = "Last Name should not be Empty")
    private String lastName;

    @NotBlank(message = "Phone Number should not be Empty")
    private String phoneNumber;
}