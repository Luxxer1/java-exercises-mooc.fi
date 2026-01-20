
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public SimpleDate(SimpleDate object) {
        this(object.day, object.month, object.year);
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        advance(1);
    }

    public void advance(int howManyDays) {
        int daysPerMonth = 30;
        int monthsPerYear = 12;

        this.day += howManyDays;

        while (this.day > daysPerMonth) {
            this.day -= daysPerMonth;
            this.month += 1;
            if (this.month > monthsPerYear) {
                this.month -= monthsPerYear;
                this.year += 1;
            }
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this);
        newDate.advance(days);

        return newDate;
    }


}
