package b5;

public class RoomC extends Room {
    public RoomC() {
        super("C", 300);
    }

    @Override
    public String toString() {
        return "RoomC{" +
                "category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
