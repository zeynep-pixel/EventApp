import java.util.ArrayList;
import java.util.List;

public class Birthday implements Event  {
    
    
    private String date;
   
    private List<Observer> observers = new ArrayList<>();

    public Birthday(String date) {
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
            observer.update("Doğum gününe davet edildi. " + date);
        }
    }

   public int eventCreated(){
    return 0;
   }

}