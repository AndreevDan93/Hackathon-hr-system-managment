package hackathon.ru.service.vacancy.iService;

import hackathon.ru.data.dto.vacancy.WorkFormatDto;
import hackathon.ru.data.model.vacancy.WorkFormat;

import java.util.List;

public interface WorkFormatService {
    WorkFormat getWorkFormatById(Long id);

    List<WorkFormat> getAllWorkFormats();

    WorkFormat createWorkFormat(WorkFormatDto workFormatDto);
}
