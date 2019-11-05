package com.xinx.sample.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [

    ],
    version = 1,
    exportSchema = false)
abstract class SampleDb: RoomDatabase() {

    abstract fun userDao(): UserDao

}