package me.savcheg.notebookwebspring.repository;

import me.savcheg.notebookwebspring.entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
    Note findById(int id);
}
