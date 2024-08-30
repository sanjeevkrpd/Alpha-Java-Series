package Hash;

import java.util.*;

public class ItineraryFromTicket {
    public static void main(String[] args) {
        
        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

      
        String start = getStart(tickets);

        StringBuilder destination = new StringBuilder(start);

        while (tickets.containsKey(start)) {
            destination.append( " -> ").append(tickets.get(start));
            start = tickets.get(start);
        }

        System.out.println(destination);
       
    }

    public static String getStart(HashMap<String ,String> tickets){

        HashMap<String , String> revTickets = new HashMap<>();

        for (Map.Entry<String , String> rev : tickets.entrySet()) {
            
            revTickets.put(rev.getValue(), rev.getKey());
        }

        for (String key : tickets.keySet()) {
            if (!revTickets.containsKey(key)) {
                return key;
            }
        }
        return null;

    }

}
