package lab4.ex3;

public class Test {
    public static void main(String[] args) {
        ClockHandle clock = new ClockHandle(true);
        registerLabelClock(clock, 2);
        registerCircleClock(clock, 2);
        registerDuoClock(clock, 2);
        registerCityClock(clock, 2);
        clock.start();

        ClockHandle clock2 = new ClockHandle(13, 32, 5, false);
        registerCircleClock(clock2, 2);
        registerLabelClock(clock2, 3);
        clock2.start();

    }

    public static void registerCircleClock(ClockHandle handle, int clock) {
        for (int i = 0; i < clock; i++) {
            handle.registerClock(new Window(new CircleClock(), null));
        }
    }

    public static void registerLabelClock(ClockHandle handle, int clock) {
        for (int i = 0; i < clock; i++) {
            handle.registerClock(new Window(new LabelClock(), null));
        }

    }

    public static void registerCityClock(ClockHandle handle, int clock) {
        for (int i = 0; i < clock; i++) {
            handle.registerClock(new Window(new CityClock(), null));
        }

    }

    public static void registerDuoClock(ClockHandle handle, int clock) {
        for (int i = 0; i < clock; i++) {
            handle.registerClock(new Window(new DuoClock(new CircleClock(), new LabelClock()), null));
        }

    }
}
