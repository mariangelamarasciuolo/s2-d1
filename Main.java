import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
public static void main (String[] args) {
    int[] list = new int[5];
    Random random = new Random();

    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < list.length; i++) {
        list[i] = random.nextInt(10) + 1;
    }
    System.out.println("Array inizializzato");
while(true) {
    try{
        System.out.println("inserisci un numero, se vuoi uscire premi '0'");
        int numInserito = sc.nextInt();

        if( numInserito == 0) {
            break;
        }
        System.out.println("Scegli una posizione da 0 a 4");
        int position = sc.nextInt();
        if (position < 0 | position >= list.length){
            throw new ArrayIndexOutOfBoundsException ("Errore, scegli la posizione da 0 a 4!!");
        }
        list[position] = numInserito;

        System.out.println("Ecco il tuo array aggiornato");
        printList(list);

    } catch (ArrayIndexOutOfBoundsException ex){
        System.err.println("Ripeti");

    }
}

}

    private static void printList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }


}
