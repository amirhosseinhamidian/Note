package com.amirhossein.note.domin.model

import java.net.IDN

data class Note(
    val id: Int,
    val title: String?,
    val mainText: String?,
    val createDate: Int,
    val updateDate: Int?,

)