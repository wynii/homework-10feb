import java.util.ArrayList;
import java.util.List;

public class Salesperson {
    private String firstName;
    private String middleName;
    private String lastName;
    private Address address;
    private List<Sales> salesList;

    public Salesperson(String firstName, String middleName, String lastName, Address address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.salesList = new ArrayList<>();
    }

    public void addSales(Sales sales) {
        this.salesList.add(sales);
    }

    public double getPerformance() {
        double totalSalesAmount = 0;
        for (Sales sales : salesList) {
            totalSalesAmount += sales.getSalesAmount();
        }
        return totalSalesAmount;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public List<Sales> getSalesList() {
        return salesList;
    }
}