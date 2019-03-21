package com.mobileserver;

import com.mobileserver.repository.ActiveUser;
import com.mobileserver.repository.ActiveUserRepository;
import com.mobileserver.repository.User;
import com.mobileserver.repository.UserRepository;
import com.mobileserver.service.CommonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MobileServerApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ActiveUserRepository activeUserRepository;

	@Autowired
	private CommonService commonService;

	@Test
	public void getUserTest() {
		User newUser = new User("20190321001", "1234", "munjisu");
		userRepository.save(newUser);

		User selectUser = Optional.ofNullable(userRepository.findById("20190321001")).get().orElse(new User());
		assertThat(selectUser.getUserName()).isEqualTo("munjisu");

		userRepository.deleteById("20190321001");
	}

	@Test
	public void getActiveUserTest() {
		ActiveUser activeUser = new ActiveUser("20190321001", commonService.dateToString(new Date(), "yyyyMMddHHmmss"));
		activeUserRepository.save(activeUser);

		ActiveUser selectActiveUser = Optional.ofNullable(activeUserRepository.findById("20190321001")).get().orElse(new ActiveUser());
		assertThat(selectActiveUser.getUserId()).isEqualTo("20190321001");

		activeUserRepository.deleteById("20190321001");
	}

	@Test
	public void createUserTest() {
		User createUser = new User("tester", "tester", "테스터");
		System.out.println(userRepository.save(createUser));
	}
}

