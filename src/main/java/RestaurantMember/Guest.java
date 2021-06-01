package RestaurantMember;

public class Guest extends RestaurantMember {
    private String preferredDish;
    private boolean isOrderPlaced;

    public Guest(String name, String preferredDish) {
        this.preferredDish = preferredDish;
        this.setName(name);
    }

    @Override
    public void interact(RestaurantMember restaurantMember) {
        if (restaurantMember instanceof Guest) {
            Guest otherGuest = (Guest) restaurantMember;
            String preferredDishOtherGuest = otherGuest.getPreferredDish();
            String preferredDishThisGuest = this.getPreferredDish();
            otherGuest.setPreferredDish(preferredDishThisGuest);
            this.setPreferredDish(preferredDishOtherGuest);
        }
    }

    public String getPreferredDish() {
        return preferredDish;
    }

    public void setPreferredDish(String preferredDish) {
        this.preferredDish = preferredDish;
    }

    public boolean isOrderPlaced() {
        return isOrderPlaced;
    }

    public void changeOrderStatus() {
        isOrderPlaced = !isOrderPlaced;
    }
}
