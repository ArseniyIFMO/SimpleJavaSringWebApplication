package Arsenii;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    NoteRepo noteRepo;

    @PostMapping("/add/{text}")
    public String add(@PathVariable String text) {
        System.out.print("text is" + text);
        noteRepo.save(new Note(text));
        System.out.print(noteRepo.count());
        return "ans";
    }

    @GetMapping("/all")
    public String get() {
        List<String> answer = new ArrayList<>();
        noteRepo.findAll().forEach(it -> answer.add(it.value));
        return answer.toString();
    }
}

