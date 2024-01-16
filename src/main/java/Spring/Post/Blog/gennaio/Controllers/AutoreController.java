package Spring.Post.Blog.gennaio.Controllers;

import Spring.Post.Blog.gennaio.ClassiConcrete.Autore;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AutoreController {
    //---------------GET------
    @GetMapping
    public List<Autore> getAutore(List<Autore> autore){
        return autore;
    }

    @GetMapping("/{id}")
    public Autore authorId(@PathVariable long id){
        return authorId(id);
    }



    //----------POST------

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Autore autorePost(@RequestBody Autore body){
        return body;
    }

    //---------PUT-------

    @PutMapping("/{id}")
    public Autore autoreAggiornato(@PathVariable long id,@RequestBody Autore autoreBpdy){
      return autoreBpdy;
    }

    //---------DELETE-------

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Autore autoreEliminato(@PathVariable long id){
      return  autoreEliminato(id);
    }

}
