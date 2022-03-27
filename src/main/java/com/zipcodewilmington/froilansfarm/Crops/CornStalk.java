package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class CornStalk extends Crop{
    boolean isFertilized = false;
    boolean isHarvested = false;

    public void yield() {
        EarCorn corn = new EarCorn();
        if (hasBeenHarvested() && hasBeenFertilized()) {
            corn.harvested();
        }
    }


    public boolean hasBeenFertilized() {
        return isFertilized;
    }


    public boolean hasBeenHarvested() {
        return isHarvested;
    }
}
