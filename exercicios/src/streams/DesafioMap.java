package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        /*
         * 1. Número para string binária... 6 => "110"
         * 2. Inverter a string... "110" => "011"
         * 3. Converter de volta para inteiro => "011" => 3
         */

        nums.stream()
            .map(Integer::toBinaryString)
            .map(DesafioMap::revertString)
            .map(DesafioMap::binaryToInteger)
            .forEach(DesafioMap::imprimir);
    }

    private static String revertString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    private static Integer binaryToInteger(String binary) {
        return Integer.parseInt(binary, 2);
    }

    private static void imprimir(Object item) {
        System.out.print(item + " ");
    }
}
