<<<<<<< HEAD
package dev.lpa;

=======
>>>>>>> 62ea25f38c81d03321eb57b4c5df2422e1167861
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public List<String> write() {
        return List.of(name, String.valueOf(hitPoints), String.valueOf(strength));
    }

    @Override
    public void read(List<String> attributes) {
        if (attributes != null && attributes.size() > 0) {
            this.name = attributes.get(0);
            this.hitPoints = Integer.parseInt(attributes.get(1));
            this.strength = Integer.parseInt(attributes.get(2));
        }

    }

    @Override
    public String toString() {
        return String.format("""
<<<<<<< HEAD
                Monster{name='%s', hitPoints=%d, strength=%d}""", getName(),getHitPoints(),getStrength());

    }
}
=======
                Monster:{name='%s', hitPoints=%d, strength=%d""", getName(),getHitPoints(),getStrength());

    }
}
>>>>>>> 62ea25f38c81d03321eb57b4c5df2422e1167861
