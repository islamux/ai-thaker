package com.example.aithaker.data.local.database

import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.aithaker.data.local.entity.AthkarEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DatabaseCallback(
    private val scope: CoroutineScope
) : RoomDatabase.Callback() {

    override fun onCreate(db: SupportSQLiteDatabase) {
        super.onCreate(db)
        // Seed database with sample data when created
        // Note: In production, you would load from JSON files or API
    }

    companion object {
        fun getSampleMorningAthkar(): List<AthkarEntity> {
            return listOf(
                AthkarEntity(
                    id = "morning_1",
                    arabicText = "أَصْبَحْنَا وَأَصْبَحَ الْمُلْكُ لِلَّهِ، وَالْحَمْدُ لِلَّهِ، لَا إِلَهَ إِلَّا اللَّهُ وَحْدَهُ لَا شَرِيكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيرٌ",
                    transliteration = "Asbahna wa-asbaha almulku lillah, walhamdu lillah, la ilaha illa Allah wahdahu la shareeka lah, lahu almulku walahu alhamdu wahuwa 'ala kulli shay'in qadeer",
                    translationEn = "We have entered upon the morning and with us the dominion entered upon Allah, and all praise is due to Allah. There is no god but Allah alone, with no partner or associate. His is the dominion, and His is the praise, and He is Able to do all things.",
                    translationAr = null,
                    category = "MORNING",
                    repeatCount = 1,
                    reference = "مسلم ٤/٢٠٨٨",
                    audioUrl = null,
                    isFavorite = false,
                    orderIndex = 1
                ),
                AthkarEntity(
                    id = "morning_2",
                    arabicText = "اللَّهُمَّ بِكَ أَصْبَحْنَا، وَبِكَ أَمْسَيْنَا، وَبِكَ نَحْيَا، وَبِكَ نَمُوتُ، وَإِلَيْكَ النُّشُورُ",
                    transliteration = "Allahumma bika asbahna, wabika amsayna, wabika nahya, wabika namootu, wa-ilayka an-nushoor",
                    translationEn = "O Allah, by You we enter upon the morning, and by You we enter upon the evening. By You we live, and by You we die, and to You is the resurrection.",
                    translationAr = null,
                    category = "MORNING",
                    repeatCount = 1,
                    reference = "الترمذي ٥/٤٦٦",
                    audioUrl = null,
                    isFavorite = false,
                    orderIndex = 2
                ),
                AthkarEntity(
                    id = "morning_3",
                    arabicText = "اللَّهُمَّ أَنْتَ رَبِّي لَا إِلَهَ إِلَّا أَنْتَ، خَلَقْتَنِي وَأَنَا عَبْدُكَ، وَأَنَا عَلَى عَهْدِكَ وَوَعْدِكَ مَا اسْتَطَعْتُ",
                    transliteration = "Allahumma anta rabbee la ilaha illa ant, khalaqtanee wa-ana 'abduk, wa-ana 'ala 'ahdika wa-wa'dika ma astata't",
                    translationEn = "O Allah, You are my Lord. There is no god but You. You created me, and I am Your slave. I am keeping my covenant and my promise to You as much as I can.",
                    translationAr = null,
                    category = "MORNING",
                    repeatCount = 1,
                    reference = "البخاري ٧/١٥٠",
                    audioUrl = null,
                    isFavorite = false,
                    orderIndex = 3
                )
            )
        }

        fun getSampleEveningAthkar(): List<AthkarEntity> {
            return listOf(
                AthkarEntity(
                    id = "evening_1",
                    arabicText = "أَمْسَيْنَا وَأَمْسَى الْمُلْكُ لِلَّهِ، وَالْحَمْدُ لِلَّهِ، لَا إِلَهَ إِلَّا اللَّهُ وَحْدَهُ لَا شَرِيكَ لَهُ",
                    transliteration = "Amsayna wa-amsa almulku lillah, walhamdu lillah, la ilaha illa Allah wahdahu la shareeka lah",
                    translationEn = "We have entered upon the evening and with us the dominion entered upon Allah, and all praise is due to Allah. There is no god but Allah alone, with no partner or associate.",
                    translationAr = null,
                    category = "EVENING",
                    repeatCount = 1,
                    reference = "مسلم ٤/٢٠٨٨",
                    audioUrl = null,
                    isFavorite = false,
                    orderIndex = 1
                ),
                AthkarEntity(
                    id = "evening_2",
                    arabicText = "اللَّهُمَّ بِكَ أَمْسَيْنَا، وَبِكَ أَصْبَحْنَا، وَبِكَ نَحْيَا، وَبِكَ نَمُوتُ، وَإِلَيْكَ الْمَصِيرُ",
                    transliteration = "Allahumma bika amsayna, wabika asbahna, wabika nahya, wabika namootu, wa-ilayka al-maseer",
                    translationEn = "O Allah, by You we enter upon the evening, and by You we enter upon the morning. By You we live, and by You we die, and to You is the final return.",
                    translationAr = null,
                    category = "EVENING",
                    repeatCount = 1,
                    reference = "الترمذي ٥/٤٦٦",
                    audioUrl = null,
                    isFavorite = false,
                    orderIndex = 2
                )
            )
        }
    }
}
