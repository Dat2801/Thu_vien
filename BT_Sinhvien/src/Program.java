import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    Scanner scanner = new Scanner(System.in);
    static Student student = new Student();
    ArrayList<CardStudent> card = new ArrayList<>();

    public void addCard() {
        CardStudent cardStudent = new CardStudent();
        cardStudent.setStudent(student.addStudent());

        System.out.println("Nhập số phiếu mượn");
        int numberVote = Integer.parseInt(scanner.nextLine());
        cardStudent.setNumberVote(numberVote);

        System.out.println("Nhập ngày mượn");
        String dateBorrowed = scanner.nextLine();
        cardStudent.setDateBorrowed(dateBorrowed);

        System.out.println("Nhập ngày trả");
        String datePay = scanner.nextLine();
        cardStudent.setDatePay(datePay);

        System.out.println("Nhập số hiệu sách");
        int idBook = Integer.parseInt(scanner.nextLine());
        cardStudent.setIdBook(idBook);

        card.add(cardStudent);
    }

    public void showCard() {
        for (CardStudent cardStudent : card) {
            System.out.printf("\n%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s"
                    , "Tên sinh viên"
                    , "Mã sinh viên"
                    , "Ngày sinh"
                    , "Lớp học"
                    , "Số phiếu mượn"
                    , "Ngày mượn"
                    , "Ngày trả"
                    , "Số hiệu sách");
            System.out.printf("\n%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s"
                    , cardStudent.getStudent().getName()
                    , cardStudent.getStudent().getId()
                    , cardStudent.getStudent().getDate()
                    , cardStudent.getStudent().getClassRoom()
                    , cardStudent.getNumberVote()
                    , cardStudent.getDateBorrowed()
                    , cardStudent.getDatePay()
                    , cardStudent.getIdBook());
        }
    }

    public CardStudent information() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ngày cuối tháng");
        String date = scanner.nextLine();
        for (CardStudent cardStudent : card) {
            if (date.equals(cardStudent.getStudent().getDate())) {
                System.out.println(cardStudent.toString());
                return cardStudent;
            }
        }
        return null;
    }
}
