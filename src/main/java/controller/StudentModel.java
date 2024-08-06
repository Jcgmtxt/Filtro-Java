package controller;

import entity.Student;
import persistence.IModel.IStudent;
import persistence.connectionDB.ConfigDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentModel implements IStudent {
    @Override
    public Student create(Student object) {
        PreparedStatement preparedStatement = null;
        Connection connection = ConfigDB.openConnection();
        String query = "INSERT INTO student (name, email, active_student) VALUES (?, ?, ?)";
        try {
            preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, object.getName());
            preparedStatement.setString(2, object.getEmail());
            preparedStatement.setBoolean(3, object.isActive_student());

            preparedStatement.executeUpdate();

            //ResultSet rs = preparedStatement.getGeneratedKeys();
            //if (rs.next()) {
            //    object.setId(rs.getInt(1));
            //}

            System.out.println("Student created successfully.");
            return object;

        } catch (SQLException e) {
            throw new RuntimeException("SQL Error: " + e.getMessage());
        } finally {
            try{
                ConfigDB.closeConnection();
            }catch (Exception e){
                System.out.println("Error connection " + e.getMessage());
            }
        }
    }

    @Override
    public ArrayList<Student> read() {
        try {
            Connection connection = ConfigDB.openConnection();
            String query = "SELECT * FROM student";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<Student> students = new ArrayList<>();
            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setEmail(resultSet.getString("email"));
                student.setActive_student(resultSet.getBoolean("active_student"));
                students.add(student);
            }
            return students;
        } catch (SQLException e) {
            throw new RuntimeException("SQL Error: " + e.getMessage());
        } finally {
            try{
                ConfigDB.closeConnection();
            }catch (Exception e){
                System.out.println("Error connection " + e.getMessage());
            }
        }
    }

    @Override
    public boolean update(Student object) {
        PreparedStatement preparedStatement = null;
        Connection connection = ConfigDB.openConnection();
        String query = "UPDATE student SET name = ?, email = ?, active_student = ? WHERE id = ?";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, object.getName());
            preparedStatement.setString(2, object.getEmail());
            preparedStatement.setBoolean(3, object.isActive_student());
            preparedStatement.setInt(4, object.getId());
            preparedStatement.executeUpdate();
            System.out.println("Student updated successfully.");
            return true;

        } catch (SQLException e) {
            throw new RuntimeException("SQL Error: " + e.getMessage());
        } finally {
            try{
                ConfigDB.closeConnection();
            }catch (Exception e){
                System.out.println("Error connection " + e.getMessage());
            }
        }

    }

    @Override
    public Student read(Student object) {
        PreparedStatement preparedStatement = null;
        Connection connection = ConfigDB.openConnection();
        String query = "SELECT * FROM student WHERE id = ?";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, object.getId());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setEmail(resultSet.getString("email"));
                student.setActive_student(resultSet.getBoolean("active_student"));
                return student;
            }
        } catch (SQLException e) {
            throw new RuntimeException("SQL Error: " + e.getMessage());
        } finally {
            try{
                ConfigDB.closeConnection();
            }catch (Exception e){
                System.out.println("Error connection " + e.getMessage());
            }
        }
        return null;
    }

    public Student readMail(Student Object) {
        PreparedStatement preparedStatement = null;
        Connection connection = ConfigDB.openConnection();
        String query = "SELECT * FROM student WHERE email = ?";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, Object.getEmail());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setEmail(resultSet.getString("email"));
                student.setActive_student(resultSet.getBoolean("active_student"));
                return student;
            }
        } catch (SQLException e) {
            throw new RuntimeException("SQL Error: " + e.getMessage());
        } finally {
            try{
                ConfigDB.closeConnection();
            }catch (Exception e){
                System.out.println("Error connection " + e.getMessage());
            }
        }
        return null;
    }
}
