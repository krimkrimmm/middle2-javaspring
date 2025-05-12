package vn.scrip.middle.entity;

import jakarta.persistence.*;
import lombok.*;
import vn.scrip.middle.model.enums.MovieType;

import java.time.LocalDate;

@Entity
@Table(name = "movies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    @Column(length = 1000)
    private String description;

    private Integer duration; // minutes

    private LocalDate releaseDate;

    @Enumerated(EnumType.STRING)
    private MovieType type;// LE, BO, CHIEU_RAP

    private Boolean status;// true = đang hoạt động

    private Double rating;
}
