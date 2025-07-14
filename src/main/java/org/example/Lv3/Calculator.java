package org.example.Lv3;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.example.Lv3.OperatorType.fromSymbol;

public class Calculator<T extends Number> {
    private T value1;
    private T value2;
    private char operator;
    private ArrayList<BigDecimal> resultArr = new ArrayList<>();
    private T result;
    private double number;
    private final Class<T> clazz;

    public Calculator(Class<T> clazz) {
        this.clazz = clazz;
    }
    public void setValue1(String value1) {
        this.value1 = convert(value1);
    }
    public void setValue2(String value2) {
        this.value2 = convert(value2);
    }
    public void setOperator(char operator) {
        this.operator = operator;
    }

    public T convert(String s) {
        if (clazz == Integer.class) {
            return clazz.cast(Integer.parseInt(s));
        } else if (clazz == Double.class) {
            return clazz.cast(Double.parseDouble(s));
        } else if (clazz == Float.class) {
            return clazz.cast(Float.parseFloat(s));
        } else if (clazz == Long.class) {
            return clazz.cast(Long.parseLong(s));
        }
        throw new IllegalArgumentException();
    }

    public void operation() {
        switch (fromSymbol(operator)) {
            case sum -> {
                if (clazz == Integer.class) {
                    result = clazz.cast(value1.intValue() + value2.intValue());
                } else if (clazz == Double.class) {
                    result = clazz.cast(value1.doubleValue() + value2.doubleValue());
                } else if (clazz == Float.class) {
                    result = clazz.cast(value1.floatValue() + value2.floatValue());
                } else if (clazz == Long.class) {
                    result = clazz.cast(value1.longValue() + value2.longValue());
                }
            }
            case sub -> result = clazz.cast(value1.doubleValue() - value2.doubleValue());
            case mul -> result = clazz.cast(value1.doubleValue() * value2.doubleValue());
            case div -> result = clazz.cast(value1.doubleValue() / value2.doubleValue());
        }
    }

    public void addArray() {
        if (clazz == Integer.class) {
            resultArr.add(BigDecimal.valueOf(result.intValue()));
        } else if (clazz == Double.class) {
            resultArr.add(BigDecimal.valueOf(result.doubleValue()));
        } else if (clazz == Float.class) {
            resultArr.add(BigDecimal.valueOf(result.floatValue()));
        } else if (clazz == Long.class) {
            resultArr.add(BigDecimal.valueOf(result.longValue()));
        }
    }

    public ArrayList<BigDecimal> getArray() {  //getter
        return resultArr;
    }

    public void setNum(Double number) {
        this.number = number;
    }

    public ArrayList<BigDecimal> removeResultArr() {
        if (resultArr.isEmpty()) {
            System.out.println("연산 결과가 없습니다");
            throw new  NullPointerException();
        }
        resultArr.removeIf(i -> i.compareTo(BigDecimal.valueOf(number)) <= 0);
        return resultArr;
    }
}
