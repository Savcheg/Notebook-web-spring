package me.savcheg.notebookwebspring.controllers;

import me.savcheg.notebookwebspring.entities.Note;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {
    List<Note> notes = new ArrayList<>();

    @GetMapping
    public List<Note> getNotes(){
        return notes;
    }

    @PostMapping("/new")
    public ResponseEntity<String> postNote(@RequestBody Note note){
        notes.add(note);
        return ResponseEntity.ok("Note added");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteNote(@PathVariable int id){
        return new ResponseEntity<>("Don't work yet", HttpStatus.NOT_IMPLEMENTED);
    }
}
