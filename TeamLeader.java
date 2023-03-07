import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TeamLeader {
    private String firstName;
    private String middleName;
    private String lastName;
    private Address address;
    private List<Salesperson> salespersonList;

    public TeamLeader(String firstName, String middleName, String lastName, Address address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.salespersonList = new ArrayList<>();
    }

    public void addSalesperson(Salesperson salesperson) {
        this.salespersonList.add(salesperson);
    }

    public double getTotalPerformance() {
        double totalSalesAmount = 0;
        for (Salesperson sales