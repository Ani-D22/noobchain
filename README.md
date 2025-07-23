# 🧱 Blockchain Demo (Java 8)

This repository contains a simple **Blockchain implementation in Java 8** created to understand how blockchain works internally. It covers essential concepts like block creation, proof of work, hashing, and chain integrity — all without any external blockchain library.

---

## 📌 Features

- Block creation and linking
- SHA-256 hashing for block security
- Proof-of-Work algorithm (mining)
- Blockchain validation and tamper detection
- Console-based simulation of blockchain behavior

---

## 🏗️ How It Works

Each block contains:
- Timestamp of creation
- Custom data (like transactions)
- Hash of the previous block
- Its own hash
- A nonce used for Proof-of-Work

The blockchain enforces:
- Hash integrity: A change in any block will change its hash and break the chain
- Mining: A computational process to generate valid hashes with a required number of leading zeros (difficulty level)

---

## 🚀 Getting Started

### 🧰 Prerequisites

- Java 8
- Git
- IDE (IntelliJ, Eclipse, or any preferred Java IDE)
- Maven (optional, if you're using dependencies or want to build via terminal)

---

### 📥 Clone the Repository

```bash
git clone https://github.com/your-username/blockchain-demo.git
cd blockchain-demo
```

## ▶️ Run the Project

**If your main class is BlockchainDemo.java, you can simply run it through your IDE or compile it via terminal:**

```
javac -d out src/BlockchainDemo.java
java -cp out BlockchainDemo
Make sure all dependent classes like Block.java and Blockchain.java are in the src directory.
```

## 📁 Project Structure

```
blockchain-demo/
├── src/
│   ├── Block.java
│   ├── Blockchain.java
│   └── BlockchainDemo.java
├── README.md
└── pom.xml (optional)
```

## 📚 Concepts Covered

### SHA-256 Hashing

```
- Block chaining

- Nonce and Proof-of-Work

- Mining difficulty

- Chain immutability
```

## 🔮 Future Improvements

```
- Transaction class with sender/receiver

- Digital signature and key-pair generation

- Wallets

- P2P network simulation for distributed blockchain
```
