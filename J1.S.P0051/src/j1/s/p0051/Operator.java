package j1.s.p0051;

public enum Operator {
    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/"),
    EXPONENTIATION("^"),
    EQUALS("=");

    private String symbol;

    // constructor này chỉ dùng trong nội bộ Enum
    // Modifier của constructor enum luôn là private
    // Nếu không khai báo private, java cũng sẽ hiểu là private.
    Operator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
