package com.example.blog_project.user

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class UserRepository ( private  val appDatabase: AppDatabase,
                       private  val coroutineScope: CoroutineScope
) {

    fun addUser(user: User){
        appDatabase.userDao().addUser(user)
    }

    fun getAllUsers(): List<User>{
        return appDatabase.userDao().getAllUsers()
    }

    fun performDatabaseOperation(dispatcher: CoroutineDispatcher,
                                 databaseOperation: suspend () -> Unit ){
        coroutineScope.launch(dispatcher){
            databaseOperation()
        }
    }
}