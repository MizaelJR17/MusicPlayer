package br.com.musicplayer

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform