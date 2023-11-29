import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerService customerService = new CustomerService();
        System.out.println("\n");
        System.out.println("-----------Customer Service----------");
        System.out.println("\n");
        try {
            while (true){
                System.out.println("Secim edin");
                System.out.println("1 Musteri elave etmek");
                System.out.println("2 Musteri listesini gormek");
                System.out.println("3 Musterini silmek");
                System.out.println("4 programdan cixmag");

                int choice = scanner.nextInt();
                if (choice == 1){
                    System.out.println("Musteri id sini daxil edin");
                    int id = scanner.nextInt();
                    System.out.println("Musteri adini daxil edin");
                    String name = scanner.next();
                    System.out.println("Musteri soyadini daxil edin");
                    String surname = scanner.next();
                    System.out.println("Musteri pin kodunu daxil edin");
                    String pin = scanner.next();
                    customerService.addCustomer(id,name,surname,pin);
                    System.out.println("Musteri elave edildi");
                } else if (choice == 2) {
                    System.out.println("Musteri listesi");
                    customerService.displayCustomer();
                } else if (choice == 3) {
                    System.out.println("Musterini silmek ucun id sini daxil edin");
                    int id = scanner.nextInt();
                    customerService.removeCustomer(id);
                    System.out.println("Musteri silindi");
                } else if (choice == 4) {
                    System.exit(0);
                    scanner.close();
                    System.out.println("Programdan cixildi");
                }else {
                    System.out.println("Yanlis secim etdiniz");
                }
            }
        }catch (RuntimeException e){
            System.out.println("Reqem daxil edilmelidir " + e.getMessage());
        }
    }
}