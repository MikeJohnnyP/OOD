package lab8.ex1;

public abstract class StringDecorator {
    final void decorate(String text) {
        StringBuilder builder = new StringBuilder();
        String getCurrentString = text;
        builder.append(getBottom());
        for (int i = 0; i < getCurrentString.length(); i++) {
            if (getCurrentString.charAt(i) == ' ') {
                builder.append(getTop());
            } else {
                builder.append(getCurrentString.charAt(i));
            }
        }

        builder.append(getLeft());
        builder.append(getRight());
        System.out.println(builder.toString());
    }

    abstract char getTop();

    abstract char getLeft();

    abstract char getRight();

    abstract char getBottom();

}
