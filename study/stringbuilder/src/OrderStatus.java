public enum OrderStatus {
    PENDING_PAYMENT(0),
    PROCESSING(1),
    SHIPPED(2),
    DELIVERED(3);

    private final int value;


    OrderStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
