package RestaurantMember;

import java.util.HashMap;
import java.util.UUID;

public class Waiter extends RestaurantMember {

    HashMap<UUID, String> guestsOrders;
    HashMap<UUID, String> dishesReadyToServe;

    public Waiter(String name) {
        this.guestsOrders = new HashMap<>();
        this.dishesReadyToServe = new HashMap<>();
        this.setName(name);
    }

    @Override
    public void interact(RestaurantMember restaurantMember) {
        if (restaurantMember instanceof Guest) {
            Guest guest = (Guest) restaurantMember;
            if (guest.isOrderPlaced()) {
                if (getDishesReadyToServe().containsKey(guest.getId())) {
                    guest.changeOrderStatus();
                    getDishesReadyToServe().remove(guest.getId());
                    System.out.println(guest.getPreferredDish());
                    System.out.println("Enjoy your meal");
                } else {
                    System.out.println("I still do not have your order jet");
                }
            } else {
                UUID guestId = guest.getId();
                String guestPreferredDish = guest.getPreferredDish();
                guest.changeOrderStatus();
                getGuestsOrders().put(guestId, guestPreferredDish);
                System.out.println("Thank you for your order");
            }
        }
    }


    public HashMap<UUID, String> getGuestsOrders() {
        return guestsOrders;
    }

    public HashMap<UUID, String> getDishesReadyToServe() {
        return dishesReadyToServe;
    }

}
