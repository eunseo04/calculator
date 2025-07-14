package org.example.Lv3;

import java.util.ArrayList;

import static org.example.Lv3.OperatorType.fromSymbol;

public class Calculator<T extends Number> {
    private T value1;
    private T value2;
    private char operator;
    private ArrayList<Double> resultArr = new ArrayList<>();
    private double result;
    private double number;

    public void setValue1(String value1) {
        this.value1 = (T) convert(value1);
    }
    public void setValue2(String value2) {
        this.value2 = (T) convert(value2);
    }
    public void setOperator(char operator) {
        this.operator = operator;
    }

    public Number convert(String s) {
        if (s.contains(".")) {
            return Double.parseDouble(s);
        } else {
            return Integer.parseInt(s);
        }
    }

    public void operation() {
        switch (fromSymbol(operator)) {
            case sum -> result = (value1.doubleValue() + value2.doubleValue());
            case sub -> result = (value1.doubleValue() - value2.doubleValue());
            case mul -> result = (value1.doubleValue() * value2.doubleValue());
            case div -> result = (value1.doubleValue() / value2.doubleValue());
        }
    }

    public void addArray() {
        resultArr.add(result);
    }

    public ArrayList<Double> getArray() {  //getter
        return resultArr;
    }

    public void setNum(Double number) {
        this.number = number;
    }

    public ArrayList<Double> removeResultArr() {
        if (resultArr.isEmpty()) {
            System.out.println("연산 결과가 없습니다");
            throw new  NullPointerException();
        }
        resultArr.removeIf(i -> i <= number);
        return resultArr;
    }
}
