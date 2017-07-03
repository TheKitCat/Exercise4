/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.text.DecimalFormat;
import javax.ejb.Stateless;

/**
 * Stateless bean to calculate the total amount
 * @author katharina
 */
@Stateless
public class TaxCalc {
    
    
    /**
     * Tax calculation method
     * @param amount    float   The net amount
     * @param tax       float   The tax in percentage
     * @return Double   The total amount
     */
    public Double calcTax(Float amount, Float tax){
        double res =  amount * ((tax+100)/100);
        // round 2 digits
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        return Double.valueOf(twoDForm.format(res));
    }

}
