import java.util.Scanner;

public class Main {
    static Program program = new Program();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("\n"+"------Menu------");
            System.out.println("1. Thêm thẻ mượn");
            System.out.println("2. Hiển thị thông tin");
            System.out.println("3. Thông tin những người mượn sách vào cuối tháng");
            System.out.println("4. Thoát");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    program.addCard();
                    break;
                case 2:
                    program.showCard();
                    break;
                case 3:
                    program.information();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}
