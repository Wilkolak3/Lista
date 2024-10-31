import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        System.out.println("Podawaj wartości do wpisania na listę. " +
                "Wpisanie -1 powoduje koniec wczytywania");

        Scanner scanner = new Scanner(System.in);
        int value;
        while(true) {
            value = scanner.nextInt();
            if(value == -1){
                break;
            }
            list.addElement(value);
        }

        System.out.println("-----------");
        list.display();
    }
}