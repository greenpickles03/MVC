# MVC Java Project

This project demonstrates a simple implementation of the **Model-View-Controller (MVC)** design pattern using Java.

## 📁 Project Structure

```
project-root/
├── src/
│   └── main/
│       └── java/
│           └── org/mvc/
│               ├── controller/
│               │   └── StudentController.java
│               ├── model/
│               │   └── Student.java
│               ├── view/
│               │   └── StudentView.java
│               └── Main.java
├── resources/
├── pom.xml
└── .gitignore
```

## ✅ MVC Components

### **Model** (`Student`)

* Represents the data structure.
* Contains student properties and getters/setters.

### **View** (`StudentView`)

* Responsible for displaying information.
* Contains methods to print student details.

### **Controller** (`StudentController`)

* Acts as a bridge between Model and View.
* Updates the model and refreshes the view.

### **Main**

* Entry point of the application.
* Creates instances of Model, View, and Controller.

## ▶️ How to Run

1. Open the project in **IntelliJ IDEA**.
2. Ensure Maven automatically loads dependencies from `pom.xml`.
3. Navigate to `Main.java`.
4. Run the program.

## 📌 Example Output

```
Student Details
Name: John Doe
Roll No: 123
```

## 🛠️ Technology Used

* Java 17 or later
* Maven
* IntelliJ IDEA

## 📖 Description

This simple MVC project showcases how **data (Model)**, **logic (Controller)**, and **UI (View)** should be separated for clean and maintainable code.

You can extend this project by:

* Adding more fields to Student
* Implementing multiple views
* Connecting to a real database

---

✔️ Feel free to ask if you want enhancements or additional explanation!
