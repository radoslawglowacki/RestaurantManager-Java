import RestaurantMember.Chef;
import RestaurantMember.Guest;
import RestaurantMember.Waiter;

public class App {

    public static void main(String[] args) {
        RestaurantManager restaurantManager = new RestaurantManager();
        restaurantManager.addChef("Mark");
        restaurantManager.addWaiter("Stephan");
        restaurantManager.addGuest("John", "egg");
        restaurantManager.addGuest("Greta", "fish");
        restaurantManager.addGuest("Bill", "steak");

        Guest john = restaurantManager.getGuestList().get(0);
        Guest greta = restaurantManager.getGuestList().get(1);
        Guest Bill = restaurantManager.getGuestList().get(2);

        Waiter waiter = restaurantManager.getWaiters().get(0);
        Chef chef = restaurantManager.getChefs().get(0);

        john.interact(greta);

        waiter.interact(john);
        waiter.interact(greta);
        waiter.interact(Bill);

        chef.interact(waiter);

        waiter.interact(john);

        chef.interact(waiter);

        waiter.interact(john);
        waiter.interact(greta);
        waiter.interact(Bill);

    }
}
