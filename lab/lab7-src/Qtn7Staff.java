public class Qtn7Staff {
    private String name = "";
    private int payRate = 0;
    private int payFrequency = 1;
    private int countMC = 0;
    private int countLate = 0;
    private boolean isFulltime = false;

    private static final int DAYS_IN_A_MONTH = 30;
    private static final int PAY_FULLTIME = 1000;
    private static final int PAY_PARTTIME = 80;
    private static final int BONUS_PUNCTUAL = 50;
    private static final int BONUS_MC = 100;

    public Qtn7Staff(String name, boolean isFulltime) {
        this.name = name;
        this.isFulltime = isFulltime;
        if(isFulltime) {
            payRate = PAY_FULLTIME;
            payFrequency = DAYS_IN_A_MONTH;
        } else {
            payRate = PAY_PARTTIME;
            payFrequency = 1;
        }
    }

    public String getName() {
        return name;
    }

    public boolean setCountMC(int amount) {
        if(amount >= 0) {
            this.countMC = amount;
            return true;
        }
        return false;
    }

    public boolean setCountLate(int amount) {
        if(amount >= 0) {
            this.countLate = amount;
            return true;
        }
        return false;
    }

    public boolean isFulltime() {
        return isFulltime;
    }

    public int payout() {
        return payRate * (payFrequency / DAYS_IN_A_MONTH) + (countMC > 0 ? BONUS_MC : 0) + (countLate > 0 ? BONUS_PUNCTUAL : 0);
    }

    public String toString() {
        return String.format("Name: %s%nType: %s Staff%nLate: %d%nMC: %d%nCurrent Payout: %d%n", name, (isFulltime ? "Full-time" : "Part-time"), countLate, countMC, payout());
    }
}
