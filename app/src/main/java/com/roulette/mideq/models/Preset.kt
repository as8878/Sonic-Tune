package com.roulette.mideq.models

import androidx.annotation.StringRes

data class Preset(
    @StringRes
    val id: Int,
    val map: Map<Int, Float>
)