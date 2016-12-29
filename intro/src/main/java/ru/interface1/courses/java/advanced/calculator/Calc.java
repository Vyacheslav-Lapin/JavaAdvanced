package ru.interface1.courses.java.advanced.calculator;

public class Calc {
    public static void main(String[] args) {
        System.out.println(calc(args));
    }

    public static double calc(String[] args) {

        BinaryOperation[] operations = new BinaryOperation[args.length / 2];
        int operationIndex = 0;

        for (int i = 0; i < args.length; i++) {
            double leftOperand = Double.parseDouble(args[i++]);
            BinaryOperation operation;
            switch (args[i++]) {
                case "+":
                    operation = new Sum();
                    break;
                case "-":
                    operation = new Delta();
                    break;
                case "x":
                    operation = new Multiply();
                    break;
                case "/":
                    operation = new Divide();
                    break;
                default:
                    throw new RuntimeException("Нет такой операции!");
            }
            operation.setLeft(leftOperand);
            // TODO: 29/12/2016 Разобраться с большим чем одна кол-вом операций
            operation.setRight(Double.parseDouble(args[i]));

            operations[operationIndex++] = operation;
        }

        for (int i = 0;;) {
            BinaryOperation operation = operations[i];
            // TODO: 29/12/2016 Разобраться с приоритетами
            double result = operation.calc();
            if (++i < operations.length)
                operations[i].setLeft(result);
            else
                return result;
        }
    }
}
