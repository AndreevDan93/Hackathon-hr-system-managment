package hackathon.ru.repository;


import hackathon.ru.model.vacancy.Vacancy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacancyStatusRepository extends JpaRepository<Vacancy, Long> {
}