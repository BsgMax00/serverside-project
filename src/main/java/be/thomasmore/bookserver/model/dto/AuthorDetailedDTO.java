package be.thomasmore.bookserver.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AuthorDetailedDTO {
    private int id;
    private String name;
    private String description;
    private String country;
    //more data will be inserted here later...
}
