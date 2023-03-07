public class Address {
    private String unitNo;
    private String street;
    private String postcode;
    private String district;
    private String state;

    public Address(String unitNo, String street, String postcode, String district, String state) {
        this.unitNo = unitNo;
        this.street = street;
        this.postcode = postcode;
        this.district = district;
        this.state = state;
    }

    public String getUnitNo() {
        return unitNo;
    }

    public String getStreet() {
        return street;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getDistrict() {
        return district;
    }

    public String getState() {
        return state;
    }
}