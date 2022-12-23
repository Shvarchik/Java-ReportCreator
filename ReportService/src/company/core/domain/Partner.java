package company.core.domain;

public class Partner {

    private String partnerId;
    private String name;
    private String adress;
    private String bankDetails;
    private String phoneNumber;
    private String eMail;
    private static int counter;
    
    public Partner (String name, String adress, String bankDetails, String phoneNumber, String eMail){
        this.name = name;
        this.adress = adress;
        this.bankDetails = bankDetails;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
        this.partnerId = "comp" + ++counter;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
