# Simple TTT in Java

## Overview
**Simple TTT in Java** is a lightweight, open-source implementation of the classic **Tic-Tac-Toe** game (also known as **Noughts and Crosses**) designed to be played in the terminal. The game is written entirely in Java and uses a simple command-line interface, making it both accessible and educational.

The project is intended as a practical example for:
- Learning Java programming basics.
- Understanding object-oriented design (separating responsibilities across classes).
- Practicing Gradle-based builds and project structure.
- Experimenting with version control and open-source workflows.

Repository: [https://github.com/lollounicam/Simple-TTT-in-Java](https://github.com/lollounicam/Simple-TTT-in-Java)

---

## Features
- **Two-player mode**: local multiplayer in the terminal.
- **3×3 grid**: with `-` representing empty cells.
- **Player marks**:
    - **Player 0** → `X`
    - **Player 1** → `O`
- **Input validation**:
    - Ensures coordinates are within the valid range (`0–2`).
    - Prevents overwriting non-empty cells.
- **Victory detection**:
    - Checks rows, columns, and diagonals for three matching marks.
- **Clean terminal output**:
    - Prints the board after each move.
    - Displays clear prompts and victory messages.

---

## Requirements
- **Java Development Kit (JDK)** 17 or later  
  Verify your installation with:
  ```bash
  java -version
