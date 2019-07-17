/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.iqjb2.composite;

/**
 *
 * @author avincze
 */
public class Employee {
    
    
   
    private String firstName;
    private String lastName;
    private String loginName;
    private String title;
    private String salary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "firstName=" + firstName + ", lastName=" + lastName + ", loginName=" + loginName + ", title=" + title + ", salary=" + salary + '}';
    }
    
     public void accept(EmployeeVisitor visitor){
        visitor.visit(this);
    }
//    public String toXML(){
//        return "";
//    }
//    
//      public String toJSON(){
//        return "";
//    }
    
}
