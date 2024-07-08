# Banky - Simple Banking System

Banky is a console-based Java application that simulates basic banking operations such as creating accounts, depositing, withdrawing, and transferring funds.

## Table of Contents
- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
- [Usage](#usage)
- [Classes and Methods](#classes-and-methods)
- [Future Improvements](#future-improvements)
  

## Features

- Create a new bank account.
- Deposit funds into an account.
- Withdraw funds from an account.
- Transfer funds between accounts.
- Display information for all accounts.

## Getting Started

### Prerequisites

To compile and run this Java application, you need:

- Java Development Kit (JDK) installed on your system.
- A text editor or an Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse or VS Code.


## Usage

Once the application is running, you will see a menu with the following options:

- Create Account: Create a new bank account by providing an account number, the account holder's name, and an initial balance.
- Deposit: Deposit funds into an existing account by providing the account number and the amount to deposit.
- Withdraw: Withdraw funds from an existing account by providing the account number and the amount to withdraw.
- Transfer: Transfer funds from one account to another by providing both the source and
- destination account numbers and the amount to transfer.
- Display All Accounts: Display information for all bank accounts.
- Exit: Exit the application.

### Example-Workflow
1. Create a new account
   - Enter account number: 12345
   - Enter account holder name: John Doe
   - Enter initial balance: 5000.00
2. Deposit into an account
    - Enter account number: 12345
    - Enter amount to deposit: 1500.00
3. Withdraw from an account
    - Enter account number: 12345
    - Enter amount to withdraw: 2000.00
4. Transfer funds between accounts
     - Enter source account number: 12345
     - Enter destination account number: 67890
     - Enter amount to transfer: 1000.00
5. Display all accounts
     - View detailed information for all existing accounts.

# Banking System

This project implements a simple banking system with `Account` and `Bank` classes. It allows creating accounts, depositing and withdrawing funds, transferring money between accounts, and displaying account information.

## Classes and Methods

### Account Class

The `Account` class is designed to handle individual bank accounts with the following functionalities:

- **Constructor**: Initializes account details.
  - **Account(String accountNumber, String accountHolderName, double initialBalance)**
    - `accountNumber`: Unique identifier for the account.
    - `accountHolderName`: Name of the account holder.
    - `initialBalance`: Starting balance of the account.

- **Methods**:
  - **getAccountNumber()**: Returns the account number.
  - **getAccountHolderName()**: Returns the account holder's name.
  - **getBalance()**: Returns the current balance.
  - **deposit(double amount)**: Deposits the specified amount to the account.
  - **withdraw(double amount)**: Withdraws the specified amount from the account if sufficient funds are available.
  - **displayAccountInfo()**: Displays the account details.

### Bank Class

The `Bank` class manages multiple accounts and provides functionalities to interact with them:

- **Methods**:
  - **createAccount(String accountNumber, String accountHolderName, double initialBalance)**: Creates a new account with the given details.
  - **getAccount(String accountNumber)**: Retrieves an account by its number.
  - **depositToAccount(String accountNumber, double amount)**: Deposits funds to a specified account.
  - **withdrawFromAccount(String accountNumber, double amount)**: Withdraws funds from a specified account.
  - **transfer(String fromAccountNumber, String toAccountNumber, double amount)**: Transfers funds between two accounts.
  - **displayAllAccounts()**: Displays all existing accounts and their details.

## Future Improvements

To enhance the functionality and usability of the banking system, the following features are planned:

- **Persistent Storage**: Implement saving and loading of account data from a file to maintain state between sessions.
- **User Authentication**: Add authentication mechanisms for secure account access.
- **Graphical User Interface (GUI)**: Develop a GUI to improve user interaction and experience.
- **Transaction History**: Maintain and display a history of transactions for each account.

## How to Use

1. **Initialize the Bank**: Create an instance of the `Bank` class.
2. **Create Accounts**: Use the `createAccount` method to add new accounts.
3. **Manage Funds**: Use the `depositToAccount` and `withdrawFromAccount` methods to manage funds.
4. **Transfer Funds**: Use the `transfer` method to move money between accounts.
5. **Display Information**: Use `displayAccountInfo` and `displayAllAccounts` to view account details.



   


  

