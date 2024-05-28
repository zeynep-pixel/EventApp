public class Main {
        public static void main(String[] args) {
            // Yaz teması seçilmiş düğün
            ThemeSelector summerTheme = new SummerTheme();
            Wedding summerWedding = new Wedding("2024-06-04", summerTheme);
            
    
            // Kullanıcıların organizasyon tarafından davet edilmesini istediği kişiler
            Guest guest1 = new Guest("Sümeyra");
            Guest guest2 = new Guest("Ayşe");
            Guest guest3 = new Guest("Zeynep");
            Guest guest4 = new Guest("Zehra");
    
            // Her bir misafiri düğüne davet et
            summerWedding.addObserver(guest1);
            summerWedding.addObserver(guest2);
            summerWedding.addObserver(guest3);
            summerWedding.addObserver(guest4);
    
            // Eğer organizasyon mekanı müsait ve etkinlik için yer ayırtıldı ise davetlileri haber ver
            
    
            // Etkinlik oluşturulduktan sonra
            int result = summerWedding.eventCreated();
            //Tema Seçildi
            
            if (result == 1) {
                summerWedding.selectTheme();
                summerWedding.notifyGuests();
            } 
        }
    }
    


        

    
    
   

