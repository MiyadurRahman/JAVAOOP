# JAVAOOP

A personal collection of Java programs exploring Object-Oriented Programming (OOP) concepts — classes and objects, inheritance, polymorphism, abstraction, interfaces, encapsulation, collections, exception handling, file I/O, threads, and Swing GUIs — along with class exercises, semester practice sets, and a final-project login system.

This is an IntelliJ IDEA project (see `java.iml`), organized as a single `src/` source root with each topic in its own package.

## 📑 Table of Contents

- [Repository Structure](#-repository-structure)
- [Topics Covered](#-topics-covered)
  - [OOP Fundamentals](#oop-fundamentals)
  - [Inheritance & Polymorphism](#inheritance--polymorphism)
  - [Abstraction & Interfaces](#abstraction--interfaces)
  - [Encapsulation](#encapsulation)
  - [Collections (ArrayList)](#collections-arraylist)
  - [Exception Handling](#exception-handling)
  - [File I/O](#file-io)
  - [Multithreading](#multithreading)
  - [GUI (Swing)](#gui-swing)
  - [Pattern Printing](#pattern-printing)
  - [Practice & Semester Sets](#practice--semester-sets)
  - [Final Project](#final-project)
- [Requirements](#️-requirements)
- [Usage](#️-usage)
- [Notes](#-notes)
- [License](#-license)

## 📂 Repository Structure

```
JAVAOOP/
├── src/
│   ├── OOPinJava/
│   │   ├── Student.java                  # Basic class: fields, constructor, private/final/static members
│   │   └── StudentClass.java
│   ├── Inheritance/
│   │   ├── Vroom.java                    # vehicle base class + subclass, constructors
│   │   ├── mouse.java / mouse1.java       # Static methods, method overriding examples
│   │   └── Track_Pairs_OF_Shoe.java
│   ├── Polimorpism/
│   │   ├── polybasic.java                # bird/robin: method overriding & dynamic dispatch
│   │   └── abstraction_basic.java        # dog/cat: abstract methods, overriding
│   ├── abstractandinterface/
│   │   ├── abstraction.java              # Abstract class Animal with abstract makeSound()
│   │   └── Fall2024.java
│   ├── encapsulation/
│   │   ├── BankAccount.java              # Private fields + public getters/setters
│   │   ├── Driver.java / StudentDriver.java / Test.java
│   │   └── practice2.java / practice4.java
│   ├── arraylist/
│   │   ├── arrayList.java                # ArrayList basics: add, get, modify, remove, iterate
│   │   ├── Spring2024.java
│   │   └── fall2024.java
│   ├── exception_handling/
│   │   ├── exception.java / exception2.java  # try/catch, custom exceptions
│   │   ├── bank.java
│   │   └── Spring2025.java
│   ├── fileio/
│   │   ├── basicfile.java                # Creating a file with java.io.File
│   │   ├── readfile.java / writefile.java
│   │   ├── Fall2024.java / Summer2024.java / spring2024.java / spring2025.java
│   ├── threads/
│   │   ├── basics.java / basic2.java     # Thread via extends Thread / implements Runnable
│   │   ├── movietheater.java / Movie.java  # Producer/consumer-style thread example
│   │   └── Summer2024.java / fasll2024.java
│   ├── GUI/
│   │   ├── RockPaperScissorsGUI.java     # Swing rock-paper-scissors game
│   │   ├── MenuDemo.java                 # JFrame with a menu bar
│   │   ├── TextReverser.java             # Swing text-input/reverse demo
│   │   └── Spring2024.java / fall2023.java
│   ├── Pattern/
│   │   ├── Pattern1.java / Pattern2.java / Pattern3.java / patten4.java  # Nested-loop pattern printing
│   ├── finalquestionsolve/
│   │   └── School_login_system.java      # Swing-based school login/registration system
│   ├── lecture4/
│   │   ├── ObjectPassExample.java        # Passing objects by reference in Java
│   │   ├── ReferenceTest.java
│   │   └── calcu.java / practice.java
│   ├── practice/
│   │   └── practice_ct1.java             # Class-test practice
│   ├── array.java                        # (empty placeholder)
│   └── loop.zip                          # Zipped loop-exercise archive
├── input.txt / output.txt / writefile.txt / myfile.txt   # Sample/generated files used by the fileio examples
├── java.iml                              # IntelliJ IDEA module file
└── REPOSITORY_EXPLANATION.md             # Short auto-generated repo summary
```

## 🧠 Topics Covered

### OOP Fundamentals
- `OOPinJava/` — a `Student` class demonstrating fields, constructors, and `private`/`final`/`static` members.

### Inheritance & Polymorphism
- `Inheritance/` — a `vehicle` base class extended by subclasses, with constructor chaining.
- `Polimorpism/` — classic overriding examples (`bird`/`robin`, `dog`/`cat`) showing dynamic method dispatch.

### Abstraction & Interfaces
- `abstractandinterface/` — an abstract `Animal` class with an abstract `makeSound()` method, implemented by subclasses.

### Encapsulation
- `encapsulation/` — a `BankAccount` class with private fields and public getter/setter methods, plus driver/test classes exercising it.

### Collections (ArrayList)
- `arraylist/` — `ArrayList<Integer>` usage: add, get, modify, remove, and iterate.

### Exception Handling
- `exception_handling/` — `try`/`catch` blocks, custom exception classes, and a small bank-related exception example.

### File I/O
- `fileio/` — creating files with `java.io.File`, and reading/writing text files (backed by the `input.txt`/`output.txt`/`myfile.txt` sample files in the repo root).

### Multithreading
- `threads/` — creating threads both by extending `Thread` and implementing `Runnable`, plus a movie-theater ticket-booking simulation using multiple threads.

### GUI (Swing)
- `GUI/` — small Swing desktop apps: a Rock-Paper-Scissors game, a menu-bar demo (`JFrame` + `JCheckBoxMenuItem`), and a text-reverser tool (`JTextField`/`JButton`).

### Pattern Printing
- `Pattern/` — nested-loop exercises that print number/character patterns (a common intro-Java exercise).

### Practice & Semester Sets
- Files named by term (`Spring2024`, `Fall2024`, `Summer2024`, `Spring2025`, etc.) across several packages are semester class-test or practice submissions on that package's topic.
- `practice/` and `lecture4/` — general lecture practice, including an example of how Java passes objects by reference.

### Final Project
- `finalquestionsolve/School_login_system.java` — a Swing-based school registration/login system combining GUI, event handling, and OOP design.

## 🛠️ Requirements

- Java Development Kit (JDK) 8 or later
- Optional: [IntelliJ IDEA](https://www.jetbrains.com/idea/) — the repo already includes a `java.iml` module file for it

## ▶️ Usage

Each file with a `public static void main(String[] args)` method can be compiled and run individually.

**Command line:**
```bash
cd src
javac OOPinJava/Student.java
java OOPinJava.Student
```

For Swing GUI programs (under `GUI/` and `finalquestionsolve/`), compiling and running will open a desktop window:
```bash
javac GUI/RockPaperScissorsGUI.java
java GUI.RockPaperScissorsGUI
```

**IntelliJ IDEA:** open the repository root — it will be recognized as a module via `java.iml`, with `src/` already set as the source root. Right-click any file with a `main` method and choose **Run**.

## 📌 Notes

- This repository is a personal coursework/learning log, so class and file names vary in style and sometimes contain typos (e.g. `Polimorpism`, `patten4.java`, `fasll2024.java`).
- `src/array.java` is currently an empty placeholder, and `src/exception_handling/exception.java` is fully commented out.
- `input.txt`, `output.txt`, `writefile.txt`, and `myfile.txt` in the repo root are sample/generated files used by the programs under `fileio/`.
- `loop.zip` is a zipped exercise archive, not required to build or run the rest of the project.

## 📄 License

No license has been specified for this repository. All rights are reserved by the author unless stated otherwise.
