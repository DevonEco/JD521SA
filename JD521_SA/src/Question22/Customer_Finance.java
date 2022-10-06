
package Question22;
import javax.swing.JOptionPane;

/**
 *
 * @author Devon
 */
public class Customer_Finance {
    
    public static void main(String[] args) {
        
        //two objects . first with interest and second with no interest
        Finance_Period a = new Finance_Period();
        
        a.setCustomerName();
        a.setContactNumber();
        a.setProductPrice();
        a.setNumberOfMonths();
        a.calculate_repayment();
        display_info(a);

        Finance_Period b = new Finance_Period();

        b.setCustomerName();
        b.setContactNumber();
        b.setProductPrice();
        b.setNumberOfMonths();
        b.calculate_repayment();
        display_info(b);
}

//displaying message box

    public static void display_info(Customer c)
            {
                String info=String.format(
                  "Customer name: "       +    c.customerName    + "\n" 
                + "Contact Number: "    +    c.contactNumber   + "\n"
                + "Product price: R"     +    c.productPrice    + "\n"
                + "Repayment months: "  +    c.numberOfMonths  + "\n"
                + "Monthly repayment: R" +    c.monthlyRepaymentAmount + "\n"
                + "Total due: R "         +    c.monthlyRepaymentAmount * c.numberOfMonths);
                
                JOptionPane.showMessageDialog(null, info);
            }
}

