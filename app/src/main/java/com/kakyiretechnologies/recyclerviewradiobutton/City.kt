package com.kakyiretechnologies.recyclerviewradiobutton

import java.util.UUID

/**
 * @author Kakyire
 * Created by Daniel Frimpong on April 25, 2022.
 * https://github.com/kakyire
 */
data class City(
    val id: String = UUID.randomUUID().toString(), val name: String, var
    isChecked: Boolean = false
)
