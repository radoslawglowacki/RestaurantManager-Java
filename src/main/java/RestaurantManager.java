import RestaurantMember.Chef;
import RestaurantMember.Guest;
import RestaurantMember.Waiter;

import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {

    private List<Guest> guestList;
    private List<Waiter> waiters;
    private List<Chef> chefs;

    public RestaurantManager() {
        this.guestList = new ArrayList<>();
        this.waiters = new ArrayList<>();
        this.chefs = new ArrayList<>();
    }

    public void addGuest(String name, String preferredDish) {
        guestList.add(new Guest(name, preferredDish));
    }

    public void addWaiter(String name) {
        waiters.add(new Waiter(name));
    }

    public void addChef(String name) {
        chefs.add(new Chef(name));
    }

    public List<Guest> getGuestList() {
        return guestList;
    }

    public List<Waiter> getWaiters() {
        return waiters;
    }

    public List<Chef> getChefs() {
        return chefs;
    }

}

