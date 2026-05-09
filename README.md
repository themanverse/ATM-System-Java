# ATM-System-Java

A console-based ATM system built in Java using Object-Oriented Programming concepts.

This project simulates the workflow of a basic ATM machine, allowing users to create an account, authenticate using a PIN, and perform banking operations through a menu-driven interface.

---

## Features

### Account Creation
- User can create a new account
- User sets:
  - Account Holder Name
  - 4-digit PIN
  - Initial Balance

### Secure Authentication
- PIN verification system
- Access denied for incorrect PIN

### Banking Operations
- Check account balance
- Deposit money
- Withdraw money
- Exit ATM safely

### Input Validation
The program handles:
- Invalid menu choices
- Non-numeric input
- Negative values
- Incorrect PIN length
- Insufficient balance

---

## Concepts Used

- Classes and Objects
- Constructors
- Object Interaction
- State Management
- Methods
- Loops and Conditionals
- Input Validation using Scanner
- Menu-Driven Programming

---

## Project Structure

### User.java
Handles:
- account holder details
- balance storage
- balance modification operations

### ATM.java
Handles:
- account creation flow
- PIN authentication
- ATM menu system
- transaction handling
- user interaction and validation

---

## Learning Purpose

This project was created as part of my Java OOP learning journey to improve my understanding of:
- designing interacting objects
- modular programming
- real-world system simulation
- user input handling
- structured program flow

---

## Future Improvements

Possible future upgrades:
- Multiple account support
- Transaction history
- File handling/database storage
- GUI version
- Admin system
- Transfer between accounts

---

Language Used:
- Java
