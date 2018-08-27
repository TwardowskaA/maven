package spring;

import java.util.Random;

public class RandomTemperatureProvider implements TemperatureProvider {


    @Override
    public int getTemperature() {

        return random(-25, 35);
    }

    public int random(int min, int max) {
        Random random = new Random();

        return random.nextInt(-min + max + 1) + min;

    }
}
