package Entity.Animal.Predator;

import Entity.Animal.Animal;
import Setting.SettingsAnimal;

public class Wolf extends Animal {
    public Wolf() {
        super.setSymbol(SettingsAnimal.SYMBOL_WOLF);
        super.setWeight(SettingsAnimal.WEIGHT_WOLF);
        super.setMaxSpeed(SettingsAnimal.MAX_SPEED_WOLF);
        super.setMaxSatiety(SettingsAnimal.MAX_SATIETY_WOLF);
        super.setActualSatiety(SettingsAnimal.ACTUAL_SATIETY_WOLF);
        super.setCountOnOneCell(SettingsAnimal.COUNT_WOLF_ON_ONE_CELL);
        super.setProbabilityEaten(SettingsAnimal.PROBABILITY_BEING_EATEN_WOLF);
    }
}
