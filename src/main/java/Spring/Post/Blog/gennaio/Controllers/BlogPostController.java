package Spring.Post.Blog.gennaio.Controllers;

import Spring.Post.Blog.gennaio.ClassiConcrete.BlogPost;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogPosts")
public class BlogPostController {

    //---------------GET-------------
    @GetMapping
    @ResponseStatus(HttpStatus.OK)//questo darà codice di stato 200;
    public List<BlogPost> blog(List<BlogPost> blogPost){
       return blogPost;
    }

    @GetMapping("/{id}")
    public BlogPost blogId(@PathVariable long id){
       return blogId(id);
    }

    //----------------POST---------

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)//conferna post con codice di stato:201;
    public BlogPost aggiungiPost(@RequestBody BlogPost body){
        return body;
    }


    //-------------------PUT---------
    @PutMapping("/{id}")
    public BlogPost aggiornaPost(@PathVariable long id,@RequestBody BlogPost body){
        return body;
    }

    //---------------DELETE----------


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)//conferma della eliminazione con codice di stato:204;
    public void eliminaPost(@PathVariable long id){

    }









}
