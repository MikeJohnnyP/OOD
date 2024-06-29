package lab8.ex1;

public class SymbolDecorator extends StringDecorator {

    @Override
    char getTop() {
        return '\n';
    }

    @Override
    char getLeft() {
        return '\t';
    }

    @Override
    char getRight() {
        return '$';
    }

    @Override
    char getBottom() {
        return '#';
    }

}
