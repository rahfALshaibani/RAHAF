//Qr_13
public class CreditCard3 {
    private String number;
    private String customerName ;
    //يمثل رصيد البطاقة
    private static int balance;
    //الحد الائتماني
    private static int creditLimit;

    public CreditCard3(String number, String customerName, int balance, int creditLimit) {
        this.number = number;
        this.customerName = customerName;
        this.balance = balance;
        this.creditLimit = creditLimit;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public static void main(String[] args) {
        CreditCard3 []card3 = new CreditCard3[3];
        card3[0]=new CreditCard3("123,346,368","rahf",8764,900000);
        card3[1]=new CreditCard3("556,234,368","Ahlam",940000,900000);
        card3[2]=new CreditCard3("234,235,865","Ashgan",3456,900000);
        for (int i = 0; i < card3.length; i++) {
            if(balance > creditLimit){
                System.out.println("الرصيد تجاوز الحد الائتماني "+ card3);
                

            }
        }
    }
}
