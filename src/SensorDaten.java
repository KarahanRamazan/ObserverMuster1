import java.util.ArrayList;
import java.util.List;

public class SensorDaten {
    private final List<IObserver> observers=new ArrayList<>();
    private int [] messwerte;
    public void addObserver(IObserver observer){
        observers.add(observer);
    }


    public void removeObserver(IObserver observer)
    {
        observers.remove(observer);
    }



    public void notifyObservers()
    {
        for (IObserver o : observers)
        {
            o.update();
        }
    }

    public int[] getMesswerte()
    {
        return messwerte;
    }

    public void setMesswerte(int[] messwerte)
    {
        this.messwerte = messwerte;
        notifyObservers();
    }
}


