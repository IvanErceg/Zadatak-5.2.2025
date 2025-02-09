import java.util.Scanner;

public class Zadatak5022025_2
{
    public static void main(String[] args) {
        System.out.printf("PRVI ZADATAK obrnuti string");

        Scanner input=new Scanner(System.in);

        String rijec=input.nextLine();
        do {
            rijec = input.nextLine();
            if (rijec.isEmpty()) {
                System.out.println("Molimo vas, unesite neku riječ.");
            }
        } while (rijec.isEmpty());
        String obrnuto="";
    for (int i = 0; i < rijec.length(); i++){
        obrnuto = rijec.charAt(i) + obrnuto;

    }

    System.out.println(obrnuto);
        System.out.printf("\n\n\n DRUGI ZADATAK-izbroji je slova ,brojeve i ostale znakove\n\n\n");
        Integer[] counter =  {0,0,0};
       // Scanner input = new Scanner(System.in);

        String duljistring = input.nextLine();
        char[] name = duljistring.toCharArray();
        System.out.println(name.length);
       // for (int j = 0; j < counter.length; j++) {
            for (int i = 0; i < name.length; i++) {
                if (Character.isLetter(name[i])) {
                    counter[0]++;
                }
                   else if(Character.isDigit(name[i])){
                       counter[1]++;
                }else{
                        counter[2]++;
                }

            }

      //  }
        System.out.println("Slova su: "+counter[0]);
        System.out.println("Brojevi su: "+counter[1]);
        System.out.println("ostali elementi  su: "+counter[2]);

}
}
