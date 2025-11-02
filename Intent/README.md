# Intent: An Android Intent Demonstration App 🚀

## Overview
**Intent** is a simple Android application built to demonstrate and explore the two primary types of Intents used in Android development:

- **Explicit Intents** — for internal navigation (e.g., moving from `MainActivity` to `NextScreen`).
- **Implicit Intents** — for communicating with the Android system or other apps (e.g., sharing text via installed messaging apps).

This project shows how to pass data between Activities using Explicit Intents and how to leverage the device's sharing capabilities with Implicit Intents. It also demonstrates saving/restoring instance state to prevent data loss across configuration changes.

---

## ✨ Key Features
- **Explicit Intent Navigation**: Passes user input from the main screen to a secondary screen (`NextScreen`).
- **State Persistence**: `NextScreen` contains a counter and demonstrates saving/restoring state with `onSaveInstanceState()` / `onRestoreInstanceState()` or `savedInstanceState`.
- **Implicit Intent Sharing**: Share text entered in the `EditText` with any compatible app (email, SMS, social apps).
- **Input Validation**: Prevents empty shares and shows a `Toast` if the input is empty.
- Clean Kotlin + XML implementation suitable for beginners.

---

## 🗂 Project Structure (Kotlin & XML)

---


---

## Files & Responsibilities
- **MainActivity.kt**
  - Contains an `EditText` for user input.
  - A button to launch `NextScreen` using an **Explicit Intent** and pass the text as an extra.
  - A button to trigger an **Implicit Intent** (`ACTION_SEND`) to open the Android share sheet.
  - Validates input before sharing; shows a `Toast` if empty.

- **NextScreen.kt**
  - Receives the string extra from `MainActivity`.
  - Displays the received text.
  - Implements a simple counter demonstrating `onSaveInstanceState()` to persist counter value across rotation or process death.

- **activity_main.xml**
  - `EditText` for entering text.
  - `Button` for "Open Next Screen".
  - `Button` for "Share Text".

- **activity_next_screen.xml**
  - `TextView` showing received text.
  - `TextView` or `Button` to increment counter.
  - Shows persisted counter value after configuration changes.

---

## Example Snippets

**Send explicit intent from `MainActivity.kt`**
```kotlin
val inputText = binding.editText.text.toString()
val intent = Intent(this, NextScreen::class.java).apply {
    putExtra("EXTRA_NOTE_TEXT", inputText)
}
startActivity(intent)

### Start implicit share (ACTION_SEND)

```kotlin
val shareText = binding.editText.text.toString()
if (shareText.isBlank()) {
    Toast.makeText(this, "Please enter some text to share", Toast.LENGTH_SHORT).show()
} else {
    val sendIntent = Intent().apply {
        action = Intent.ACTION_SEND
        putExtra(Intent.EXTRA_TEXT, shareText)
        type = "text/plain"
    }
    val chooser = Intent.createChooser(sendIntent, "Share note via")
    startActivity(chooser)
}
