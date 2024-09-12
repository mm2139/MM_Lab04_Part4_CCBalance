public class CCBalance {
    public static void main(String[] args) {

        double creditCardBalance = 5000;

        for (int i=1; i<3; i++)
        {
            creditCardBalance *= 1.17;
            System.out.println("After " + i + " month(s), your credit card balance will have increased by 17% to " + creditCardBalance + " dollars.");
        }

    }
}