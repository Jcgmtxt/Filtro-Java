import controller.StudentController;
import entity.Student;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        var flag = true;
        while (flag){
            String selector = JOptionPane.showInputDialog("""
                    1. Students Panel.
                    
                    2. Courses Panel.
                    
                    3. Inscriptions Panel.
                    
                    4. Qualify Panel
                   
                    5. Exit
                    """);
            if (selector.equals("5")){
                JOptionPane.showMessageDialog(null, "Thanks for Using our Manager!");
                flag = false;
            } else if (selector.equals("1")){
                System.out.println('a');
            }

        }

        System.out.println("Hello world!");
    }
    static void StudentPanel(){
        var flag = true;
        while (flag){
            String selector = JOptionPane.showInputDialog("""
                    1. Create student.
                    
                    2. Courses Panel.
                    
                    3. Inscriptions Panel.
                    
                    4. Qualify Panel
                   
                    5. Exit
                    """);
            if (selector.equals("5")){
                JOptionPane.showMessageDialog(null, "Thanks for Using our Manager!");
                flag = false;
            } else if (selector.equals("1")){
                String name = JOptionPane.showInputDialog(null, "Enter the name of the student");
                String email = JOptionPane.showInputDialog(null, "Enter the email of the student,");
                Student student = new Student();
                student.setName(name);
                student.setEmail(email);
            }

        }
    }
}