package com.example.MyShop.repository;

import com.example.MyShop.dto.Customer;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CustomerRepositoryImplTest {

    CustomerRepository customerRepository = new CustomerRepositoryImpl();//회원가입에 필요한 객체가 필요하기에 객체 생성
    AccountRepository accountRepository = new AccountRepositoryImpl();
    @Test
    void customerJoin(){
        Customer customer = new Customer(546545L,"941219518526","탄현", "5555","tjwodus!2");
        customerRepository.customerJoin(customer);//이후 실제 회원가입에 기재해야 할 정보를 매개변수에 삽입./

        Customer customer1=customer; //실제 저장이 되었는지 키 값을 주고 다른 그릇에 저장만 했을 뿐. 예상 값

        assertThat(customer).isEqualTo(customer1);  //assertThat을 사용하여 처음 소괄호에는 실제 집어넣은 값, 이후 isEqualTo에는 다른 그릇에 집어넣은 변수 입력
        System.out.println(customer1); //toString을 사용했다면 메모리단에 어떻게 저장되어 있는지 열람 가능.

    }

    @Test
    void selectCustomer(){
        Customer customer = new Customer(45564L, "서재연", "45645645", "탄현", "TJWODUS12");
        customerRepository.customerJoin(customer);
        Customer customer1 = customerRepository.selectCustomer(45564L);

        assertThat(customer1).isEqualTo(customer);


    }

    @Test
    void deleteCustomer() {
        Customer customer = new Customer(45564L, "서재연", "45645645", "탄현", "TJWODUS12");//given
        customerRepository.customerJoin(customer);
        Customer customer1 = customerRepository.deleteCustomer(45564L);//when

        assertThat(customer1).isNull();//then
    }

    @Test
    void updateCustomer() {
        Customer customer = new Customer(45564L, "서재연", "45645645", "탄현", "TJWODUS12");//given
        customerRepository.customerJoin(customer);
        customer.setName("ddd");
        Customer customer1 = customerRepository.updateCustomer(customer);

        assertThat(customer1).isEqualTo(customer);
        System.out.println("customer1 = " + customer1);

    }
}