package kbg.bean.domain.human;

import kbg.bean.domain.weapon.Weapon;

public class Human {
    private final Weapon weapon;
    private final String name;

    public Human(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public void attack(Human other) {

        System.out.println(name + "이 " + other.name + "을 공격했다!");
        weapon.attack();
    }
}
