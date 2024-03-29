public class Dashboard implements IObserver{
    private SensorDaten sensorDaten;

    public Dashboard(SensorDaten sensorDaten)
    {
        this.sensorDaten = sensorDaten;
        sensorDaten.addObserver(this);
    }


    @Override
    public void update() {
        display(sensorDaten.getMesswerte());
    }


    public void display(int[] messwerte) {
        System.out.println("Aktuelle Werte:");
        for (int i : messwerte) {
            System.out.println(i);
        }

    }}
