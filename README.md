# **Online Voting System Using Java RMI**

## **Overview**
This project is a simple distributed application demonstrating an **Online Voting System** using **Java RMI**. It allows clients to view candidates, cast votes, and check voting results, while the server manages and tracks the voting process.

---

## **Features**
- **Client-Side Features**:
  - View the list of candidates.
  - Cast a vote for a specific candidate.
  - View the current voting results.
- **Server-Side Features**:
  - Maintain and update a list of candidates and their respective votes.
  - Handle client requests for voting, retrieving candidate lists, and results.

---

## **Technologies Used**
- **Java**: Core programming language.
- **Java RMI**: To facilitate remote method invocation.
- **Java Development Kit (JDK)**: Version 8 or later.

---

## **Setup Instructions**

### **Prerequisites**
1. Install **Java Development Kit (JDK)** (version 8 or later).
2. Ensure the `rmiregistry` command is available in your system PATH.
3. A terminal or command prompt for compiling and running the program.

### **Steps**
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Sokmeak/Java-RMI-Project.git
   cd Java-RMI-Project
   ```

2. **Compile the Code**:
   - Navigate to the project directory.
   - Compile all `.java` files:
     ```bash
     javac Interface/*.java ServerSide/*.java ClientSide/*.java
     ```

3. **Generate Stubs (If Required)**:
   If using Java RMI with manual stub generation:
   ```bash
   cd Interface
   rmic VotingImpl
   cd ..
   ```

4. **Start the RMI Registry**:
   - Open a terminal in the base project directory and start the registry:
     ```bash
     rmiregistry 1099
     ```

5. **Run the Server**:
   - Open a new terminal in the base project directory and run the server:
     ```bash
     java ServerSide.Server
     ```

6. **Run the Client**:
   - Open another terminal in the base project directory and run the client:
     ```bash
     java ClientSide.Client
     ```

---

## **Project Structure**
```
Online Voting System/
├── ClientSide/
│   ├── Client.class
│   └── Client.java
├── Interface/
│   ├── Voting.class
│   ├── Voting.java
│   ├── VotingImpl.class
│   └── VotingImpl.java
├── ServerSide/
│   ├── Server.class
│   └── Server.java
```

---

## **Usage**
1. Start the **Server** by following the setup steps above.
2. Launch the **Client** to interact with the system.
3. Use the menu in the client application to:
   - View the list of candidates.
   - Cast a vote for a candidate.
   - View the current voting results.

### **Client Menu Example**:
```text
--- Online Voting System ---
1. View Candidates
2. Vote for a Candidate
3. View Voting Results
4. Exit
Choose an option: 1
Candidates:
- Alice
- Bob
- Charlie
```

---

## **Testing**
- Verify that the client can successfully connect to the server.
- Test the following scenarios:
  - Viewing candidates.
  - Voting for a valid candidate.
  - Voting for an invalid candidate (to confirm error handling).
  - Checking the updated results after voting.

---

## **Contributing**
1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add feature-name"
   ```
4. Push to the branch and open a pull request.

---

## **License**
This project is licensed under the [MIT License](LICENSE).
