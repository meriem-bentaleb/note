package com.exemple.etudiant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
 class NoteService {
    @Autowired
    private NoteRepository noteRepository;

    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    public Optional<Note> getNoteById(Long id) {
        return noteRepository.findById(id);
    }

    public Note addNote(Note note) {
        return noteRepository.save(note);
    }

    public Optional<Note> updateNote(Long id, Note noteDetails) {
        if (noteRepository.existsById(id)) {
            noteDetails.setId(id);
            return Optional.of(noteRepository.save(noteDetails));
        }
        return Optional.empty();
    }

    public void deleteNote(Long id) {
        noteRepository.deleteById(id);
    }

    public List<Note> findAllNotes() {
        noteRepository.findAll();
        return List.of();
    }
}

