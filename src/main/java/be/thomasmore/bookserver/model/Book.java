package be.thomasmore.bookserver.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@EqualsAndHashCode(exclude = {"authors"})
@ToString(exclude = {"authors"})
@Entity
public class Book {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_generator")
    @SequenceGenerator(name = "book_generator", sequenceName = "book_seq", allocationSize = 1)
    @Id
    private int id;

    @NotBlank(message = "Book Title should not be blank")
    @NotNull
    private String title;

    private String description;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Author> authors;
}

