public class Sales {
    private double salesAmount;
    private int day;
    private int month;
    private int year;

    public Sales(double salesAmount, int day, int month, int year) {
        this.salesAmount = salesAmount;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}