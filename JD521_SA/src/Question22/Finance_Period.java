package Question22;

import javax.swing.JOptionPane;

public class Finance_Period extends Customer {

//if months<=3 no interest or else interest

@Override

    public void calculate_repayment() 
    {
    
        if(numberOfMonths <= 3)
        {
            monthlyRepaymentAmount = productPrice/numberOfMonths;
        }

        else if(numberOfMonths < 12)
        {
            double interest = (25.0/100.0) * productPrice;
            double amount =productPrice + interest;
            monthlyRepaymentAmount = amount/numberOfMonths;
        }
        else if(numberOfMonths > 12)
        {
            this.numberOfMonths = Integer.parseInt(JOptionPane.showInputDialog("Max number of months is 12" + "\n" + 
                                                                               "Please re-enter a number of months: "));
            double interest = (25.0/100.0) * productPrice;
            double amount =productPrice + interest;
            monthlyRepaymentAmount = amount/numberOfMonths;
        }
    }
}
