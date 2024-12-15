package Entity.Animal.Herbivore;

import Entity.Animal.Animal;
import Setting.SettingsAnimal;

public class Rabbit extends Animal {

    public Rabbit() {
        super.setSymbol(SettingsAnimal.SYMBOL_RABBIT);
        super.setWeight(SettingsAnimal.WEIGHT_RABBIT);
        super.setMaxSpeed(SettingsAnimal.MAX_SPEED_RABBIT);
        super.setMaxSatiety(SettingsAnimal.MAX_SATIETY_RABBIT);
        super.setCountOnOneCell(SettingsAnimal.COUNT_RABBIT_ON_ONE_CELL);
        super.setActualSatiety(SettingsAnimal.ACTUAL_SATIETY_RABBIT);
    }
}
