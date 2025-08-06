# 🎓 Student Course Registration System (Java Console Application)

## 📌 Overview
The **Student Course Registration System** is a Java-based console application that allows students to register for various courses.  
It demonstrates **Object-Oriented Programming (OOP)** concepts, modular design, and the use of Java Collections.  
This system supports student and course management, enrollment tracking, and (optionally) file-based data persistence.

---

## 🎯 Features
- **Register a Student** – Add new students with unique IDs.
- **Add a Course** – Create and store courses with details.
- **Enroll a Student in a Course** – Assign students to courses.
- **View All Students** – Display the list of registered students.
- **View All Courses** – Display all available courses.
- **View All Enrollments** – Show which students are enrolled in which courses.
- **Exit Program** – Quit the application gracefully.

---

## 🛠 Technologies Used
- **Language:** Java (JDK 8 or later)
- **Collections:** ArrayList for data storage
- **Date Handling:** `java.time.LocalDate`
- **OOP Concepts:** Classes, Objects, Encapsulation, Modular Design
- **(Bonus)** File Handling for persistent data storage

---

## 📂 Project Structure
```
src/
 ├── Main.java # Mian menu and system logics
 ├── models/
 │    ├── student.java # Student class (ID, name, email)
 │    ├── course.java # Course class (course ID, name, instructor)
 │    └── enrollment.java # Enrollment class (student ID, course ID, date)
 ├── Readme.md # Project description and instructions
 
```

---

## 🚀 How to Run
1. **Clone or Download** this repository.
2. Open the project in any Java IDE (**Eclipse**, **IntelliJ**, **NetBeans**) or terminal.
3. Compile all `.java` files:
   ```bash
   javac src/**/*.java
   ```
4. Run the program:
   ```bash
   java Main
   ```
5. Follow the **menu-driven interface** to use the system.

---

## 📖 Sample Menu
```
===== Student Course Registration System =====
1. Register Student
2. Add Course
3. Enroll Student in Course
4. View All Students
5. View All Courses
6. View All Enrollments
7. Exit
Enter choice:
```

---

## 🏗 OOP Principles Used
- **Encapsulation:** Private fields with getters and setters.
- **Modularity:** Separation of concerns with models, services, and main logic.
- **Abstraction:** Main program interacts only with service methods.
- **Composition:** Services manage collections of model objects.

---

## 📌 Future Enhancements
- Add **file storage** to save and load student/course/enrollment data.
- Implement **search and filter** options.
- Add **input validation** and error handling for better UX.
- Implement **GUI** using JavaFX or Swing.

---

## 📜 Author
**Aagam Jain**
JAVA Developer | Inter @ InfoBharatInterns

---
