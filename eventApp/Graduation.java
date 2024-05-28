import java.util.ArrayList;
import java.util.List;

public class Graduation implements Event  {
    
    
    private String date;
    private List<Observer> observers = new ArrayList<>();

    public Graduation(String date) {
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
            observer.update("Mezuniyete davet edildi. " + date);
        }
    }

   public int eventCreated(){
    return 0;
   }

}