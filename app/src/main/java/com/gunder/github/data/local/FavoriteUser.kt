package com.gunder.github.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "favoriteUser")
data class FavoriteUser(
    val login: String,
    @PrimaryKey
    val id: String
) : Serializable