package me.savcheg.notebookwebspring.controllers;

import me.savcheg.notebookwebspring.entities.Note;
import me.savcheg.notebookwebspring.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    final NoteRepository notes;

    @Autowired
    public NoteController(NoteRepository notes) {
        this.notes = notes;
    }

    @GetMapping
    public List<Note> getNotes() {
        return notes.findAll();
    }

    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable int id) {
        return notes.findById(id);
    }

    @PostMapping("/new")
    public ResponseEntity<String> postNote(@RequestBody Note note) {
        notes.save(note);
        return ResponseEntity.ok("Note added");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteNote(@PathVariable long id) {
        notes.deleteById(id);
        return new ResponseEntity<>("Note deleted", HttpStatus.NO_CONTENT);
    }
}
