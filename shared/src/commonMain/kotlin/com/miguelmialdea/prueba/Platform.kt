package com.miguelmialdea.prueba

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform