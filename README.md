# Rock Paper Scissors App

## Overview
The **Rock Paper Scissors App** is a simple and interactive Android application built with Kotlin & Jetpack Compose. It allows users to play the classic "Rock, Paper, Scissors" game against the app. The app randomly selects its move, and the result of the game is displayed immediately after the user makes a choice.

## Features
- Modern UI design using Jetpack Compose.
- Playable "Rock, Paper, Scissors" game with randomized moves.
- Dynamic feedback showing the player's choice, the app's choice, and the result (Win, Lose, or Tie).

## How It Works
1. When the app starts, the main screen displays the title and the game options: Rock, Paper, and Scissors.
2. The user selects one of the options by tapping on the corresponding button.
3. The app makes a random choice from the same options.
4. The app calculates the result based on the following rules:
   - Rock beats Scissors
   - Scissors beats Paper
   - Paper beats Rock
   - Identical choices result in a tie.
5. The result is displayed on the screen along with both the user's choice and the app's choice.

## Installation

To install and run the app locally, follow these steps:

### Prerequisites
- Android Studio HedgeHog or later.
- A device or emulator running Android 14 (API level 34) or higher.

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/rockpaperscissors.git
   ```

2. Open the project in Android Studio:
   - Launch Android Studio.
   - Click on **File > Open** and navigate to the cloned repository.
   - Select the project folder and click **OK**.

3. Sync Gradle:
   - Android Studio should automatically prompt you to sync the project with Gradle. Click **Sync Now** if prompted.

4. Build and run the app:
   - Connect your Android device via USB or set up an emulator.
   - Click the **Run** button (green triangle) in the toolbar.
   - Select your target device and click **OK**.

5. Enjoy the app!

## Project Structure
- **MainActivity.kt**: Contains the app's main logic and entry point.
- **ui.theme**: Includes theme-related files for styling the app.
- **preview**: Provides a composable function for UI preview in Android Studio.

## Future Enhancements
- Add sound effects for user interactions.
- Include animations for a more engaging experience.
- Provide a score-tracking feature.

## License
This project is licensed under the MIT License. Feel free to use and modify the app as needed.

---

Enjoy playing **Rock, Paper, Scissors** and challenge yourself to beat the app!

