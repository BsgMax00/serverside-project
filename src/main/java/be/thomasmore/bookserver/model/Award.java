package be.thomasmore.bookserver.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
public class Award {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Award_generator")
    @SequenceGenerator(name = "Award_generator", sequenceName = "Award_seq", allocationSize = 1)
    @Id
    private int id;

    private String title;

    private String info;
}