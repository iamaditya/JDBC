# Student Management System
This is a simple Java application for managing student records in a database. It provides functionality to add, delete, and display student information using a command-line interface.

## Prerequisites
1. Java Development Kit (JDK)
2. PostgreSQL Database

### Getting Started
1. Clone the repository:
    
    git clone https://github.com/iamaditya/JDBC.git

2. Set up the PostgreSQL database:
    1. Install PostgreSQL on your local machine.
    2. Create a database named TestDB.
    3. Update the database connection details in the ConnectionP class if necessary.

3. Compile the source code:
    javac Start.java

4. Run the application:
    java Start

### Usage
The application provides the following options:

1. Add Student: Add a new student to the database by providing their name, phone number, and city.
2. Delete Student: Delete a student from the database by entering their ID.
3. Display Student: Display all the students stored in the database.
4. Exit: Quit the application.

### Contributing
Contributions are welcome! If you find any issues or want to enhance the functionality, feel free to submit a pull request.

### License
This project is licensed under the [MIT License](LICENSE).

### Acknowledgements
* [Postgres](https://www.postgresql.org/)
* [Java JDBC](https://www.javatpoint.com/java-jdbc/)