/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

/**
 *
 * @author Marvian
 */
public class Salary extends Abstraction
{
private double salary; //Annual salary
public Salary(String name, String address, int number, double
salary)
{
super(name, address, number);
setSalary(salary);
}
public void mailCheck()
{
System.out.println("Within mailCheck of Salary class ");
System.out.println("Mailing check to " + getName()
+ " with salary " + salary);
}
public double getSalary()
{
return salary;
}
public void setSalary(double newSalary)
{
if(newSalary >= 0.0)
{
salary = newSalary;
}
}
public double computePay()
{
System.out.println("Computing salary pay for " + getName());
return salary/52;
}
public static void main(String [] args)
{
Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
Abstraction e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
System.out.println("Call mailCheck using Salary reference --");
s.mailCheck();
System.out.println("\n Call mailCheck using Employee reference--");
e.mailCheck();
}
}

