package io.eflamm.notlelo.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
import java.util.*

@Entity
class Product(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    @ColumnInfo(name = "event_id")
    val eventId: Long,
    @ColumnInfo(name = "meal_id")
    val mealId: Long,
    val uuid: UUID,
    val name: String,
): Serializable {
    constructor(eventId: Long, mealId: Long, name: String): this(
        0,
        eventId,
        mealId,
        UUID.randomUUID(),
        name
    )
}
