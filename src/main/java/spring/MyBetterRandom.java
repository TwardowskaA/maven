package spring;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MyBetterRandom {
    public int random( int min, int max){
        Random random = new Random();
        return random.nextInt(-min + max + 1) + min;
    }
}
