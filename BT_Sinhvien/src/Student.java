import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    private String date;
    private String classRoom;

    public Student(){}

    public Student(String name, int id, String date, String classRoom) {
        this.name = name;
        this.id = id;
        this.date = date;
        this.classRoom = classRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public Student addStudent(){
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên sinh viên");
        String name = scanner.nextLine();
        student.setName(name);

        System.out.println("Nhập mã sinh viên");
        int id = Integer.parseInt(scanner.nextLine());
        student.setId(id);

        System.out.println("Nhập ngày sinh");
        String date = scanner.nextLine();
        student.setDate(date);

        System.out.println("Nhập lớp học");
        String classRoom = scanner.nextLine();
        student.setClassRoom(classRoom);

        return student;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", date='" + date + '\'' +
                ", classRoom='" + classRoom + '\'' +
                '}';
    }
}
