create database demo;
use demo;
CREATE TABLE students (
    student_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50),
    age INT,
    email VARCHAR(100) UNIQUE,
    course VARCHAR(50),
    marks DECIMAL(5,2)
);

INSERT INTO students (first_name, last_name, age, email, course, marks)
VALUES
('Rahul', 'Patil', 21, 'rahul@gmail.com', 'Java', 85.50),
('Priya', 'Sharma', 22, 'priya@gmail.com', 'Python', 90.00),
('Amit', 'Deshmukh', 20, 'amit@gmail.com', 'SQL', 78.50);

SELECT * FROM students;