package com.amirhossein.note.data.repository

import android.util.Log
import com.amirhossein.note.data.mapper.toNote
import com.amirhossein.note.data.mapper.toNoteEntity
import com.amirhossein.note.data.note.local.NoteDatabase
import com.amirhossein.note.domin.model.Note
import com.amirhossein.note.domin.repository.NoteRepository
import com.amirhossein.note.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NoteRepositoryImpl @Inject constructor(
     val db: NoteDatabase
): NoteRepository {

     private val dao = db.dao

     override fun getAllNotes(): Flow<Resource<List<Note>>> {
          return flow {
               emit(Resource.Loading(true))
               val notes = dao.getAllNotes()
               emit(Resource.Success(
                    data = notes.map { it.toNote() }
               ))
               emit(Resource.Loading(false))
          }
     }

     override fun getNoteById(id: Int): Flow<Resource<Note>> {
          return flow {
               emit(Resource.Loading(true))
               val note = dao.getNoteById(id)
               emit(Resource.Success(
                    data = note.toNote()
               ))
               emit(Resource.Loading(false))
          }
     }

     override suspend fun addNote(note: Note) {
          val noteId = dao.insertNote(note.toNoteEntity())
          Timber.e(noteId.toString())
     }
}