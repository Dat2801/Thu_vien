public class CardStudent {
private int numberVote;
private String dateBorrowed;
private String datePay;
private int idBook;
private Student student;

public CardStudent(){}

    public CardStudent(int numberVote, String dateBorrowed, String datePay, int idBook, Student student) {
        this.numberVote = numberVote;
        this.dateBorrowed = dateBorrowed;
        this.datePay = datePay;
        this.idBook = idBook;
        this.student = student;
    }

    public int getNumberVote() {
        return numberVote;
    }

    public void setNumberVote(int numberVote) {
        this.numberVote = numberVote;
    }

    public String getDateBorrowed() {
        return dateBorrowed;
    }

    public void setDateBorrowed(String dateBorrowed) {
        this.dateBorrowed = dateBorrowed;
    }

    public String getDatePay() {
        return datePay;
    }

    public void setDatePay(String datePay) {
        this.datePay = datePay;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "CardStudent{" +
                "numberVote=" + numberVote +
                ", dateBorrowed='" + dateBorrowed + '\'' +
                ", datePay='" + datePay + '\'' +
                ", idBook=" + idBook +
                ", student=" + student +
                '}';
    }
}
