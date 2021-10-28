package objects;


public class payment {
    private int paymentID;
    private int accountID;
    private String cardHolderName;
    private String cardNumber;
    private String expirationMonth;
    private int expirationYear;
    private int securityNumber; //hash itttttt

    public payment(int paymentID, int accountID, String cardHolderName, String cardNumber, String expirationMonth, int expirationYear, int securityNumber) {
        this.paymentID = paymentID;
        this.accountID = accountID;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.securityNumber = securityNumber;
    }

    
    public String toString() {
        return paymentID + " " + accountID + " " + cardHolderName + " " + cardNumber + " " + expirationMonth + " " + expirationYear + " " + securityNumber;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public int getAccountID() {
        return accountID;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpirationMonth() {
        return expirationMonth;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setExpirationMonth(String expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }

    public void setSecurityNumber(int securityNumber) {
        this.securityNumber = securityNumber;
    }
    
    
    
}
