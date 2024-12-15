package Entity.Animal.Herbivore;

import Entity.Animal.Animal;
import Setting.SettingsAnimal;

public class Horse extends Animal {

    public Horse() {
        super.setSymbol(SettingsAnimal.SYMBOL_HORSE);
        super.setWeight(SettingsAnimal.WEIGHT_HORSE);
        super.setMaxSpeed(SettingsAnimal.MAX_SPEED_HORSE);
        super.setMaxSatiety(SettingsAnimal.MAX_SATIETY_HORSE);
        super.setCountOnOneCell(SettingsAnimal.COUNT_HORSE_ON_ONE_CELL);
        super.setActualSatiety(SettingsAnimal.ACTUAL_SATIETY_HORSE);
    }
}
