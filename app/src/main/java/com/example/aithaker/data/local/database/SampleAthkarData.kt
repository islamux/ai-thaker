package com.example.aithaker.data.local.database

import com.example.aithaker.data.local.entity.AthkarEntity

object SampleAthkarData {
    
    fun getMorningAthkar(): List<AthkarEntity> {
        return listOf(
            AthkarEntity(
                id = "morning_1",
                arabicText = "أَصْبَحْنَا وَأَصْبَحَ الْمُلْكُ لِلَّهِ، وَالْحَمْدُ لِلَّهِ، لَا إِلَهَ إِلَّا اللَّهُ وَحْدَهُ لَا شَرِيكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيرٌ",
                transliteration = "Asbahna wa-asbaha almulku lillah, walhamdu lillah, la ilaha illa Allah wahdahu la shareeka lah, lahu almulku walahu alhamdu wahuwa 'ala kulli shay'in qadeer",
                translationEn = "We have entered upon the morning and with it all the dominion belongs to Allah. All praise is due to Allah. There is no god but Allah alone, with no partner. His is the dominion, and His is the praise, and He is Able to do all things.",
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
                arabicText = "اللَّهُمَّ أَنْتَ رَبِّي لَا إِلَهَ إِلَّا أَنْتَ، خَلَقْتَنِي وَأَنَا عَبْدُكَ، وَأَنَا عَلَى عَهْدِكَ وَوَعْدِكَ مَا اسْتَطَعْتُ، أَعُوذُ بِكَ مِنْ شَرِّ مَا صَنَعْتُ، أَبُوءُ لَكَ بِنِعْمَتِكَ عَلَيَّ، وَأَبُوءُ بِذَنْبِي فَاغْفِرْ لِي، فَإِنَّهُ لَا يَغْفِرُ الذُّنُوبَ إِلَّا أَنْتَ",
                transliteration = "Allahumma anta rabbee la ilaha illa ant, khalaqtanee wa-ana 'abduk, wa-ana 'ala 'ahdika wa-wa'dika ma astata't, a'oodhu bika min sharri ma sana't, aboo'u laka bini'matika 'alayy, wa-aboo'u bidhanbee faghfir lee, fa-innahu la yaghfiru adh-dhunooba illa ant",
                translationEn = "O Allah, You are my Lord. There is no god but You. You created me, and I am Your slave. I am keeping my covenant and my promise to You as much as I can. I seek refuge in You from the evil of what I have done. I acknowledge Your blessing upon me, and I acknowledge my sin. So forgive me, for none forgives sins but You.",
                translationAr = null,
                category = "MORNING",
                repeatCount = 1,
                reference = "البخاري ٧/١٥٠",
                audioUrl = null,
                isFavorite = false,
                orderIndex = 3
            ),
            AthkarEntity(
                id = "morning_4",
                arabicText = "سُبْحَانَ اللَّهِ وَبِحَمْدِهِ",
                transliteration = "Subhan Allah wa-bihamdihi",
                translationEn = "Glory is to Allah and praise is to Him.",
                translationAr = null,
                category = "MORNING",
                repeatCount = 100,
                reference = "البخاري ٤/٢٠٧١",
                audioUrl = null,
                isFavorite = false,
                orderIndex = 4
            ),
            AthkarEntity(
                id = "morning_5",
                arabicText = "أَسْتَغْفِرُ اللَّهَ وَأَتُوبُ إِلَيْهِ",
                transliteration = "Astaghfiru Allah wa-atoobu ilayh",
                translationEn = "I seek forgiveness from Allah and I repent to Him.",
                translationAr = null,
                category = "MORNING",
                repeatCount = 100,
                reference = "البخاري ١١/١٠١",
                audioUrl = null,
                isFavorite = false,
                orderIndex = 5
            )
        )
    }

    fun getEveningAthkar(): List<AthkarEntity> {
        return listOf(
            AthkarEntity(
                id = "evening_1",
                arabicText = "أَمْسَيْنَا وَأَمْسَى الْمُلْكُ لِلَّهِ، وَالْحَمْدُ لِلَّهِ، لَا إِلَهَ إِلَّا اللَّهُ وَحْدَهُ لَا شَرِيكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيرٌ",
                transliteration = "Amsayna wa-amsa almulku lillah, walhamdu lillah, la ilaha illa Allah wahdahu la shareeka lah, lahu almulku walahu alhamdu wahuwa 'ala kulli shay'in qadeer",
                translationEn = "We have entered upon the evening and with it all the dominion belongs to Allah. All praise is due to Allah. There is no god but Allah alone, with no partner. His is the dominion, and His is the praise, and He is Able to do all things.",
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
            ),
            AthkarEntity(
                id = "evening_3",
                arabicText = "اللَّهُمَّ أَنْتَ رَبِّي لَا إِلَهَ إِلَّا أَنْتَ، خَلَقْتَنِي وَأَنَا عَبْدُكَ، وَأَنَا عَلَى عَهْدِكَ وَوَعْدِكَ مَا اسْتَطَعْتُ",
                transliteration = "Allahumma anta rabbee la ilaha illa ant, khalaqtanee wa-ana 'abduk, wa-ana 'ala 'ahdika wa-wa'dika ma astata't",
                translationEn = "O Allah, You are my Lord. There is no god but You. You created me, and I am Your slave. I am keeping my covenant and my promise to You as much as I can.",
                translationAr = null,
                category = "EVENING",
                repeatCount = 1,
                reference = "البخاري ٧/١٥٠",
                audioUrl = null,
                isFavorite = false,
                orderIndex = 3
            )
        )
    }

