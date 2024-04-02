package lab4.ex3;

import java.util.LinkedList;

public class ClockHandle implements Subject, Runnable {
    private ModelTime time;
    private LinkedList<Window> windowList;
    private Thread thread;
    private boolean isRunning = false;

    public ClockHandle(int hour, int minute, int second, boolean is24HourFormat) {
        windowList = new LinkedList<>();
        time = new ModelTime(hour, minute, second, is24HourFormat);
    }

    public ClockHandle(boolean is24HourFormat) {
        windowList = new LinkedList<>();
        time = new ModelTime(is24HourFormat);
    }

    public ModelTime getTime() {
        return time;
    }

    public void setTime(ModelTime time) {
        this.time = time;
    }

    public LinkedList<Window> getWindowList() {
        return windowList;
    }

    public void setWindowList(LinkedList<Window> windowList) {
        this.windowList = windowList;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    @Override
    public void registerClock(Window window) {
        windowList.add(window);
    }

    @Override
    public void removeClock(Window window) {
        windowList.remove(window);
    }

    public synchronized void start() {
        thread = new Thread(this);
        isRunning = true;
        thread.start();

    }

    public synchronized void stop() {
        try {
            thread.join();
            isRunning = false;

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @Override
    public void run() {
        try {
            while (isRunning) {
                time.next();
                // System.out.println(time.getHour() + " " + time.getMinute() + " " +
                // time.getSecond());
                for (Window window : windowList) {
                    window.show(this);
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
