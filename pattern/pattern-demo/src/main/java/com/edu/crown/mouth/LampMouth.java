package com.edu.crown.mouth;

/**
 * Created by Crown on 2018/7/15.
 */
public class LampMouth {
    private Lamp lamp;

    public Lamp getLamp() {
        return lamp;
    }

    public void setLamp(Lamp lamp) {
        this.lamp = lamp;
    }

    public void lantern(){
        lamp.bright();
    }
}
