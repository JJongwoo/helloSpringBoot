package kr.ac.hansung.cse.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kr.ac.hansung.cse.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{//<클래스이름, 아이디 타입>
	
	List<Customer> findByLastName(String lastName);

}