# AI-Thaker - الأذكار الإسلامية

**Islamic Athkar & Supplications Android App**

A modern Android application for daily Islamic remembrance (Athkar) built with Clean Architecture, MVVM, and Jetpack Compose.

---

## ✨ Features

### Current Features (v1.0.0)

- ✅ **Daily Athkar** - Automatic morning/evening Athkar based on time of day
- ✅ **7 Categories** - Morning, Evening, After Prayer, Sleeping, Waking Up, Protection, General
- ✅ **Interactive Counter** - Track repetitions with visual feedback
- ✅ **Favorites System** - Save your most-used Athkar
- ✅ **Bilingual Support** - Arabic (primary) + English translations
- ✅ **Transliteration** - Phonetic pronunciation guide
- ✅ **References** - Authentic hadith sources included
- ✅ **Material Design 3** - Beautiful Islamic-themed green UI
- ✅ **Dark Mode Support** - Automatic light/dark theme
- ✅ **RTL Support** - Proper right-to-left layout for Arabic
- ✅ **Offline First** - Works completely offline

### Sample Data Included

- **25+ Authentic Athkar** pre-loaded
- Morning Athkar (5 supplications)
- Evening Athkar (3 supplications)
- After Prayer Athkar (5 supplications)
- Sleeping Athkar (2 supplications)
- Waking Up Athkar (1 supplication)
- Protection Athkar (2 supplications)
- General Athkar (3 supplications)

---

## 🏗️ Architecture

### Clean Architecture + MVVM

```
┌─────────────────────────────────┐
│    Presentation Layer (UI)      │
│  Screens + ViewModels + State   │
│  (Jetpack Compose)               │
└───────────────┬─────────────────┘
                │
┌───────────────▼─────────────────┐
│       Domain Layer              │
│  Use Cases + Repository         │
│  Interfaces + Models            │
└───────────────┬─────────────────┘
                │
┌───────────────▼─────────────────┐
│        Data Layer               │
│  Repository Impl + Room DB      │
│  + Entities + Mappers           │
└─────────────────────────────────┘
```

### Tech Stack

| Component    | Technology                | Version |
| ------------ | ------------------------- | ------- |
| Language     | Kotlin                    | 2.0.0   |
| UI Framework | Jetpack Compose           | Latest  |
| Architecture | Clean Architecture + MVVM | -       |
| DI           | Hilt (Dagger)             | 2.52    |
| Database     | Room                      | 2.6.1   |
| Navigation   | Compose Navigation        | 2.8.4   |
| Async        | Coroutines + Flow         | 1.9.0   |
| Design       | Material Design 3         | Latest  |

---

## 📱 Screens

### 1. Home Screen

- Daily Athkar section (changes based on time)
- Categories grid
- Quick access to Favorites & Settings

### 2. Athkar List Screen

- Browse Athkar by category
- Favorite toggle
- Navigate to details

### 3. Athkar Detail Screen

- Full Arabic text
- Transliteration (phonetic)
- English translation
- **Interactive counter** for repetitions
- Progress indicator
- Hadith reference
- Add/remove favorite

### 4. Favorites Screen

- All favorited Athkar
- Quick access
- Empty state guidance

### 5. Settings Screen

- App information
- Future: Theme, Language, Notifications

---

## 🚀 Getting Started

### Prerequisites

- Android Studio Hedgehog (2023.1.1) or later
- Android SDK 24+ (Android 7.0+)
- JDK 17

### Installation

1. **Clone the repository**

```bash
git clone <repository-url>
cd AiThaker
```

2. **Open in Android Studio**

   - File → Open → Select project folder
   - Wait for Gradle sync

3. **Build the project**

```bash
./gradlew assembleDebug
```

4. **Run on device/emulator**
   - Click Run ▶️ or press Shift+F10
   - Select device (API 24+)

### First Launch

On first app launch:

- ✅ Database is automatically created
- ✅ 25+ sample Athkar are pre-loaded
- ✅ Ready to use immediately

---

## 📂 Project Structure

```
app/src/main/java/com/example/aithaker/
├── MainActivity.kt              # Entry point
├── AiThakerApplication.kt       # Hilt Application
├── common/                      # Shared utilities
│   ├── AppError.kt
│   └── constants/
├── data/                        # Data layer
│   ├── local/
│   │   ├── dao/                 # Room DAOs
│   │   ├── database/            # Database & sample data
│   │   └── entity/              # Database entities
│   ├── mapper/                  # Data mappers
│   └── repository/              # Repository implementations
├── di/                          # Dependency Injection
│   ├── DatabaseModule.kt
│   └── RepositoryModule.kt
├── domain/                      # Domain layer
│   ├── model/                   # Business models
│   ├── repository/              # Repository interfaces
│   └── usecase/                 # Business logic
└── ui/                          # Presentation layer
    ├── components/              # Reusable UI components
    ├── navigation/              # Navigation setup
    ├── screens/                 # App screens
    │   ├── home/
    │   ├── athkar/
    │   ├── detail/
    │   ├── favorites/
    │   └── settings/
    └── theme/                   # Material 3 theme
```

---

## 🎨 Design System

### Colors

- **Primary**: Islamic Green (#006C51)
- **Secondary**: Muted Green (#4D6357)
- **Tertiary**: Blue-Green (#3D6373)
- **Background**: Off-white (#FBFDF9)

### Typography

- **Arabic**: Default system font (optimized for Arabic)
- **English**: Material 3 default (Roboto)

### Components

- **AthkarCard**: Display Athkar with favorite toggle
- **CategoryCard**: Category selection with bilingual names

---

## 🧪 Testing

### Planned Tests (Future)

- Unit tests for Use Cases
- Repository tests
- ViewModel tests
- UI tests with Compose Testing

---

## 📋 Roadmap

### Phase 1 - Core ✅ (Current)

- [x] Clean Architecture setup
- [x] Database with Room
- [x] 5 main screens
- [x] Navigation
- [x] Sample data
- [x] Favorites system
- [x] Counter functionality

### Phase 2 - Features (Planned)

- [ ] Search functionality
- [ ] Audio pronunciation
- [ ] Daily reminders/notifications
- [ ] Theme selection (Light/Dark/Auto)
- [ ] Language switching
- [ ] Share Athkar

### Phase 3 - Enhancement (Planned)

- [ ] Widget support
- [ ] Backup/Restore
- [ ] Custom Athkar
- [ ] Statistics/Progress tracking
- [ ] More authentic Athkar content

### Phase 4 - Testing & Polish

- [ ] Unit test coverage (70%+)
- [ ] UI tests
- [ ] Performance optimization
- [ ] Accessibility improvements

---

## 🤝 Contributing

Contributions are welcome! Please follow these guidelines:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

### Code Style

- Follow Kotlin coding conventions
- Use meaningful variable/function names
- Add comments for complex logic
- Write tests for new features

---

## 📄 License

[Add your license here]

---

## 🙏 Acknowledgments

- Athkar content sourced from authentic Islamic texts
- Hadith references from Sahih Bukhari, Sahih Muslim, and other authentic sources
- Material Design 3 by Google
- Built with love for the Muslim community

---

## 📞 Support

For questions, issues, or suggestions:

- Open an issue on GitHub
- Contact: [Your contact information]

---

## 📱 Screenshots

[Add screenshots here when ready]

---

**Built with Clean Architecture • MVVM • Jetpack Compose • Material Design 3**

**جَزَاكَ اللهُ خَيْرًا - May Allah reward you with goodness**
