package com.amirhossein.note.domin.repository

import com.amirhossein.note.domin.model.Note
import com.amirhossein.note.util.Resource
import kotlinx.coroutines.flow.Flow

interface NoteRepository {
    fun getAllNotes(): Flow<Resource<List<Note>>>
    fun getNoteById(id: Int): Flow<Resource<Note>>
    suspend fun addNote(note: Note)
}