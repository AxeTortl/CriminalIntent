package com.esslinger.msu.criminalintent

import java.util.*

data class Crime (
    val id: UUID,
    val title: String,
    val date: Date,
    val isSolved: Boolean,
    var requiresPolice: Boolean = false // Added
)