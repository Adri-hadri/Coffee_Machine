package machine;

import java.util.Scanner;

/**
 * Stage 3/6: Estimate the number of servings
 */

public class CoffeeMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        oneCoffee();
        estimate();
        result();
}

    public static void oneCoffee() {
        int oneWater = 200;
        int oneMilk = 50;
        int oneCoffe = 15;
        int cups = 1;
    }

    public static void estimate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        System.out.print("> ");
        int estimateWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        System.out.print("> ");
        int estimateMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        System.out.print("> ");
        int estimateCoffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        System.out.print("> ");
        int estimateCupsCoffee = scanner.nextInt();
        }

    public static void result(int estimateWater, int estimateMilk, int estimateCoffeeBeans, int estimateCupsCoffee) {

        if ((estimateWater >= 200) && (estimateMilk >= 50) && (estimateCoffeeBeans >= 15)) {
            int numW = estimateWater / 200;
            int numM = estimateMilk / 50;
            int numCB = estimateCoffeeBeans / 15;
            int finalMin = Math.min(numW, Math.min(numM, numCB);

            if (finalMin >=  ) {
                System.out.println("Yes, I can make " + finalNum + " that amount of coffee");
            } else {
                System.out.println("No, I can make only 0 cup(s) of coffee");
            }
        }

    }

}

