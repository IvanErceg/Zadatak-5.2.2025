import java.util.Scanner;

public class Zadatak5022025_1 {
    public static void main(String[] args) {
        System.out.printf("PRVI ZADATAK -ime i prezime\n");
        System.out.println("Enter first and last name:");
        Scanner input = new Scanner(System.in);

        boolean dalje = true;
        int index;
        while (dalje) {
            String imePrezime = input.nextLine().trim();

            String[] name = imePrezime.split(" ");

            boolean tocno = true;
            index = 0;


            while (tocno && index < name.length) {
                if (name[index].length() > 7) {
                    System.out.println("Ime ili prezime ima previše znakova");
                    tocno = false;//ovaj dio sprečava da ide dalje i čita ime i prezime
                }
                index++;
            }


            if (tocno) {
                if (name.length >= 2) {
                    String prva = name[0];
                    String druga = name[1];
                    System.out.println("Ime je: " + prva);
                    System.out.println("Prezime je: " + druga);
                    dalje= false;
                } else {
                    System.out.println("Nisi upisao  ime ili prezime");
                }
            }
        }

        System.out.printf("\nDRUGI ZADATAK -mjesto rođenja\n");
        System.out.println("Upiši mjesto rođenja:");
        String gradRođenja = input.nextLine();
        System.out.println("Grad rođenja: " + gradRođenja);

        char[] samoglasnici = {'a', 'e', 'i', 'o', 'u'};
        int[] countovi = {0, 0, 0, 0, 0};


        for (char grad : gradRođenja.toCharArray()) {
            for (int i = 0; i < samoglasnici.length; i++) {
                if (grad == samoglasnici[i]) {
                    countovi[i]++;
                }
            }
        }


        for (int i = 0; i < samoglasnici.length; i++) {
            if (countovi[i] > 0) {
                System.out.println("Samoglasnik '" + samoglasnici[i] + "' pojavljuje se: " + countovi[i] + " puta.");
            }
        }


        input.close();
    }
}
