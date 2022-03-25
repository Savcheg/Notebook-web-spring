package me.savcheg.notebookwebspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notes")
public class NoteViewController {

    @GetMapping
    public String getAllNotesPage() {
        return "notes";
    }

    @GetMapping("/new")
    public String getNewNotePage() {
        return "new_note";
    }
}
