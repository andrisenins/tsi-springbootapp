package lv.tsi.springbootapp.resource;

import lv.tsi.springbootapp.model.HelloWorld;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.UUID;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // First iteration
    @RequestMapping("")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    // 2nd
    @RequestMapping("/json")
    public @ResponseBody
    HelloWorld hello() {
        return new HelloWorld(UUID.randomUUID().toString(), "Hello, World!", LocalDate.now());
    }


}