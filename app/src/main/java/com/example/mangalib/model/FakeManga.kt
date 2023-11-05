package com.example.mangalib.model

import androidx.annotation.DrawableRes

data class FakeMangas (
    val mangaName: String,
    val numCaps: Int,
    val description: String,
    @DrawableRes val coverManga: Int
)

class FakeMangasBuilder{
    var mangaName: String = ""
    var numCaps: Int = 0
    var description: String = ""
    var coverManga: Int = 0

    fun buildManga() : FakeMangas {
        return FakeMangas(mangaName, numCaps, description, coverManga)
    }
}

fun manga(newManga: FakeMangasBuilder.() -> Unit): FakeMangas {
    return FakeMangasBuilder().apply(newManga).buildManga()
}

fun fakeManga() = mutableListOf(
    manga {
        mangaName = "Berserk"
        numCaps = 237
        description = "Test description"
        coverManga = 0
    },
    manga {
        mangaName = "Bleach"
        numCaps = 237
        description = "Test description"
        coverManga = 0
    },
    manga {
        mangaName = "One Piece"
        numCaps = 237
        description = "Test description"
        coverManga = 0
    },
    manga {
        mangaName = "Vagabond"
        numCaps = 237
        description = "Test description"
        coverManga = 0
    },
    manga {
        mangaName = "Shingeki no Kiyojin"
        numCaps = 237
        description = "Test description"
        coverManga = 0
    },
    manga {
        mangaName = "Haikyuu!!"
        numCaps = 237
        description = "Test description"
        coverManga = 0
    },
    manga {
        mangaName = "Naruto"
        numCaps = 237
        description = "Test description"
        coverManga = 0
    }, manga {
        mangaName = "Tokyo Ghoul"
        numCaps = 237
        description = "Test description"
        coverManga = 0
    }, manga {
        mangaName = "Soul Eater"
        numCaps = 237
        description = "Test description"
        coverManga = 0
    }, manga {
        mangaName = "Gachiakuta"
        numCaps = 237
        description = "Test description"
        coverManga = 0
    },
    manga {
        mangaName = "Kagurabachi"
        numCaps = 237
        description = "Test description"
        coverManga = 0
    },
    manga {
        mangaName = "DanDaDan"
        numCaps = 237
        description = "Test description"
        coverManga = 0
    },
    manga {
        mangaName = "Kaijuu 8"
        numCaps = 237
        description = "Test description"
        coverManga = 0
    },
    manga {
        mangaName = "Ao Ashi"
        numCaps = 237
        description = "Test description"
        coverManga = 0
    },
    manga {
        mangaName = "Yowamushi no Pedal"
        numCaps = 237
        description = "Test description"
        coverManga = 0
    },
    manga {
        mangaName = "Kamer Rider Black RX"
        numCaps = 237
        description = "Test description"
        coverManga = 0
    }
)