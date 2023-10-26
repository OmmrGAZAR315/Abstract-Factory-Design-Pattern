package Abstract_Factory;

public class Factory {

    public Creator createAbstractFactory(String type) {
        return switch (type) {
            case "Modern" -> new Modern();
            case "Victorian" -> new Victorian();
            default -> null;
        };
    }
}
