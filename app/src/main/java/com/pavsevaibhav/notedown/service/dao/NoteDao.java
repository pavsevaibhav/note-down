package com.pavsevaibhav.notedown.service.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.pavsevaibhav.notedown.service.model.Note;

import java.util.List;

@Dao
public interface NoteDao {
    @Query("SELECT * FROM note_table ORDER BY id DESC")
    List<Note> getAllNotes();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertNote(Note note);

    @Delete
    void deleteNote(Note note);
}
