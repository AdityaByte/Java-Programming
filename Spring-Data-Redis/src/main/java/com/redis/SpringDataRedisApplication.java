package com.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Firstly have a look to this comment.
// Learning Spring Data Redis for using Redis as a persistent fast storage or as a cache memory.
// So our motive is that we have to create a functionality like OTP verification system.
// So for that we need to send the profile to the backend and the backend respond you to the OK status
// then you have to look at the otp page ok.

@SpringBootApplication
public class SpringDataRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRedisApplication.class, args);
	}

}
