package com.amirhossein.note.data.note.local

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "note_table")
data class NoteEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    @ColumnInfo(name = "title")
    val title: String,

    @ColumnInfo(name = "main_text")
    val mainText: String,

    @NonNull
    @ColumnInfo(name = "create_date")
    val createDate: Int,

    @ColumnInfo(name = "update_date")
    val updateDate: Int,

)
