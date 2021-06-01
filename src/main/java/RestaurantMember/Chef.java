package RestaurantMember;

import java.util.HashMap;
import java.util.UUID;

public class Chef extends RestaurantMember {

    private HashMap<UUID, String> ordersToPrepare;

    public Chef(String name) {
        this.ordersToPrepare = new HashMap<>();
        this.setName(name);
    }

    @Override
    public void interact(RestaurantMember restaurantMember) {
        if (restaurantMember instanceof Waiter) {
            Waiter waiter = (Waiter) restaurantMember;
            System.out.println("Chef name: " + this.getName());
            System.out.println("Waiter name: " + waiter.getName());
            if (ordersToPrepare.size() > 0) {
                waiter.getDishesReadyToServe().putAll(ordersToPrepare);
                ordersToPrepare.clear();
                ordersToPrepare.putAll(waiter.guestsOrders);
                waiter.getGuestsOrders().clear();
            } else {
                setOrdersToPrepare(waiter.guestsOrders);
            }
        }
    }

    public void setOrdersToPrepare(HashMap<UUID, String> ordersToPrepare) {
        this.ordersToPrepare = ordersToPrepare;
    }
}
