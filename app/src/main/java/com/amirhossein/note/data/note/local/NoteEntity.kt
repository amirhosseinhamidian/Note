package com.amirhossein.note.data.note.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class NoteEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String? = null,
    val mainText: String? = null,
    val createDate: Date,
    val updateDate: Date? = null,
)
