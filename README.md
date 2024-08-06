CREATE DATABASE RiwiAcademyDB;

USE RiwiAcademyDB;

CREATE TABLE Course(
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(25) NOT NULL UNIQUE
);

CREATE TABLE Student (
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR (25),
    mail VARCHAR(50) UNIQUE NOT NULL
);

ALTER TABLE Student
ADD active_student BOOLEAN;

CREATE TABLE inscription(
	id INT AUTO_INCREMENT PRIMARY KEY,
    course_id int,
    student_id int,
    inscription_date DATE NOT NULL,
    CONSTRAINT FOREIGN KEY (course_id) REFERENCES Course(id),
    CONSTRAINT FOREIGN KEY (student_id) REFERENCES Student(id)
);

CREATE TABLE qualify(
	course_id INT,
    student_id INT,
    score INT,
    description VARCHAR(25),
	CONSTRAINT FOREIGN KEY (course_id) REFERENCES Course(id),
    CONSTRAINT FOREIGN KEY (student_id) REFERENCES Student(id)
);


