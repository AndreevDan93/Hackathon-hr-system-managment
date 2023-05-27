package hackathon.ru.data.dto.candidate.custom;

import hackathon.ru.data.model.City;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CandidateForListDto {

    private String desiredPosition;

    private int expectedSalary;

    private City city; // город кандидата

    //    заполняется на беке парсингом
    private String fio;

    private String experience;

    private Integer experienceNumber;

    private String skills;

    private String phone;

    private String email;

    private String telegram;

//    private List<Application> applications;


    @Override
    public String toString() {
        return "CandidateForListDto{" +
                "desiredPosition='" + desiredPosition + '\'' +
                ", expectedSalary=" + expectedSalary +
                ", city=" + city +
                ", fio='" + fio + '\'' +
                ", experience='" + experience + '\'' +
                ", experienceNumber=" + experienceNumber +
                ", skills='" + skills + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", telegram='" + telegram + '\'' +
                '}';
    }
}