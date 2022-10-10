package be.thomasmore.bookserver.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@Data
@EqualsAndHashCode(exclude = {"books"})
@ToString(exclude = {"books"})
@Entity
public class Award {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "award_generator")
    @SequenceGenerator(name = "award_generator", sequenceName = "award_seq", allocationSize = 1)
    @Id
    private int id;

    private String title;

    private String info;

    @ManyToMany(mappedBy = "awards", fetch = FetchType.LAZY)
    private Set<Book> books;

    public Award(int id){
        this.id = id;
    }
}