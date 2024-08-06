package entity;

public class Qualify {
    private int course_id;
    private int student_id;
    private int score;
    private String description;

    public Qualify() {
    }

    public Qualify(int course_id, int student_id, int score, String description) {
        this.course_id = course_id;
        this.student_id = student_id;
        this.score = score;
        this.description = description;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Qualify{" +
                "course_id=" + course_id +
                ", student_id=" + student_id +
                ", score=" + score +
                ", description='" + description + '\'' +
                '}';
    }
}
