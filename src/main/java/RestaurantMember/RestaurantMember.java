package RestaurantMember;

import java.util.UUID;

public abstract class RestaurantMember implements RestaurantMemberInterface {
    private final UUID id;
    private String name;

    protected RestaurantMember() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
