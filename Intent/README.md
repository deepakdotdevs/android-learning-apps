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

## 🖼️ App Screenshots

| Screen | Preview | Description |
|:--|:--:|:--|
| **Home Screen** | ![Home Screen](./Intent/screenshots/Home_Screen.jpeg) | 🏠 Displays the main interface where users can enter text or notes. |
| **Explicit Intent Screen** | ![Explicit Screen](./Intent/screenshots/Explicit_Screen.jpeg) | 🎯 Demonstrates explicit intent — passing data from one activity to another. |
| **Implicit Intent Screen** | ![Implicit Screen](./Intent/screenshots/Implicit_Screen.jpeg) | 🔗 Shows implicit intent for sharing text content via other apps. |

---
