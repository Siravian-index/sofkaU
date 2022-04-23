package account.types;

public class Id {
    private final String id;

    public Id() {
        this.id = generateCharacters() + generateNumber();
    }

    private String generateNumber() {
        final int limit = 1000000000;
        return String.valueOf(generateNumber(limit));
    }

    private String generateCharacters() {
        final int NUMBER_OF_CHARS = 3;
        String abc = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            int charIndex = generateNumber(abc.length());
            stringBuilder.append(abc.charAt(charIndex));
        }
        return stringBuilder.toString();
    }

    private int generateNumber(int threshold) {
        return (int) (Math.random() * threshold);
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Id{" + "id='" + id + '\'' + '}';
    }
}
