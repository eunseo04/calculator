package org.example.Lv2;
import java.util.ArrayList;

public class Calculator {
    private ArrayList <Double> resultArr = new ArrayList<>();
    private int value1;
    private int value2;
    private char operator;
    private double result;

    public void calculate() throws Exception {
        switch (operator) {
            case '+':
                result = value1 + value2;
                break;
            case '-':
                result = value1 - value2;
                break;
            case '*':
                result = value1 * value2;
                break;
            case '/':
                result = value1 / value2;
                break;

            default:
                System.out.println("연산자가 잘못되었습니다!");
                throw new Exception();
        }
    }

    public ArrayList <Double> getArray(){  //getter
        return resultArr;
    }
    public void setValue(int value1, int value2, char operator){  //setter
        this.value1=value1;
        this.value2=value2;
        this.operator=operator;
    }

    public ArrayList <Double> remove(){
        resultArr.remove(0);
        return resultArr;
    }

    public void addArray(){
        resultArr.add(result);
    }

}
