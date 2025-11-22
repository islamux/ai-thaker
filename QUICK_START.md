# AI-Thaker - Quick Start Guide

## 🚀 Running the App

### Option 1: Android Studio (Recommended)

1. Open Android Studio
2. Click **Run** ▶️ (or press Shift+F10)
3. Select your device/emulator (API 24+)
4. Wait for build and installation
5. App launches with **25+ pre-loaded Athkar** ready to use!

### Option 2: Command Line

```bash
# Build debug APK
./gradlew assembleDebug

# APK location:
# app/build/outputs/apk/debug/app-debug.apk

# Install to connected device
adb install app/build/outputs/apk/debug/app-debug.apk
```

---

## 📱 First Time Usage

### Home Screen

- **Top Section**: Daily Athkar (Morning before 12 PM, Evening after)
- **Bottom Section**: 7 categories to browse
- **Top Bar**:
  - ♡ Favorites icon - View saved Athkar
  - ⚙️ Settings icon - App settings

### Exploring Athkar

1. **Browse by Category**: Tap any category card
2. **View Details**: Tap on any Athkar
3. **Use Counter**:
   - Tap "عد" (Count) button to increment
   - Tap "إعادة" (Reset) to start over
4. **Add to Favorites**: Tap the heart icon (♡/♥)

### Navigation

- **Back Button**: Returns to previous screen
- **Categories**: HomeScreen → Category → List → Detail
- **Favorites**: HomeScreen → Favorites → Detail

---

## 🎯 Key Features to Try

### 1. Daily Athkar

- Opens different Athkar based on time of day
- Morning (before 12:00 PM): Morning supplications
- Evening (after 12:00 PM): Evening supplications

### 2. Interactive Counter

1. Go to any Athkar detail
2. If repeat count > 1, counter appears
3. Tap "عد" to count each repetition
4. Shows "✓ تم الانتهاء" when complete

### 3. Favorites Management

1. Tap heart icon on any Athkar
2. Go to Favorites screen to see all saved
3. Tap again to remove from favorites

### 4. Complete Athkar Information

Each Athkar shows:

- Arabic text (original)
- Transliteration (pronunciation)
- English translation
- Hadith reference
- Repeat count

---

## 🗂️ Categories Explained

| Category     | Arabic           | Description           |
| ------------ | ---------------- | --------------------- |
| Morning      | أذكار الصباح     | Recited after Fajr    |
| Evening      | أذكار المساء     | Recited after Asr     |
| After Prayer | أذكار بعد الصلاة | After each prayer     |
| Sleeping     | أذكار النوم      | Before sleeping       |
| Waking Up    | أذكار الإستيقاظ  | Upon waking           |
| Protection   | أذكار الحفظ      | For protection        |
| General      | أذكار عامة       | Anytime supplications |

---

## 🔧 Troubleshooting

### App won't start

- Check Android version (needs API 24+, Android 7.0+)
- Clear app data: Settings → Apps → AI-Thaker → Clear Data
- Reinstall the app

### No Athkar showing

- **First launch**: Wait ~2 seconds for database seeding
- **After update**: Clear app data and relaunch
- Data loads automatically on first creation

### Counter not working

- Make sure you're on Athkar Detail screen
- Counter only shows for Athkar with repeatCount > 1
- Try different Athkar (e.g., "سُبْحَانَ اللَّهِ" has 100 repeats)

---

## 💡 Tips

1. **Quick Access**: Add frequently-used Athkar to Favorites
2. **Morning Routine**: Check app after Fajr for morning Athkar
3. **Evening Routine**: Check app after Asr for evening Athkar
4. **After Salah**: Use "After Prayer" category
5. **Before Sleep**: Use "Sleeping" category

---

## 📊 Sample Data Included

The app comes pre-loaded with **25+ authentic Athkar**:

- ✅ 5 Morning Athkar
- ✅ 3 Evening Athkar
- ✅ 5 After Prayer Athkar
- ✅ 2 Sleeping Athkar
- ✅ 1 Waking Up Athkar
- ✅ 2 Protection Athkar
- ✅ 3 General Athkar

All with authentic references from:

- Sahih Bukhari
- Sahih Muslim
- Abu Dawud
- At-Tirmidhi

---

## 🎨 UI Guide

### Home Screen Elements

```
┌─────────────────────────────┐
│ الأذكار    ♡  ⚙️            │ ← TopBar
├─────────────────────────────┤
│ أذكار اليوم                 │ ← Daily section
│ [Morning/Evening Athkar]    │
├─────────────────────────────┤
│ الفئات                      │ ← Categories
│ ┌──────┐ ┌──────┐          │
│ │Morning│ │Evening│         │
│ └──────┘ └──────┘          │
│ ┌──────┐ ┌──────┐          │
│ │Prayer │ │Sleep │          │
│ └──────┘ └──────┘          │
└─────────────────────────────┘
```

### Counter Display

```
┌─────────────────────────┐
│      العداد              │
│                         │
│      15 / 33           │ ← Current/Total
│                         │
│  [عد]  [إعادة]         │ ← Count/Reset
└─────────────────────────┘
```

---

## 📱 Minimum Requirements

- **Android**: 7.0 (API 24) or higher
- **Storage**: ~10 MB
- **Internet**: Not required (fully offline)
- **Permissions**: None required

---

## 🆘 Need Help?

1. Read this guide
2. Check [README.md](README.md) for more details
3. See [IMPLEMENTATION_SUMMARY.md](IMPLEMENTATION_SUMMARY.md) for technical details

---

**جَزَاكَ اللهُ خَيْرًا**  
**May Allah reward you with goodness**
