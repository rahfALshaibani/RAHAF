//Qr_11
    public class CreditCard1 {

    private String number;
    private String customerName ;
    private int balance;
    //الحد الائتماني للبطاقة
    private int creditLimit;

    public CreditCard1(String number, String customerName, int balance, int creditLimit) {
        this.number = number;
        this.customerName = customerName;
        this.balance = balance;
        this.creditLimit = creditLimit;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return customerName ;
    }

    public int getBalance() {
        return balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // إضافة طريقة جديدة لتحديث حد الائتمان
    public void updateCreditLimit(int newCreditLimit) {
        //الحد الائتماني يجب ان يكون موجب
        if (newCreditLimit > 0) {
            this.creditLimit = newCreditLimit;
        }
    }
    public static void main(String[] args) {
        CreditCard1 card = new CreditCard1("111,222,444","Rahf",
                67654,70000);
        card .updateCreditLimit(80000);
        System.out.println(card.getCreditLimit());//80000
    }
}

