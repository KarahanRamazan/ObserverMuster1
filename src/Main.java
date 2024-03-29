import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SensorDaten sensorDaten = new SensorDaten();
        Dashboard dashboard = new Dashboard(sensorDaten);
        History history = new History(sensorDaten);

        Random random = new Random();
        int[] messwerte = new int[10];
        for (int i = 0; i < 10; i++)
            messwerte[i] = random.nextInt(50) + 50;

        sensorDaten.setMesswerte(messwerte);



    }
}