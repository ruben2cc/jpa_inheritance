package com.benito.inheritance;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.benito.inheritance.entities.Card;
import com.benito.inheritance.entities.Check;
import com.benito.inheritance.repos.PaymentRepository;

@SpringBootTest
class InheritanceApplicationTests {

	@Autowired
	private PaymentRepository repo;
	
	@Test
	void testCard() {
	
		Card card = new Card();
		card.setId(123);
		card.setAmount(1000);
		card.setCardnumber("1234567890");
		repo.save(card);
	}
	
	@Test
	public void testCheck() {
		
		Check check = new Check();
		check.setId(124);
		check.setAmount(1500);
		check.setChecknumber("1234567890");
		repo.save(check);
	}

}
