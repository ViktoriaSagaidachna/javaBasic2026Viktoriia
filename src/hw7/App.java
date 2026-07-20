package hw7;

public class App {
    static void main() {
        int [] values =  {34, -10, 56, -22, 78, 5, 7, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8};
        int negativeNumbers = 0;
        int evenNumb = 0;
        int oddNumb = 0;
        int minNum = values[0];
        int minNumbIndex = -1;
        int maxNum = values[0];
        int maxNumIndex = -1;
        double averNum = 0;
        int count = 0;
        boolean firstNegativeNumber = false;

        for ( int i = 0; i < values.length; i++){
            if (values[i] < 0){
                negativeNumbers += values[i];

            }
            if (values[i] % 2 == 0) {
                evenNumb++;
            }
            if(values[i] % 2 != 0 ){
                oddNumb++;
            }
            if (values[i] < minNum){
                minNum = values[i];
                minNumbIndex = i;
            }
            if (values[i] > maxNum){
                maxNum = values[i];
                maxNumIndex = i;

            }
            if (firstNegativeNumber){
                averNum += values[i];
                count++;
            }
            if (values[i] < 0 && !firstNegativeNumber){
                firstNegativeNumber = true;
            }
        }
        double average = averNum / count;
        System.out.println("Sum of negative numbers: " + negativeNumbers);
        System.out.println("Number of even numbers:" + evenNumb);
        System.out.println("Number of odd numbers:" + oddNumb);
        System.out.println("Minimum element:" + minNum + " (at index " + minNumbIndex + ")");
        System.out.println("Maximum element:" + maxNum + " (at index " + maxNumIndex + ")");
        System.out.printf("Average of the numbers after the first negative number: %.2f%n", average);
    }



}
