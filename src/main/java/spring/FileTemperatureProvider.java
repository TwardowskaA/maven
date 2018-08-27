package spring;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileTemperatureProvider implements TemperatureProvider {

    @Override
    public int getTemperature() {
        try {
            File tempFile = new File("temp.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(tempFile));
            return Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();

            return -255;
        }
    }


}
