package dev.lpa;

import java.util.List;

public class Player implements ISaveable{
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.weapon = "Sword";
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        return List.of(name, String.valueOf(hitPoints), String.valueOf(strength), weapon);
    }

    @Override
    public void read(List<String> attributes) {
        if(attributes != null && attributes.size() > 0) {
            this.name = attributes.get(0);
            this.hitPoints = Integer.parseInt(attributes.get(1));
            this.strength = Integer.parseInt(attributes.get(2));
            this.weapon = attributes.get(3);
        }

    }

    @Override
    public String toString() {
        return String.format("""
                Player{name='%s', hitPoints=%d, strength=%d, weapon='%s'}""", getName(),getHitPoints(),getStrength(),getWeapon());
    }
}
