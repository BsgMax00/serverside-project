package be.thomasmore.bookserver.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
public class Award {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "award_generator")
    @SequenceGenerator(name = "award_generator", sequenceName = "award_seq", allocationSize = 1)
    @Id
    private int id;

    private String title;

    private String info;

    public Award(int id){
        this.id = id;
    }
}