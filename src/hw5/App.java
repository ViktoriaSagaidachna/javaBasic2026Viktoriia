package hw5;

public class App {
    static void main() {
        /*
    Доходи оподатковуются за прогресивною шкалою оподаткування:

            - від 0 до 10_000, включно, за ставкою 2,5%.
            - від 10_000, виключно, до 25_000, включно, за ставкою 4,3%.
            - більше 25_000, за ставкою 6,7%.
    Необхідно розрахувати суму податку від певної суми доходу. Сума податку дорівнює відсотку від суми доходу.
         */
        double lowTaxRate = 2.5;
        double mediumTaxRate = 4.3;
        double highTaxRate = 6.7;

        int income = -22;

        double calculateLowTax = income - (income * lowTaxRate / 100);
        double calculateMediumTax = income - (income * mediumTaxRate / 100);
        double calculateHighTax = income - (income * highTaxRate / 100);

        if (income >= 0 && income <= 10_000 ){

            double totalLowTax = income - calculateLowTax;

            System.out.printf("The amount after taxes is: %.2f USD%n", calculateLowTax);
            System.out.printf("Total taxes paid: %.2f USD%n", totalLowTax);

        } else if(income > 10_000 && income <= 25_000) {

            double totalMedTax = income - calculateMediumTax;

            System.out.printf("The amount after taxes is: %.2f USD%n", calculateMediumTax);
            System.out.printf("Total taxes paid: %.2f USD%n", totalMedTax);

        } else if (income > 25_000) {

            double totalHighTax = income - calculateHighTax;

            System.out.printf("The amount after taxes is: %.2f USD%n", calculateHighTax);
            System.out.printf("Total taxes paid: %.2f USD%n", totalHighTax);

        } else {
            System.out.println("Incorrect income");
        }
    }
}
