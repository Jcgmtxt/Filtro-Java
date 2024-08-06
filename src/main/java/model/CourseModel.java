package model;

import entity.Course;
import persistence.IModel.ICourse;
import persistence.connectionDB.ConfigDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class CourseModel implements ICourse {
    @Override
    public Course create(Course object) {
        PreparedStatement preparedStatement = null;
        Connection connection = ConfigDB.openConnection();
        String query = "INSERT INTO Course (name) VALUES (?);";
        try {
            preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, object.getName());

            preparedStatement.executeUpdate();

            System.out.println("Course created successfully.");
            return object;
        }  catch ( SQLException e) {
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
    public boolean update(Course object) {
   /*     PreparedStatement preparedStatement;
        Connection connection = ConfigDB.openConnection();
        String query*/
        return false;
    }

    @Override
    public void delete(Integer typeId) {
        PreparedStatement preparedStatement;
        Connection connection = ConfigDB.openConnection();
        String query = "DELETE FROM Course WHERE id=?;";

        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,typeId);

            preparedStatement.executeUpdate();
            System.out.println("Course Correctly Deleted!");
        } catch(SQLException e) {
            throw new RuntimeException("SQL Error: " + e.getMessage());
        } finally {
            ConfigDB.closeConnection();
        }
    }

    @Override
    public ArrayList<Course> read() {
        return null;
    }



    @Override
    public Course read(Course object) {
        return null;
    }
}





