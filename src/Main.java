import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        MailPromos mailPromos = new MailPromos();

        executeGame(mailPromos);


    }

    private static void executeGame(MailPromos mailpromos) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("" +
                "1- suscribir correo\n" +
                "2- desuscribir correo \n" +
                "3- Enviar promocion\n" +
                "8- Salir");
        int menuOption = sc.nextInt();

        switch (menuOption){
            case 1:
                System.out.println("Subscribir Correo");
                String mailToBeAdded = sc2.nextLine();

                Correo correo = new Correo(mailToBeAdded);
                mailpromos.addObserver(correo);

                System.out.println("Correo suscrito.");
                executeGame(mailpromos);
                break;

            case 2:
                mailpromos.getObservers().forEach(System.out::println);

                System.out.println("Desuscribir Correo");
                String mailToBeRemoved = sc2.nextLine();

                mailpromos.removeByName(mailToBeRemoved);
                System.out.println("Correo desuscrito.");
                executeGame(mailpromos);
                break;

            case 3:
                System.out.println("Enviar Promoción");
                String link = sc2.nextLine();
                mailpromos.addPromo(link);
                executeGame(mailpromos);
                break;
            case 8:
                System.out.println("Gracias por estar atento a nuestras promociones!");
                break;
            default:
                System.out.println("Opción incorrecta");
        }
        sc.close();
        sc2.close();
    }
}