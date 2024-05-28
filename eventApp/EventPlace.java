import java.util.HashMap;
import java.util.Map;




class EventPlace {
    private Map<String, Boolean> salonTakvim;

    public EventPlace() {
        salonTakvim = new HashMap<>();
        
            String[] salonlar = {
                // Haziran
                "2024-06-01,false",
                "2024-06-02,true",
                "2024-06-03,true",
                "2024-06-04,false",
                "2024-06-05,true",
                "2024-06-06,false",
                "2024-06-07,true",
                "2024-06-08,true",
                "2024-06-09,false",
                "2024-06-10,false",
                "2024-06-11,true",
                "2024-06-12,false",
                "2024-06-13,true",
                "2024-06-14,false",
                "2024-06-15,true",
                "2024-06-16,false",
                "2024-06-17,true",
                "2024-06-18,true",
                "2024-06-19,false",
                "2024-06-20,true",
                "2024-06-21,false",
                "2024-06-22,true",
                "2024-06-23,true",
                "2024-06-24,true",
                "2024-06-25,false",
                "2024-06-26,true",
                "2024-06-27,true",
                "2024-06-28,false",
                "2024-06-29,true",
                "2024-06-30,true",
            
                // Temmuz
                "2024-07-01,false",
                "2024-07-02,true",
                "2024-07-03,true",
                "2024-07-04,false",
                "2024-07-05,true",
                "2024-07-06,false",
                "2024-07-07,true",
                "2024-07-08,true",
                "2024-07-09,false",
                "2024-07-10,false",
                "2024-07-11,true",
                "2024-07-12,false",
                "2024-07-13,true",
                "2024-07-14,false",
                "2024-07-15,true",
                "2024-07-16,false",
                "2024-07-17,true",
                "2024-07-18,true",
                "2024-07-19,false",
                "2024-07-20,true",
                "2024-07-21,false",
                "2024-07-22,true",
                "2024-07-23,true",
                "2024-07-24,true",
                "2024-07-25,false",
                "2024-07-26,true",
                "2024-07-27,true",
                "2024-07-28,false",
                "2024-07-29,true",
                "2024-07-30,true",
                "2024-07-31,false"
            };
            
 
        for (String salon : salonlar) {
            String[] parts = salon.split(",");
            salonTakvim.put(parts[0], Boolean.parseBoolean(parts[1]));
        }
    }

    public int etkinlikEkle(String tarih) {
        MessageBuilder messageBuilder = new MessageBuilder();
        
        if (salonTakvim.containsKey(tarih)) {
            if (!salonTakvim.get(tarih)) {
                salonTakvim.put(tarih, true);
                System.out.println(messageBuilder.addMessage("Yer ayırtıldı.").build());
                return 1;
            } else {
                System.out.println(messageBuilder.addMessage("Üzgünüz, bu tarihler dolu.").build());
                return 0;
            }
        } else {
            System.out.println(messageBuilder.addMessage("Üzgünüz, bu tarih için salon mevcut değil.").build());
            return 0;
        }
    }
   
}





