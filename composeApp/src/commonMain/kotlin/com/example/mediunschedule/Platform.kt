package com.example.mediunschedule

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform