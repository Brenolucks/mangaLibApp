package com.example.mangalib.model

import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.DrawableRes
import com.example.mangalib.R

data class FakeMangas (
    val mangaName: String,
    val numCaps: Int,
    val description: String,
    @DrawableRes val coverManga: Int
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(mangaName)
        parcel.writeInt(numCaps)
        parcel.writeString(description)
        parcel.writeInt(coverManga)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<FakeMangas> {
        override fun createFromParcel(parcel: Parcel): FakeMangas {
            return FakeMangas(parcel)
        }

        override fun newArray(size: Int): Array<FakeMangas?> {
            return arrayOfNulls(size)
        }
    }

}

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
        coverManga = R.drawable.splashicon
    },
    manga {
        mangaName = "Bleach"
        numCaps = 237
        description = "Test description"
        coverManga = R.drawable.ichigoicon
    },
    manga {
        mangaName = "One Piece"
        numCaps = 237
        description = "Test description"
        coverManga = R.drawable.luffyicon
    },
    manga {
        mangaName = "Vagabond"
        numCaps = 237
        description = "Test description"
        coverManga = R.drawable.musashiicon
    },
    manga {
        mangaName = "Shingeki no Kiyojin"
        numCaps = 237
        description = "Test description"
        coverManga = R.drawable.erenicon
    },
    manga {
        mangaName = "Haikyuu!!"
        numCaps = 237
        description = "Test description"
        coverManga = R.drawable.hinataicon
    },
    manga {
        mangaName = "Naruto"
        numCaps = 237
        description = "Test description"
        coverManga = R.drawable.naruto
    },
    manga {
        mangaName = "Tokyo Ghoul"
        numCaps = 237
        description = "Test description"
        coverManga = R.drawable.kanekiicon
    },
    manga {
        mangaName = "Soul Eater"
        numCaps = 237
        description = "Test description"
        coverManga = R.drawable.deaththekidicon
    },
    manga {
        mangaName = "Gachiakuta"
        numCaps = 237
        description = "Test description"
        coverManga = R.drawable.rudoicon
    },
    manga {
        mangaName = "Kagurabachi"
        numCaps = 237
        description = "Test description"
        coverManga = R.drawable.chihiroicon
    },
    manga {
        mangaName = "DanDaDan"
        numCaps = 237
        description = "Test description"
        coverManga = R.drawable.okarunicon
    },
    manga {
        mangaName = "Kaijuu 8"
        numCaps = 237
        description = "Test description"
        coverManga = R.drawable.kafka
    },
    manga {
        mangaName = "Ao Ashi"
        numCaps = 237
        description = "Test description"
        coverManga = R.drawable.ashito
    },
    manga {
        mangaName = "Yowamushi no Pedal"
        numCaps = 237
        description = "Test description"
        coverManga = R.drawable.onodaicon
    }
)