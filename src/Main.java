public class Main {
    public static void main(String[] args) {
        double SALES_TAX = 0.05;
        double inputPrice = 25.00;
        double computedSalesTax = inputPrice * SALES_TAX;
        double totalPrice = inputPrice + computedSalesTax;

        System.out.println("The input price was " + inputPrice + " and had a sales tax of " + computedSalesTax +
                " for a total price of " + totalPrice);
    }
}