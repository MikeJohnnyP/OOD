package lab4.ex3;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ModelTime {
    private int hour;
    private int minute;
    private int second;
    private boolean is24HourFormat;
    private ZoneId systemZone;
    private ZonedDateTime currentTime;

    public ModelTime(int hour, int minute, int second, boolean is24HourFormat) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.is24HourFormat = is24HourFormat;
        try {
            systemZone = ZoneId.systemDefault();
            currentTime = ZonedDateTime.now(systemZone);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public ModelTime(boolean is24HourFormat) {
        try {
            systemZone = ZoneId.systemDefault();
            currentTime = ZonedDateTime.now(systemZone);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.hour = currentTime.getHour();
        this.minute = currentTime.getMinute();
        this.second = currentTime.getSecond();
    }

    public void next() {
        nextSecond();
    }

    private void nextSecond() {
        if (second >= 0 && second < 59)
            second++;
        else {
            second = 0;
            nextMinute();
        }
    }

    private void nextMinute() {
        if (minute >= 0 && minute < 59)
            minute++;
        else {
            minute = 0;
            nextHour();
        }
    }

    public void setSystemTimeZone() {
        this.hour = currentTime.getHour();
        this.minute = currentTime.getMinute();
        this.second = currentTime.getSecond();
    }

    private void nextHour() {
        if (is24HourFormat) {
            if (hour >= 0 && hour < 23)
                hour++;
            else
                hour = 0;
        } else {
            if (hour >= 0 && hour < 11)
                hour++;
            else
                hour = 0;
        }
    }

    public boolean isIs24HourFormat() {
        return is24HourFormat;
    }

    public void setIs24HourFormat(boolean is24HourFormat) {
        this.is24HourFormat = is24HourFormat;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public boolean getIs24HourFormat() {
        return this.is24HourFormat;
    }

    public ZonedDateTime getZonedDateTime() {
        return this.currentTime;
    }

    public ZoneId getZone() {
        return this.systemZone;
    }

}
