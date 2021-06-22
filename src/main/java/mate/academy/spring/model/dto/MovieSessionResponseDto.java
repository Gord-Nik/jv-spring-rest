package mate.academy.spring.model.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import mate.academy.spring.model.CinemaHall;
import mate.academy.spring.model.Movie;

@AllArgsConstructor
@Data
public class MovieSessionResponseDto {
    private Long id;
    private Movie movie;
    private CinemaHall cinemaHall;
    private LocalDateTime localDateTime;
}