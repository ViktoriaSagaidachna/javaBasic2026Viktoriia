public class App {

    public static void main(String[] args) {

        int days = 0;
        int productNumber = 1;
        double totalSales = 0.0;

        String productSmartphone = "smartphone";
        String productLaptop = "laptop";
        String currency = "EUR";

        days = 5;
        totalSales = 12152.41;

        double sales = totalSales / days;

        System.out.printf(
                "Product No %d: %s%n" +
                        "total sales for %d days is %s %.2f%n" +
                        "sales by day is %s %.2f%n",
                productNumber,
                productSmartphone,
                days,
                currency,
                totalSales,
                currency,
                sales
        );
        System.out.println("----------------------");
        days = 7;
        totalSales = 10486.85;
        productNumber++;
        sales = totalSales / days;
        System.out.printf(
                "Product No %d: %s%n" +
                        "total sales for %d days is %s %.2f%n" +
                        "sales by day is %s %.2f%n",
                productNumber,
                productLaptop,
                days,
                currency,
                totalSales,
                currency,
                sales
        );
    }
}