package be.thomasmore.bookserver.model;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@NoArgsConstructor
@Data
@Entity
public class Serie {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "serie_generator")
    @SequenceGenerator(name = "serie_generator", sequenceName = "serie_seq", allocationSize = 1)
    @Id
    private int id;

    private String name;



    public Serie(int id) {
        this.id = id;
    }




}
