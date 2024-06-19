package helpers;

import java.util.Objects;

public class BankData {
    /**
     *Поле с названием банка
     */
    public String bankName;
    /**
     *Поле ставки вклада
     */
    public String bankDepositRate;
    /**
     *Поле срока  вклада
     */
    public String bankDepositPeriod;
    /**
     *Поле ставки вклада в формате Double
     */
    public Double bankDepositRateDouble;
    /**
     *Констркутор со всеми полями
     */
    public BankData(String bankName, String bankDepositRate, String bankDepositPeriod, Double bankDepositRateDouble) {
        this.bankName = bankName;
        this.bankDepositRate = bankDepositRate;
        this.bankDepositPeriod = bankDepositPeriod;
        this.bankDepositRateDouble = bankDepositRateDouble;
    }
    /**
     *toString с полями типа String
     */
    @Override
    public String toString() {
        return "Название банка = " + bankName + "\n"+
                "Ставка = " + bankDepositRateDouble + "%" +"\n"+
                "Срок = " + bankDepositPeriod + "\n";
    }
    /**
     *equals со всеми полями
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankData bankData = (BankData) o;
        return Objects.equals(bankName, bankData.bankName) && Objects.equals(bankDepositRate, bankData.bankDepositRate) && Objects.equals(bankDepositPeriod, bankData.bankDepositPeriod) && Objects.equals(bankDepositRateDouble, bankData.bankDepositRateDouble);
    }
    /**
     *hashCode со всеми полями
     */
    @Override
    public int hashCode() {
        return Objects.hash(bankName, bankDepositRate, bankDepositPeriod, bankDepositRateDouble);
    }
}
