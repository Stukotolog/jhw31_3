public class CreditPaymentService {
    public double calculate(int numberofmonths) {
        int loan = 1_000_000; //сумма кредита
        double percent_year = 9.99; //годовая ставка в процентах//
        double percent_month = percent_year / 12 / 100; //месячная процентная ставка
        double y = percent_month + 1;//значение для рассчета в формуле
        double x = Math.pow(y, numberofmonths);//значение для рассчета в формуле
        double ap = loan * (percent_month + (percent_month / (x - 1))); //аннуитетный платеж
        return ap;

    }
}
