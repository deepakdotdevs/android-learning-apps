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
| **Home Screen** | <img src="https://raw.githubusercontent.com/deepakdotdevs/android-learning-apps/master/Intent/screenshots/Home_Screen.jpeg" alt="Home Screen" width="250" style="border-radius:12px;"/> | 🏠 Displays the main interface where users can enter text or notes. |
| **Explicit Intent Screen** | <img src="https://raw.githubusercontent.com/deepakdotdevs/android-learning-apps/master/Intent/screenshots/Explicit_Screen.jpeg" alt="Explicit Intent Screen" width="250" style="border-radius:12px;"/> | 🎯 Demonstrates explicit intent — passing data from one activity to another. |
| **Implicit Intent Screen** | <img src="https://raw.githubusercontent.com/deepakdotdevs/android-learning-apps/master/Intent/screenshots/Implicit_Screen.jpeg" alt="Implicit Intent Screen" width="250" style="border-radius:12px;"/> | 🔗 Shows implicit intent for sharing text content via other apps. |

---

## 📘 Project Documentation  

You can view the full project explanation, code flow, and screenshots in the detailed **PDF documentation** below:  

<p align="center">
  <a href="https://github.com/deepakdotdevs/android-learning-apps/blob/master/Intent/Intent.pdf" target="_blank">
    <img src="https://img.shields.io/badge/📄%20View%20Intent%20Project%20PDF-blue?style=for-the-badge&logo=adobeacrobatreader&logoColor=white" alt="View Intent Project PDF"/>
  </a>
</p>

---

## 🧑‍💻 Author  

**👨‍💻 Deepak Jangid**  
🎓 B.Tech CSE @ K.R. Mangalam University  
📫 [LinkedIn](https://https://www.linkedin.com/in/deepak-jangid-89954a317/) • [GitHub](https://github.com/deepakdotdevs)
