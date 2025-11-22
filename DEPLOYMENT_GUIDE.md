# AI-Thaker - Deployment Guide

## 📦 Building for Production

### Prerequisites

- Android Studio (latest stable)
- JDK 17
- Android SDK 24+
- Keystore for signing (for production)

---

## 🏗️ Build Types

### Debug Build (Development)

```bash
# Build debug APK
./gradlew assembleDebug

# Output location:
# app/build/outputs/apk/debug/app-debug.apk

# Install to device
adb install app/build/outputs/apk/debug/app-debug.apk
```

### Release Build (Production)

#### 1. Create Keystore (First time only)

```bash
keytool -genkey -v -keystore ai-thaker-release.keystore \
  -alias ai-thaker -keyalg RSA -keysize 2048 -validity 10000
```

**Keep this keystore file safe!** You'll need it for all future updates.

#### 2. Configure Signing

Create `app/keystore.properties`:

```properties
storePassword=YOUR_STORE_PASSWORD
keyPassword=YOUR_KEY_PASSWORD
keyAlias=ai-thaker
storeFile=/path/to/ai-thaker-release.keystore
```

**⚠️ Important**: Add `keystore.properties` to `.gitignore`!

#### 3. Build Release APK

```bash
# Build release APK (signed)
./gradlew assembleRelease

# Output location:
# app/build/outputs/apk/release/app-release.apk
```

#### 4. Build App Bundle (Recommended for Play Store)

```bash
# Build Android App Bundle
./gradlew bundleRelease

# Output location:
# app/build/outputs/bundle/release/app-release.aab
```

---

## 🧪 Testing Before Release

### 1. Run All Tests

```bash
# Unit tests
./gradlew test

# Connected tests (requires device/emulator)
./gradlew connectedAndroidTest

# Lint checks
./gradlew lint
```

### 2. Manual Testing Checklist

- [ ] Install on real device (not emulator)
- [ ] Test all 5 screens
- [ ] Verify navigation flows
- [ ] Test counter functionality
- [ ] Test favorites add/remove
- [ ] Test time-based daily Athkar (morning vs evening)
- [ ] Check RTL layout (Arabic)
- [ ] Test on different screen sizes
- [ ] Test dark mode
- [ ] Verify all Athkar load correctly
- [ ] Check for crashes/ANRs

### 3. Performance Testing

- [ ] App starts in < 2 seconds
- [ ] Smooth scrolling (60 FPS)
- [ ] No memory leaks
- [ ] Database queries fast (< 100ms)
- [ ] APK size < 15 MB

---

## 📱 Play Store Deployment

### 1. Prepare Assets

#### App Icon

- 512x512 PNG (high-res icon)
- Transparent background
- Islamic-themed design

#### Feature Graphic

- 1024x500 PNG
- App name + tagline
- Screenshots of app

#### Screenshots (Required)

Minimum 2, maximum 8 screenshots:

- Phone: 1080x1920 or higher
- Tablet: 1200x1900 or higher

Take screenshots of:

1. Home screen with categories
2. Athkar detail with counter
3. Athkar list screen
4. Favorites screen

#### App Description

**Short Description** (80 characters max):

```
Islamic Athkar & Daily Supplications - Authentic, Beautiful, Offline
```

**Full Description**:

```
AI-Thaker - Your daily companion for Islamic remembrance (Athkar).

✨ FEATURES:
• 25+ Authentic Athkar with references
• 7 Categories: Morning, Evening, Prayer, Sleep, Protection & more
• Interactive Counter for repetitions
• Bilingual: Arabic + English translations
• Transliteration for pronunciation
• Favorites system
• Beautiful Material Design 3 UI
• Completely Offline
• Dark mode support

🕌 CATEGORIES:
- Morning Athkar (أذكار الصباح)
- Evening Athkar (أذكار المساء)
- After Prayer (أذكار بعد الصلاة)
- Before Sleep (أذكار النوم)
- Upon Waking (أذكار الإستيقاظ)
- Protection (أذكار الحفظ)
- General Athkar (أذكار عامة)

📖 AUTHENTIC SOURCES:
All Athkar are from authentic Hadith collections including:
- Sahih Bukhari
- Sahih Muslim
- Abu Dawud
- At-Tirmidhi

🎯 WHY AI-THAKER?
- Clean, modern interface
- Easy-to-use counter
- No ads, no tracking
- No internet required
- Free forever

Perfect for Muslims seeking to strengthen their daily spiritual practice.

جَزَاكَ اللهُ خَيْرًا - May Allah reward you with goodness
```

### 2. Version Management

Update in `app/build.gradle.kts`:

```kotlin
defaultConfig {
    versionCode = 1      // Increment for each release
    versionName = "1.0.0" // Semantic versioning
}
```

Version naming:

- `1.0.0` - Initial release
- `1.0.1` - Bug fixes
- `1.1.0` - New features
- `2.0.0` - Major changes

