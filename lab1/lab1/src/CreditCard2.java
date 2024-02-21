//Qr_12
public class CreditCard2 {
    private String number;
    private String customerName ;
    //يمثل رصيد البطاقة
    private int balance;


    public CreditCard2(String number, String customerName, int balance) {
        this.number = number;
        this.customerName = customerName;
        this.balance = balance;
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
 //   amount المبلغ
    public void processPayment(int amount) {
        if (amount < 0) {
            System.out.println("The amount is negative");
        }
        else {
            balance-=amount;

        }
    }

    public static void main(String[] args) {

      CreditCard2 card2= new CreditCard2("222,224.556","Amal",900000);
      card2.processPayment(9876);
        System.out.println(card2.getBalance());//890124

    }

}
