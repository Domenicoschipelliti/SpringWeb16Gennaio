package Spring.Post.Blog.gennaio.ClassiConcrete;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Autore {
    private long id;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataDinascita;
    private String avatar="https://ui-avatars.com/api/?name= "+nome+" "+cognome;
}
