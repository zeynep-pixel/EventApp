import java.util.ArrayList;
import java.util.List;

public class Wedding implements Event {
    private String date;
    private List<Observer> observers = new ArrayList<>();
    private ThemeSelector themeSelector;

    public Wedding(String date, ThemeSelector themeSelector) {
        this.date = date;
        this.themeSelector = themeSelector;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyGuests() {
        for (Observer observer : observers) {
            observer.update("Düğüne davet edildi. " + date);
        }
    }

    public int eventCreated() {
        int a;
        EventPlace eventPlace = new EventPlace();
        a = eventPlace.etkinlikEkle(this.date);
        return a;
    }

    public String selectTheme() {
        System.out.println(themeSelector.selectTheme());
        return themeSelector.selectTheme();
        
    }
}


