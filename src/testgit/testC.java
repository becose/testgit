/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgit;

/**
 *
 * @author tommybennett
 */
public class testC {
    String myname = "Tommy";
    int myage = 47;
    double mysalary = 75000.00;
    
    public String getName(){
        return myname;
    }
    public int getAge(){
        return myage;
    }
    public double getSalary(){
        return mysalary;
    }
    public String getInfo(){
        return "My information: " + myname + " - Age: " + myage + " - Salary: " + mysalary;
    }
}
