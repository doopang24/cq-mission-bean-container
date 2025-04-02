package kbg.bean.config;

import kbg.bean.domain.human.Human;
import kbg.bean.domain.weapon.Bow;
import kbg.bean.domain.weapon.Sword;
import kbg.bean.domain.weapon.Weapon;

public class DIHandler {

    private static final DIHandler instance = new DIHandler();

    private DIHandler() {

    }

    public static DIHandler getInstance() {
        return instance;
    }

    public Human swordHuman() {
        return new Human("검사", sword());
    }

    public Human bowHuman() {
        return new Human("궁수", bow());
    }

    public Weapon sword() {
        return new Sword();
    }

    public Weapon bow() {
        return new Bow();
    }
}
