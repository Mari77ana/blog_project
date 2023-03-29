package com.example.blog_project.user

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class User(
    val username: String = "",
    val password: String = "",
    val title: String = "",
    val blogPost: String = ""
) {

    @PrimaryKey(autoGenerate = true)
    var id: Long? = null

}