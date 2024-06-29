package lab8.ex1;

public class NumberDecorator extends StringDecorator {

    @Override
    char getTop() {
        return '1';
    }

    @Override
    char getLeft() {
        return '3';
    }

    @Override
    char getRight() {
        return ';';
    }

    @Override
    char getBottom() {
        return '0';
    }

}