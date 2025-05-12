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

    @Column(name = "description")
    private String description;

    @Column(name="duration")
    private Integer duration; // minutes
    @Column(name="release_date")
    private LocalDate releaseDate;

    @Enumerated(EnumType.STRING)
    @Column(name="movietype")
    private MovieType type;// LE, BO, CHIEU_RAP
    @Column(name="status")
    private Boolean status;// true = đang hoạt động

    @Column(name="rating")
    private Double rating;
    @Column(name="name")
    private String name;
    @Column(name="slug")
    private String slug;
    @Column(name="poster")
    private String poster;
    @Column(name="release_year")

    private Integer releaseYear;

}
