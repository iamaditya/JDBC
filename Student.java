public class Student {

    int studentid;
    String studentName;

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    String studentPhone;
    String studentCity;

    Student(int id, String name, String phone, String city){
//        super();
        studentid = id;
        studentName = name;
        studentPhone = phone;
        studentCity = city;

    }

    Student(String name, String phone, String city){
        studentName = name;
        studentPhone = phone;
        studentCity = city;

    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid='" + studentid + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentPhone='" + studentPhone + '\'' +
                ", studentCity='" + studentCity + '\'' +
                '}';
    }
}
