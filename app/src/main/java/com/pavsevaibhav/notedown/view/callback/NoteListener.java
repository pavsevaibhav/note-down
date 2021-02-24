package com.pavsevaibhav.notedown.view.callback;

import com.pavsevaibhav.notedown.service.model.Note;

public interface NoteListener {
    void onNoteClicked(Note note, int position);
}
