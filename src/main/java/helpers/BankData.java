package helpers;

import java.util.Objects;

public class BankData {

    public String bankName;
    public String bankDepositRate;
    public String bankDepositPeriod;
    public Double bankDepositRateDouble;

    public BankData(String bankName, String bankDepositRate, String bankDepositPeriod, Double bankDepositRateDouble) {
        this.bankName = bankName;
        this.bankDepositRate = bankDepositRate;
        this.bankDepositPeriod = bankDepositPeriod;
        this.bankDepositRateDouble = bankDepositRateDouble;
    }

    @Override
    public String toString() {
        return "Название банка = " + bankName + "\n"+
                "Ставка = " + bankDepositRateDouble + "%" +"\n"+
                "Срок = " + bankDepositPeriod + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankData bankData = (BankData) o;
        return Objects.equals(bankName, bankData.bankName) && Objects.equals(bankDepositRate, bankData.bankDepositRate) && Objects.equals(bankDepositPeriod, bankData.bankDepositPeriod) && Objects.equals(bankDepositRateDouble, bankData.bankDepositRateDouble);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankName, bankDepositRate, bankDepositPeriod, bankDepositRateDouble);
    }
}
