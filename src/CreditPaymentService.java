public class CreditPaymentService {
    public double calculate(int numberofmonths) {
        int sk = 1_000_000; //сумма кредита
        double epsp = 9.99; //годовая ставка в процентах//
        double mps = epsp / 12 / 100; //месячная процентная ставка
        double y = mps + 1;//значение для рассчета в формуле
        double x = Math.pow(y, numberofmonths);//значение для рассчета в формуле
        double ap = sk * (mps + (mps / (x - 1))); //аннуитетный платеж
        return ap;

    }
}
