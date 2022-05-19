public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        double ap12 = service.calculate(12);
        System.out.printf("ежемесячный платеж: %.0f рублей.", ap12);

        double ap24 = service.calculate(24);
        System.out.printf("ежемесячный платеж: %.0f рублей.", ap24);

        double ap36 = service.calculate(36);
        System.out.printf("ежемесячный платеж: %.0f рублей.", ap36);
    }
}
