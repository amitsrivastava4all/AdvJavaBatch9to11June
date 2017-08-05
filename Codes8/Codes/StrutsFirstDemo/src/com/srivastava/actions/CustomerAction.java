package com.srivastava.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{
//    private String name;
//    private Integer age;
//    private String email;
//    private String telephone;
 Customer customer = new Customer();
    public String addCustomer() {
        return SUCCESS;
    }

	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}
     
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public Integer getAge() {
//        return age;
//    }
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//    public String getEmail() {
//        return email;
//    }
//    public void setEmail(String email) {
//        this.email = email;
//    }
//    public String getTelephone() {
//        return telephone;
//    }
//    public void setTelephone(String telephone) {
//        this.telephone = telephone;
//    }
}
