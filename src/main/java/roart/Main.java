package roart;

public class Main {

    public static void main(String[] argv) {
        if (argv[0] == null || argv.length == 0) {
            System.out.println("No number");
            return;
        }
        try {
            Integer number = Integer.valueOf(argv[0]);
            if (number < 0) {
                System.out.println("No natural number");
                return;
            }
            System.out.println("" + findMultiplier(number));
        } catch (NumberFormatException e) {
            System.out.println("No integer given");
        }
    }
    
    static int findMultiplier (int allNumbersLessThan) {
        int[] numbers = { 3, 5 };        
        int resultNumber = 0;
        for (Integer number : numbers) {
            int mult = (allNumbersLessThan - 1) / number;
            resultNumber += number * mult * (mult + 1) / 2;
        }
        int fifteens = allNumbersLessThan / 15;
        resultNumber -= 15 * fifteens * (fifteens + 1) / 2;
        return resultNumber;
    }

}
