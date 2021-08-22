package com.company;

import java.time.Duration;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        LocalTime localTimeStart = LocalTime.of(20, 00);
        LocalTime localTimeFinish = LocalTime.of(22,00);

        Duration duration = Duration.between(localTimeStart, localTimeFinish);

        System.out.println(duration.toMinutes() + " minutes");
        System.out.println(duration.toSeconds() + " seconds");
    }
}
