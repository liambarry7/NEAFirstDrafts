
package objects;


public class newAccount {
    
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNo;
    private String addressOne;
    private String addressTwo;
    private String city;
    private String postCode;

    public newAccount(String firstName, String lastName, String email, String password, String phoneNo, String addressOne, String addressTwo, String city, String postCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNo = phoneNo;
        this.addressOne = addressOne;
        this.addressTwo = addressTwo;
        this.city = city;
        this.postCode = postCode;
    }    
    
    public String toString() {
        return firstName + " " + lastName + " " + email + " " + password + " " + phoneNo + " " + addressOne + " " + addressTwo + " " + city + " " + postCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getAddressOne() {
        return addressOne;
    }

    public String getAddressTwo() {
        return addressTwo;
    }

    public String getCity() {
        return city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setAddressOne(String addressOne) {
        this.addressOne = addressOne;
    }

    public void setAddressTwo(String addressTwo) {
        this.addressTwo = addressTwo;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    
    
}
