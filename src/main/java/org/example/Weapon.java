
package org.example;

public enum Weapon {
    SWORD(10, 1.5),
    BOW(8, 2.0),
    AXE(12, 1.2),
    SPEAR(9, 1.8);

    private final int damage;
    private final double attackSpeed;

    // Enum constructor
    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }


    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
