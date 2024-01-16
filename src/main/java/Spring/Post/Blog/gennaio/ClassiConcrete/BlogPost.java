package Spring.Post.Blog.gennaio.ClassiConcrete;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class BlogPost {
    private long id;
    private String categoria;
    private String titolo;
    private String contenuto;
    private String cover="https://si.photos/200/300";
    private LocalDate tempoDiLettura;

}
