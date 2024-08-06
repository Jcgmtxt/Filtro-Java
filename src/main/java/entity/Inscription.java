package entity;

public class Inscription {
    private int id;
    private int course_id;
    private int student_id;
    private String inscription_date;

    public Inscription(){
    }

    public Inscription(int id, int course_id, int student_id, String inscription_date) {
        this.id = id;
        this.course_id = course_id;
        this.student_id = student_id;
        this.inscription_date = inscription_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getInscription_date() {
        return inscription_date;
    }

    public void setInscription_date(String inscription_date) {
        this.inscription_date = inscription_date;
    }

    @Override
    public String toString() {
        return "Inscription{" +
                "id=" + id +
                ", course_id=" + course_id +
                ", student_id=" + student_id +
                ", inscription_date='" + inscription_date + '\'' +
                '}';
    }
}
