/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question22;

import javax.swing.JOptionPane;

/**
 *
 * @author Devon
 */
public class Customer {
    
    //variables for storing customer data
    String customerName;
    String contactNumber;
    double productPrice;
    int numberOfMonths;
    int maxMonths;
    double monthlyRepaymentAmount;

    //getter and setter

    public String getCustomerName() 
    {
        return customerName;
    }

    public void setCustomerName()  
    {
        this.customerName = JOptionPane.showInputDialog(null,"Please enter customer name: ", "Customer Name", JOptionPane.QUESTION_MESSAGE);
    }

    public String getContactNumber() 
    {
        return contactNumber;
    }

    public void setContactNumber()
    {
        this.contactNumber = JOptionPane.showInputDialog(null, "Please enter contact number: ", "Contact Number", JOptionPane.QUESTION_MESSAGE);
    }

    public double getProductPrice() 
    {
        return productPrice;
    }

    public void setProductPrice() 
    {
        this.productPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter product price: ", "Product price", JOptionPane.QUESTION_MESSAGE));
    }

    public double getNumberOfMonths() 
    {
        return numberOfMonths;
    }

    public void setNumberOfMonths() 
    {
        this.numberOfMonths = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter number of months: ", "Number of Months", JOptionPane.QUESTION_MESSAGE));
    }

    public void calculate_repayment()
    {
        System.out.print("Hello");
        monthlyRepaymentAmount = productPrice / numberOfMonths;
    }
}
