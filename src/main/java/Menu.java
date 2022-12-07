import java.util.Scanner;

public class Menu {

    public int printOptions(){

        System.out.println("1.Podaj dwie daty aby wyświetlić nazwy filmów wydanych pomiędzy tymi datami" +
                "\n2.Wyświetl wszystkie informacje o losowym filmie" +
                "\n3.Podaj imię i nazwisko aktora aby wyświetlić nazwy filmów w jakich zagrał");

        return new Scanner(System.in).nextInt();
    }
}
