public class NestedIfStatement {
    public static void main(String[] args) {

        boolean isNewCustomer = true;
        boolean newCustomerUnder18 = false;
        double firstOffer = 0.5;
        double contractPrice = 39.99;

        if (isNewCustomer) {
            System.out.println("You are a new customer!");
            System.out.println("Please register to enjoy our offers.");

            if (newCustomerUnder18) {
                System.out.println("Sorry, access denied because you are under 18!");
            } else {
                double welcomePrice = contractPrice * firstOffer;
                System.out.printf("You got our welcome offer: 50%% off! Final price: %.2f $\n", welcomePrice);
            }
        } else {
            System.out.println("No need to register — you are a regular customer.");
        }
    }
}
