package com.saran.jpa.Controllers;

import com.saran.jpa.Models.Author;
import com.saran.jpa.Repository.AuthorRepository;
import com.saran.jpa.Services.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthorController {
    private final AuthorService authorService;
    private final AuthorRepository authorRepository;

    public AuthorController(AuthorService authorService, AuthorRepository authorRepository) {
        this.authorService = authorService;
        this.authorRepository = authorRepository;
    }
    @GetMapping("/")
        public String sayhello() {
            return authorService.hello();
        }

        @PostMapping("/author")
       public Author saveAuthor(@RequestBody Author author) {
        return authorService.save(author);
        }


    @DeleteMapping("/author/{author-id}")
    @ResponseStatus(HttpStatus.OK)
    public String deletestu(@PathVariable ("author-id") Integer id) {
       return authorService.deletestudent(id);
    }

}
