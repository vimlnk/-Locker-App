package app;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers = new DataRepository().getData();
        DataHandler dataHandler = new DataHandler();
        for (int num : numbers) {
            System.out.println("Initial value is " + num);
            int newNum = dataHandler.modify(num);
            System.out.println("New value is " + newNum);
        }
    }
}