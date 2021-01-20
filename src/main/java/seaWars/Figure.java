package seaWars;

public enum Figure {
    BOAT("⛵"),
    FIRE("\uD83D\uDD25"),
    MISS("❌"),
    HALO("\uD83D\uDD35"),
    EMPTY("_");

    private String symbol;

    Figure(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
