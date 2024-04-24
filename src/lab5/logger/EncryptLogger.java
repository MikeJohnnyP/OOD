package lab5.logger;

public class EncryptLogger extends LoggerDecorator {

    public EncryptLogger(Logger logger) {
        super(logger);
    }

    private String encrypt(String message) {
        int shift = 3;
        StringBuilder encryptedMessage = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    char encryptedChar = (char) ((ch - 'A' + shift) % 26 + 'A');
                    encryptedMessage.append(encryptedChar);
                } else {
                    char encryptedChar = (char) ((ch - 'a' + shift) % 26 + 'a');
                    encryptedMessage.append(encryptedChar);
                }
            } else {
                encryptedMessage.append(ch);
            }
        }

        return encryptedMessage.toString();
    }

    @Override
    public void log(String message) {
        logger.log(encrypt(message));
    }

}
