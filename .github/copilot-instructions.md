# Copilot Instructions for Data-Structures-and-Algorithms-Java

## Project Overview
This repository contains Java implementations of fundamental data structures and algorithms. The codebase is organized by topic, with each major concept (e.g., arrays) in its own directory. Some C code may also be present for comparison or reference.

## Directory Structure
- `Arrays/`: Contains Java files related to array operations and concepts. Example: `Basics.java` demonstrates declaration, allocation, initialization, iteration, and multidimensional arrays.
- `arrays.c`: C implementation for arrays (not integrated with Java code).
- `README.md`: Minimal project description.

## Key Patterns & Conventions
- **Java File Organization**: Each concept (e.g., arrays) is placed in its own directory. Files are named by topic (e.g., `Basics.java`).
- **Class Structure**: Each file typically contains a single public class with a `main` method for demonstration and testing.
- **No Build System**: There is no Maven/Gradle configuration. Compile Java files directly using `javac`.
- **No Unit Tests**: Testing is done via `main` methods and console output.
- **Minimal External Dependencies**: All code is standard Java, no third-party libraries.

## Developer Workflows
- **Compile Java Code**:
  ```powershell
  javac Arrays/Basics.java
  ```
- **Run Java Code**:
  ```powershell
  java -cp Arrays Basics
  ```
- **Edit/Add Concepts**: To add a new data structure or algorithm, create a new directory and Java file following the existing pattern.

## Integration Points
- No cross-language integration; C and Java code are separate.
- No external services or APIs.

## Examples
- See `Arrays/Basics.java` for idiomatic array usage in Java.
- Use the `main` method for demonstration and manual testing.

## Recommendations for AI Agents
- Follow the directory and file naming conventions when adding new concepts.
- Prefer simple, self-contained Java classes with a `main` method for demonstration.
- Document new files with comments explaining the concept and example usage.
- If adding tests, place them in the same file or create a `tests/` directory (not currently present).

---
If any section is unclear or incomplete, please provide feedback to improve these instructions.