### 3. Upload to Play Console

1. Go to [Google Play Console](https://play.google.com/console)
2. Create new app
3. Fill in app details:
   - App name: AI-Thaker
   - Category: Lifestyle > Religion & Spirituality
   - Content rating: Everyone
   - Privacy Policy URL (create one)
4. Upload AAB file (`app-release.aab`)
5. Complete store listing
6. Set pricing (Free recommended)
7. Submit for review

### 4. App Privacy Policy (Required)

Create a simple privacy policy:

```markdown
# Privacy Policy for AI-Thaker

Last updated: [Date]

## Data Collection

AI-Thaker does NOT collect, store, or share any personal data.

## Local Storage

All data (Athkar, favorites, settings) is stored locally on your device.

## Internet

The app works completely offline and does not require internet connection.

## Third-Party Services

The app does not use any third-party analytics, advertising, or tracking services.

## Contact

For questions: [your email]
```

Host on GitHub Pages or your website.

---

## 🔄 Update Strategy

### For Bug Fixes (Patch Update)

1. Fix bugs
2. Increment `versionCode`
3. Update `versionName` (e.g., 1.0.0 → 1.0.1)
4. Build release AAB
5. Upload to Play Console
6. Submit update

### For New Features (Minor Update)

1. Develop features
2. Test thoroughly
3. Update version (e.g., 1.0.0 → 1.1.0)
4. Update changelog
5. Build and upload
6. Update store description

---

## 📊 Release Checklist

### Pre-Release

- [ ] All tests passing
- [ ] No lint errors/warnings
- [ ] Version incremented
- [ ] Changelog updated
- [ ] Privacy policy current
- [ ] Keystore backed up safely
- [ ] ProGuard rules tested (if enabled)

### App Bundle

- [ ] Built with `bundleRelease`
- [ ] Signed with release keystore
- [ ] File size reasonable (< 15 MB)
- [ ] Tested on real device

### Play Store

- [ ] Screenshots updated
- [ ] Description accurate
- [ ] Feature graphic ready
- [ ] Content rating appropriate
- [ ] Pricing set
- [ ] Countries selected

### Post-Release

- [ ] Monitor crash reports
- [ ] Check user reviews
- [ ] Respond to feedback
- [ ] Plan next update

---

## 🔐 Security Best Practices

1. **Keystore Security**

   - Never commit keystore to Git
   - Store in secure location
   - Backup in multiple locations
   - Use strong passwords

2. **Code Security**

   - No hardcoded secrets
   - No API keys in code (if adding later)
   - Use ProGuard for obfuscation (optional)

3. **Updates**
   - Keep dependencies updated
   - Monitor security advisories
   - Patch vulnerabilities quickly

---

## 📈 Post-Launch Monitoring

### Metrics to Track

- Daily Active Users (DAU)
- Retention Rate (1-day, 7-day, 30-day)
- Crash-free rate (target: >99%)
- Average session length
- User ratings/reviews

### Tools

- Google Play Console (built-in analytics)
- Firebase Crashlytics (optional, for crash reporting)
- Firebase Analytics (optional)

---

## 🚀 Launch Timeline

### Week 1: Pre-Launch

- [ ] Complete all testing
- [ ] Create all store assets
- [ ] Write privacy policy
- [ ] Set up Play Console account

### Week 2: Soft Launch

- [ ] Upload to Play Console
- [ ] Internal testing track
- [ ] Alpha testing (friends/family)
- [ ] Collect feedback

### Week 3: Beta Launch

- [ ] Beta testing track
- [ ] Fix reported issues
- [ ] Monitor crashes
- [ ] Refine based on feedback

### Week 4: Production Launch

- [ ] Submit for production
- [ ] Wait for review (~3-7 days)
- [ ] Go live!
- [ ] Monitor closely

---

## 📝 Changelog Template

Create `CHANGELOG.md`:

```markdown
# Changelog

## [1.0.0] - 2025-11-22

### Added

- Initial release
- 25+ authentic Athkar
- 7 categories
- Interactive counter
- Favorites system
- Bilingual support (Arabic/English)
- Offline functionality
- Dark mode support

### Known Issues

- None at launch
```

---

## ✅ Final Pre-Launch Checklist

- [ ] App tested on multiple devices
- [ ] All features working
- [ ] No crashes or ANRs
- [ ] Smooth performance (60 FPS)
- [ ] Proper RTL support
- [ ] All content accurate
- [ ] References verified
- [ ] Privacy policy published
- [ ] Store listing complete
- [ ] Screenshots professional
- [ ] Description compelling
- [ ] Version numbers correct
- [ ] Signed release build
- [ ] AAB uploaded
- [ ] Ready to submit!

---

**Good luck with your launch! 🚀**

**May Allah accept this work and make it beneficial for all Muslims. Ameen.**
