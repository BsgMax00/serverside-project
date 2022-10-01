package be.thomasmore.bookserver.model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;
@NoArgsConstructor
@Data
@Entity
public class Serie {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genre_generator")
    @SequenceGenerator(name = "genre_generator", sequenceName = "genre_seq", allocationSize = 1)
    @Id
    int id;
    @NotBlank(message="Genre name should not be blank") @NotNull
    String name;


}
