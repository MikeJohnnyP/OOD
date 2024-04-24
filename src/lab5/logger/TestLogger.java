package lab5.logger;

public class TestLogger {
    public static void main(String[] args) {
        Logger y = new ConsoleLogger();
        y.log("Hom nay an gi?");
        y = new TimeStampingLogger(new UpperLogger(new FileLogger("kkk.txt")));
        y.log("Hom nay an ga chien nuoc mam!");
        y.log("Choi nhieu qua gio het hung roi!");
        y.log("An nhieu qua beo roi");

    }

}
