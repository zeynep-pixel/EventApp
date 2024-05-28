import java.util.ArrayList;
import java.util.List;

public class Anniversary implements Event  {
    
    
    private String date;
    private List<Observer> observers = new ArrayList<>();

    public Anniversary(String date) {
        this.date = date;
       
        
    }


    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyGuests() {
        for (Observer observer : observers) {
            observer.update("Yıldönümü etkinliğinize davet edildi. " + date);
        }
    }

   public int eventCreated(){
    return 0;
   }

}