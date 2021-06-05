package objects;

public class Account {
    private String accountName;
    private String website;
    private String optionType;
    private String optionIndustry;
    private String phone;
    private String employees;
    private String annualRevenue;
    private String description;
    private String billingStreet;
    private String billingCity;
    private String billingStateProvince;
    private String billingZipPostalCode;
    private String billingCountry;

    public Account(String accountName, String website, String optionType, String optionIndustry, String phone, String employees, String annualRevenue, String description, String billingStreet, String billingCity, String billingStateProvince, String billingZipPostalCode, String billingCountry) {
        this.accountName = accountName;
        this.website = website;
        this.optionType = optionType;
        this.optionIndustry = optionIndustry;
        this.phone = phone;
        this.employees = employees;
        this.annualRevenue = annualRevenue;
        this.description = description;
        this.billingStreet = billingStreet;
        this.billingCity = billingCity;
        this.billingStateProvince = billingStateProvince;
        this.billingZipPostalCode = billingZipPostalCode;
        this.billingCountry = billingCountry;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getOptionType() {
        return optionType;
    }

    public void setOptionType(String optionType) {
        this.optionType = optionType;
    }

    public String getOptionIndustry() {
        return optionIndustry;
    }

    public void setOptionIndustry(String optionIndustry) {
        this.optionIndustry = optionIndustry;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingStateProvince() {
        return billingStateProvince;
    }

    public void setBillingStateProvince(String billingStateProvince) {
        this.billingStateProvince = billingStateProvince;
    }

    public String getBillingZipPostalCode() {
        return billingZipPostalCode;
    }

    public void setBillingZipPostalCode(String billingZipPostalCode) {
        this.billingZipPostalCode = billingZipPostalCode;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }
}
