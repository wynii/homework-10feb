public class Main {
public static void main(String[] args) {
    // Create addresses
    Address address1 = new Address("1A", "Main Street", "12345", "District 1", "State A");
    Address address2 = new Address("2B", "Second Street", "67890", "District 2", "State B");

    // Create salespersons
    Salesperson salesperson1 = new Salesperson("John", "Doe", address1);
    Salesperson salesperson2 = new Salesperson("Jane", "Doe", address2);

    // Add sales to salespersons
    Sales sales1 = new Sales(1000, 1, 1, 2023);
    Sales sales2 = new Sales(2000, 1, 2, 2023);
    Sales sales3 = new Sales(1500, 1, 3, 2023);
    salesperson1.addSales(sales1);
    salesperson1.addSales(sales2);
    salesperson2.addSales(sales3);

    // Create team leader
    TeamLeader teamLeader = new TeamLeader("Bob", "Smith", address1);

    // Add salespersons to team leader
    teamLeader.addSalesperson(salesperson1);
    teamLeader.addSalesperson(salesperson2);

    // Get total performance of salesperson
    double salespersonPerformance = salesperson1.getPerformance();
    System.out.println("Salesperson performance: " + salespersonPerformance);

    // Get total performance of team leader
    double teamLeaderPerformance = teamLeader.getTotalPerformance();
    System.out.println("Team leader performance: " + teamLeaderPerformance);

    // Get highest performing salesperson of team leader
    Salesperson highestPerformingSalesperson = teamLeader.getHighestPerformingSalesperson();
    System.out.println("Highest performing salesperson: " + highestPerformingSalesperson.getFirstName() + " " + highestPerformingSalesperson.getLastName());
}
}