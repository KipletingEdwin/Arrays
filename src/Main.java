//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //array = used to store multiple values in a single variable

        //step one of creating an array in Java
        String[] cars = {"Corvette", "Camaro", "Tesla" };
        cars[0] = "Mustang";

        //step two of creating array in Java
        String[] aeroplanes = new String[3];
        aeroplanes[0] = "A330";
        aeroplanes[1] = "A350";
        aeroplanes[2] = "B787";


        for(int i=0; i<aeroplanes.length; i++){
            System.out.println(aeroplanes[i]);

        }

        for(int j=0; j<cars.length; j++){
            System.out.println(cars[j]);
        }






    }
}