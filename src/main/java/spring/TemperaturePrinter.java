package spring;

import org.springframework.stereotype.Component;

public class TemperaturePrinter {
    private TemperatureProvider temperatureProvider;
    private TemperatureFormatter formatter;


    public TemperaturePrinter(TemperatureProvider temperatureProvider, TemperatureFormatter formatter) {
        this.temperatureProvider = temperatureProvider;
        this.formatter = formatter;
    }

    public void printTemperature(TemperatureProvider provider){
        int temperature = temperatureProvider.getTemperature();
        String formattedTemp = formatter.format(temperature);
        System.out.println(formattedTemp);
    }

}
