package me.savcheg.notebookwebspring.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table
public class Note {
    @Id
    @Column
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    @NotBlank
    private String type;
    @Column
    @NotBlank
    private String title;
    @Column
    @NotBlank
    private String description;

    public Note(String type, String title, String description) {
        this.type = type;
        this.title = title;
        this.description = description;
    }

    public Note() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Note)) return false;

        Note note = (Note) o;

        if (getId() != note.getId()) return false;
        if (getType() != null ? !getType().equals(note.getType()) : note.getType() != null) return false;
        if (getTitle() != null ? !getTitle().equals(note.getTitle()) : note.getTitle() != null) return false;
        return getDescription() != null ? getDescription().equals(note.getDescription()) : note.getDescription() == null;
    }

    @Override
    public int hashCode() {
        int result = (0);
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        return result;
    }
}
