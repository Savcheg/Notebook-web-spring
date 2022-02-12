package me.savcheg.notebookwebspring.handlers;

import me.savcheg.notebookwebspring.entities.Note;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class NoteController {
    List<Note> notes = new ArrayList<>();

    @GetMapping("/notes")
    public List<Note> getNotes(){
        return notes;
    }

    @PostMapping("/newnote")
    public ResponseEntity<String> postNote(@RequestBody Note note){
        notes.add(note);
        return new ResponseEntity<>("Note added" ,HttpStatus.OK);
    }
}