    fun getAfterPrayerAthkar(): List<AthkarEntity> {
        return listOf(
            AthkarEntity(
                id = "after_prayer_1",
                arabicText = "أَسْتَغْفِرُ اللَّهَ (ثَلَاثًا)",
                transliteration = "Astaghfiru Allah (3 times)",
                translationEn = "I seek forgiveness from Allah (3 times).",
                translationAr = null,
                category = "AFTER_PRAYER",
                repeatCount = 3,
                reference = "مسلم ١/٤١٤",
                audioUrl = null,
                isFavorite = false,
                orderIndex = 1
            ),
            AthkarEntity(
                id = "after_prayer_2",
                arabicText = "اللَّهُمَّ أَنْتَ السَّلَامُ وَمِنْكَ السَّلَامُ، تَبَارَكْتَ يَا ذَا الْجَلَالِ وَالْإِكْرَامِ",
                transliteration = "Allahumma anta as-salaam waminka as-salaam, tabarakta ya dha al-jalali wal-ikram",
                translationEn = "O Allah, You are Peace and from You comes peace. Blessed are You, O Possessor of Majesty and Honor.",
                translationAr = null,
                category = "AFTER_PRAYER",
                repeatCount = 1,
                reference = "مسلم ١/٤١٤",
                audioUrl = null,
                isFavorite = false,
                orderIndex = 2
            ),
            AthkarEntity(
                id = "after_prayer_3",
                arabicText = "سُبْحَانَ اللَّهِ",
                transliteration = "Subhan Allah",
                translationEn = "Glory is to Allah.",
                translationAr = null,
                category = "AFTER_PRAYER",
                repeatCount = 33,
                reference = "البخاري ١/٢٥٥",
                audioUrl = null,
                isFavorite = false,
                orderIndex = 3
            ),
            AthkarEntity(
                id = "after_prayer_4",
                arabicText = "الْحَمْدُ لِلَّهِ",
                transliteration = "Alhamdu lillah",
                translationEn = "Praise is to Allah.",
                translationAr = null,
                category = "AFTER_PRAYER",
                repeatCount = 33,
                reference = "البخاري ١/٢٥٥",
                audioUrl = null,
                isFavorite = false,
                orderIndex = 4
            ),
            AthkarEntity(
                id = "after_prayer_5",
                arabicText = "اللَّهُ أَكْبَرُ",
                transliteration = "Allahu Akbar",
                translationEn = "Allah is the Greatest.",
                translationAr = null,
                category = "AFTER_PRAYER",
                repeatCount = 33,
                reference = "البخاري ١/٢٥٥",
                audioUrl = null,
                isFavorite = false,
                orderIndex = 5
            )
        )
    }

    fun getSleepingAthkar(): List<AthkarEntity> {
        return listOf(
            AthkarEntity(
                id = "sleeping_1",
                arabicText = "بِاسْمِكَ اللَّهُمَّ أَمُوتُ وَأَحْيَا",
                transliteration = "Bismika Allahumma amootu wa-ahya",
                translationEn = "In Your name, O Allah, I die and I live.",
                translationAr = null,
                category = "SLEEPING",
                repeatCount = 1,
                reference = "البخاري ٧/٧١",
                audioUrl = null,
                isFavorite = false,
                orderIndex = 1
            ),
            AthkarEntity(
                id = "sleeping_2",
                arabicText = "اللَّهُمَّ قِنِي عَذَابَكَ يَوْمَ تَبْعَثُ عِبَادَكَ",
                transliteration = "Allahumma qinee 'adhabaka yawma tab'athu 'ibadak",
                translationEn = "O Allah, protect me from Your punishment on the Day You resurrect Your slaves.",
                translationAr = null,
                category = "SLEEPING",
                repeatCount = 3,
                reference = "أبو داود ٤/٣١١",
                audioUrl = null,
                isFavorite = false,
                orderIndex = 2
            )
        )
    }

