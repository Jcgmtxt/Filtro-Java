package entity;

public class Student {
    private int id;
    private String name;
    private String email;

    private boolean active_student;

    public Student() {
    }
    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.active_student = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive_student() {
        return active_student;
    }

    public void setActive_student(boolean active_student) {
        this.active_student = active_student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", active_student=" + active_student +
                '}';
    }
}
