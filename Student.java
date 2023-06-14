public class Student {

    int studentid;
    String studentName;



    public String getStudentName() {
        return studentName;
    }


    public String getStudentPhone() {
        return studentPhone;
    }


    public String getStudentCity() {
        return studentCity;
    }


    String studentPhone;
    String studentCity;


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