    fun getWakingUpAthkar(): List<AthkarEntity> {
        return listOf(
            AthkarEntity(
                id = "waking_1",
                arabicText = "الْحَمْدُ لِلَّهِ الَّذِي أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُورُ",
                transliteration = "Alhamdu lillahi alladhi ahyana ba'da ma amatana wa-ilayhi an-nushoor",
                translationEn = "Praise is to Allah who gave us life after having caused us to die, and to Him is the resurrection.",
                translationAr = null,
                category = "WAKING_UP",
                repeatCount = 1,
                reference = "البخاري ٧/٧١",
                audioUrl = null,
                isFavorite = false,
                orderIndex = 1
            )
        )
    }

    fun getProtectionAthkar(): List<AthkarEntity> {
        return listOf(
            AthkarEntity(
                id = "protection_1",
                arabicText = "أَعُوذُ بِكَلِمَاتِ اللَّهِ التَّامَّاتِ مِنْ شَرِّ مَا خَلَقَ",
                transliteration = "A'oodhu bikalimatillahi at-tammati min sharri ma khalaq",
                translationEn = "I seek refuge in the Perfect Words of Allah from the evil of what He has created.",
                translationAr = null,
                category = "PROTECTION",
                repeatCount = 3,
                reference = "مسلم ٤/٢٠٨٠",
                audioUrl = null,
                isFavorite = false,
                orderIndex = 1
            ),
            AthkarEntity(
                id = "protection_2",
                arabicText = "بِسْمِ اللَّهِ الَّذِي لَا يَضُرُّ مَعَ اسْمِهِ شَيْءٌ فِي الْأَرْضِ وَلَا فِي السَّمَاءِ وَهُوَ السَّمِيعُ الْعَلِيمُ",
                transliteration = "Bismillahi alladhi la yadurru ma'a ismihi shay'un fil-ardi wala fis-sama'i wahuwa as-samee'u al-'aleem",
                translationEn = "In the name of Allah with whose name nothing is harmed on earth nor in the heavens, and He is the Hearing, the Knowing.",
                translationAr = null,
                category = "PROTECTION",
                repeatCount = 3,
                reference = "أبو داود ٤/٣٢٣",
                audioUrl = null,
                isFavorite = false,
                orderIndex = 2
            )
        )
    }

    fun getGeneralAthkar(): List<AthkarEntity> {
        return listOf(
            AthkarEntity(
                id = "general_1",
                arabicText = "لَا إِلَهَ إِلَّا اللَّهُ وَحْدَهُ لَا شَرِيكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيرٌ",
                transliteration = "La ilaha illa Allah wahdahu la shareeka lah, lahu almulku walahu alhamdu wahuwa 'ala kulli shay'in qadeer",
                translationEn = "There is no god but Allah alone, with no partner. His is the dominion, and His is the praise, and He is Able to do all things.",
                translationAr = null,
                category = "GENERAL",
                repeatCount = 10,
                reference = "البخاري ٤/٢٠٧١",
                audioUrl = null,
                isFavorite = false,
                orderIndex = 1
            ),
            AthkarEntity(
                id = "general_2",
                arabicText = "سُبْحَانَ اللَّهِ، وَالْحَمْدُ لِلَّهِ، وَلَا إِلَهَ إِلَّا اللَّهُ، وَاللَّهُ أَكْبَرُ",
                transliteration = "Subhan Allah, walhamdu lillah, wala ilaha illa Allah, wallahu akbar",
                translationEn = "Glory is to Allah, and praise is to Allah, and there is no god but Allah, and Allah is the Greatest.",
                translationAr = null,
                category = "GENERAL",
                repeatCount = 1,
                reference = "الترمذي ٥/٤٦٢",
                audioUrl = null,
                isFavorite = false,
                orderIndex = 2
            ),
            AthkarEntity(
                id = "general_3",
                arabicText = "حَسْبِيَ اللَّهُ لَا إِلَهَ إِلَّا هُوَ عَلَيْهِ تَوَكَّلْتُ وَهُوَ رَبُّ الْعَرْشِ الْعَظِيمِ",
                transliteration = "Hasbiya Allahu la ilaha illa huwa 'alayhi tawakkaltu wahuwa rabbu al-'arshi al-'adheem",
                translationEn = "Sufficient for me is Allah; there is no deity except Him. On Him I have relied, and He is the Lord of the Great Throne.",
                translationAr = null,
                category = "GENERAL",
                repeatCount = 7,
                reference = "أبو داود ٤/٣٢١",
                audioUrl = null,
                isFavorite = false,
                orderIndex = 3
            )
        )
    }

    fun getAllAthkar(): List<AthkarEntity> {
        return mutableListOf<AthkarEntity>().apply {
            addAll(getMorningAthkar())
            addAll(getEveningAthkar())
            addAll(getAfterPrayerAthkar())
            addAll(getSleepingAthkar())
            addAll(getWakingUpAthkar())
            addAll(getProtectionAthkar())
            addAll(getGeneralAthkar())
        }
    }
}
