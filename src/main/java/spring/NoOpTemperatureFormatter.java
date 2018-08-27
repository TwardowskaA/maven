package spring;

import org.springframework.stereotype.Component;

public class NoOpTemperatureFormatter implements TemperatureFormatter{


    public String format(int temperature) {
        return String.valueOf(temperature);
    }
}
