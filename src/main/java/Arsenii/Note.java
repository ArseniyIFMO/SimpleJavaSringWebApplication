package Arsenii;

import jakarta.persistence.Entity;
@Entity
public class Note {
    public String value;

    public Note(String value) {
        this.value = value;
    }
}
