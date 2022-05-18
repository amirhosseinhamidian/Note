package com.amirhossein.note.data.note.local

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.amirhossein.note.util.Resource
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDoa {

    @Insert(onConflict = REPLACE)
    suspend fun insertNote(noteEntity: NoteEntity): Long

    @Delete
    suspend fun deleteNote(noteEntity: NoteEntity): Long

    @Update
    suspend fun updateNote(noteEntity: NoteEntity): Long

    @Query("SELECT * FROM note_table")
    suspend fun getAllNotes(): List<NoteEntity>

    @Query("SELECT * FROM note_table WHERE id=:noteId")
    suspend fun getNoteById(noteId :Int): NoteEntity
}