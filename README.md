# **Java RMI Project**

## **Overview**
This project demonstrates a distributed application using **Java Remote Method Invocation (RMI)**. It enables client-server communication, allowing clients to remotely invoke methods on a server object.

---

## **Features**
- Client-server architecture using Java RMI.  
- Remote method execution for [specific feature, e.g., file management or mathematical computations].  
- Exception handling for network and method-related issues.  
- Easy-to-use and modular design for learning and extension.

---

## **Technologies Used**
- **Java**: Core language for implementation.  
- **Java RMI**: For remote method invocation.  
- **IDE**: [Eclipse, IntelliJ IDEA, or NetBeans].  
- **Java Development Kit (JDK)**: Version 8 or later.  

---

## **Setup Instructions**

### Prerequisites
1. Java Development Kit (JDK) installed (version 8+).
2. IDE or text editor for editing Java files.
3. Command-line tools (e.g., terminal or command prompt).

### Steps
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Sokmeak/Java-RMI-Project.git
   cd Java-RMI-Project
   ```

2. **Compile the Code**:
   - Open a terminal in the project directory.
   - Compile all `.java` files:
     ```bash
     javac -d . *.java
     ```

3. **Start the RMI Registry**:
   ```bash
   rmiregistry
   ```

4. **Run the Server**:
   ```bash
   java Server
   ```

5. **Run the Client**:
   ```bash
   java Client
   ```

---

## **Usage**
1. Start the server using the steps above.  
2. Run the client application to connect to the server.  
3. Use the client to perform remote actions such as [example actions].

---

## **Project Structure**
```
RMI PROJECT/
├── Client.class
├── Client.java
├── Hello.class
├── Hello.java
├── HelloImpl.class
├── HelloImpl.java
├── Server.class
└── Server.java
```

---

## **Testing**
- Use sample test cases in the client application to verify remote method calls.
- Ensure the server and client run on the same machine/network for local testing.

---

## **Contributing**
1. Fork the repository.  
2. Create a feature branch:  
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

