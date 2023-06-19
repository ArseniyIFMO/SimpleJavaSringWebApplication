package Arsenii;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/a")
    public String f() {
        return "ans";
    }
}

