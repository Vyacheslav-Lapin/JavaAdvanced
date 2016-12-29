package ru.interface1.courses.java.advanced.calculator;

public class Calc {
    public static void main(String[] args) {
        System.out.println(calc(args));
    }

    public static double calc(String[] args) {

        BinaryOperations operations = new BinaryOperations(args.length / 2);

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

            operations.add(operation);
        }

        Double result = null;
        while (operations.hasNext()) {
            BinaryOperation operation = operations.next();
            if (result != null)
                operation.setLeft(result);

            // TODO: 29/12/2016 Разобраться с приоритетами
            result = operation.calc();
        }
        return result;
    }
}
