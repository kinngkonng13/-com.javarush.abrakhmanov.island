package Entity.Animal.Predator;

import Entity.Animal.Animal;
import Setting.SettingsAnimal;

public class Bear extends Animal {
    public Bear() {
        super.setSymbol(SettingsAnimal.SYMBOL_BEAR);
        super.setWeight(SettingsAnimal.WEIGHT_BEAR);
        super.setMaxSpeed(SettingsAnimal.MAX_SPEED_BEAR);
        super.setMaxSatiety(SettingsAnimal.MAX_SATIETY_BEAR);
        super.setActualSatiety(SettingsAnimal.ACTUAL_SATIETY_BEAR);
        super.setCountOnOneCell(SettingsAnimal.COUNT_BEAR_ON_ONE_CELL);
        super.setProbabilityEaten(SettingsAnimal.PROBABILITY_BEING_EATEN_BEAR);
    }
}
