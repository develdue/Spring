package com.example.MyShop.joinTest;

import com.example.MyShop.dto.Bank;
import com.example.MyShop.dto.Customer;
import com.example.MyShop.repository.CustomerRepository;
import com.example.MyShop.repository.CustomerRepositoryImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;


public class JoinTest {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();//회원가입에 필요한 객체가 필요하기에 객체 생성

        @Test
        void customerJoin(){
           Customer customer = new Customer("서재연","94121910581","서울","5982","5464",5555, Bank.SHINHAN);
           customerRepository.customerJoin(customer);//이후 실제 회원가입에 기재해야 할 정보를 매개변수에 삽입./

           Customer customer1=customerRepository.selectCustomer("서재연"); //실제 저장이 되었는지 키 값을 주고 다른 그릇에 저장만 했을 뿐. 예상 값

           assertThat(customer).isEqualTo(customer1);  //assertThat을 사용하여 처음 소괄호에는 실제 집어넣은 값, 이후 isEqualTo에는 다른 그릇에 집어넣은 변수 입력
           System.out.println(customer1); //toString을 사용했다면 메모리단에 어떻게 저장되어 있는지 열람 가능.

        }

}
