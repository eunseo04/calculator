package org.example.Lv3;

public enum OperatorType {
    sum("+"), sub("-"), mul("*"), div("/");

    private final String symbol;

    OperatorType(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public static OperatorType fromSymbol(char operator) {
        for (OperatorType operatorType : OperatorType.values()) { //values() 메소드는 enum 안에 존재하는 모든 값들은 반환한다.
            if (operatorType.getSymbol().charAt(0) == operator) {
                return operatorType;
            }
        }
        throw new ArithmeticException();
    }
}
