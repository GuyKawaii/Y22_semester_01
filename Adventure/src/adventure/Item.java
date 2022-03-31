package adventure;

import static adventure.enum_and_color.Color.ANSI_BLUE;
import static adventure.enum_and_color.Color.ANSI_RESET;

public class Item {
    private String name;
    private String description;

    public Item(String name, String description) {
        setName(name);
        setDescription(description);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("%s%s%s: %s",
            ANSI_BLUE, name,
            ANSI_RESET, description);
    }

}
