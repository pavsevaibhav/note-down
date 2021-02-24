package com.pavsevaibhav.notedown.service.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.pavsevaibhav.notedown.service.dao.NoteDao;
import com.pavsevaibhav.notedown.service.model.Note;
import com.pavsevaibhav.notedown.service.utils.Constants;

@Database(entities = {Note.class}, exportSchema = false, version = 1)
public abstract class NoteDatabase extends RoomDatabase {
    private static NoteDatabase notesDatabase;

    public static synchronized NoteDatabase getNotesDatabase(Context context) {
        if (notesDatabase == null) {
            notesDatabase = Room.databaseBuilder(
                    context,
                    NoteDatabase.class,
                    Constants.DATABASE_NAME
            ).build();
        }
        return notesDatabase;
    }
    public abstract NoteDao noteDao();
}
