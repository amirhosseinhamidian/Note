package com.amirhossein.note.data.mapper

import com.amirhossein.note.data.note.local.NoteEntity
import com.amirhossein.note.domin.model.Note

fun NoteEntity.toNote(): Note {
    return Note(
        id = id,
        title = title,
        mainText = mainText,
        createDate = createDate,
        updateDate = updateDate,

    )
}

fun Note.toNoteEntity(): NoteEntity {
    return NoteEntity(
        id = id,
        title = title ?: "",
        mainText = mainText ?: "",
        createDate = createDate,
        updateDate = updateDate ?: -1,
    )
}