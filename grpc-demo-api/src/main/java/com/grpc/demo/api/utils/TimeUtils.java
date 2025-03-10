package com.grpc.demo.api.utils;

import java.util.concurrent.TimeUnit;

public class TimeUtils {
    public static void sleepSeconds(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException ignored) {
        }
    }

    public static void sleepDays(int days) {
        try {
            TimeUnit.DAYS.sleep(days);
        } catch (InterruptedException ignored) {
        }
    }
}
