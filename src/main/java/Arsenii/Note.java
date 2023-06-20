package Arsenii;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Note {
    public String value;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    public Note(String value) {
        this.value = value;
    }
}
