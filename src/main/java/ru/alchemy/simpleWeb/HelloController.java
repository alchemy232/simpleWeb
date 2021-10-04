package ru.alchemy.simpleWeb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot2!";
    }
    @GetMapping("/top")
    public String index2() {
        return "kldsjlksdjfldsjflj";
    }

}