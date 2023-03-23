package changeDecimalToBinary;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int decimal = 111;
        Stack<Integer> binaries = new Stack<Integer>();
        while (decimal /2 !=0) {
            binaries.push(decimal % 2);
            decimal /= 2;
        }
        StringBuilder result = new StringBuilder();
        while (!binaries.isEmpty()){
            result.append(binaries.pop());
            System.out.println(" Ket qua nhi  phan la " + result);
        }
    }
}