package com.tarasov.weatherappkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform