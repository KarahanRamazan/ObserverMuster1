public class History implements IObserver {
    private SensorDaten sensorDaten;

    public History(SensorDaten sensorDaten) {
        this.sensorDaten = sensorDaten;
        sensorDaten.addObserver(this);
    }

    @Override
    public void update() {
        save(sensorDaten.getMesswerte());


    }

    public void save(int[] messwerte) {
        System.out.println("Speichere Werte...");
        for (int i : messwerte) {
            System.out.println(i);
        }

    }
}
