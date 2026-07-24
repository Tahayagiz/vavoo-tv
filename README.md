# Vavoo TV Portable Project

Dieses Projekt ist für den universellen Build (CLI oder GitHub Actions) optimiert.

## Build-Anleitung (Lokal)
1. Stellen Sie sicher, dass Java 17 installiert ist.
2. Führen Sie den Build-Befehl aus:
   ```bash
   ./gradlew assembleDebug
   ```
3. Das fertige APK finden Sie unter: `app/build/outputs/apk/debug/app-debug.apk`

## Build-Anleitung (GitHub Actions)
1. Erstellen Sie ein neues Repository auf GitHub.
2. Laden Sie diesen gesamten Ordner in das Repository hoch.
3. GitHub erkennt automatisch die Datei in `.github/workflows/` und startet den Build.
4. Nach Abschluss können Sie das APK unter "Actions" -> "Artifacts" herunterladen.

## Ziel-Hardware
- Gerät: Nokia Streaming Box 8010
- Architektur: armeabi-v7a (32-bit)
- Android Version: 14 (API 34)
