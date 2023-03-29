package com.example.blog_project.user

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface UserDao {
    @Insert
    fun addUser(user: User)

    @Query("SELECT * FROM User")
    fun  getAllUsers(): List<User>
}