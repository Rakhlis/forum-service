package telran.java53.accounting.dto;

import org.springframework.data.annotation.Id;

import lombok.Getter;

@Getter
public class UserRegisterDto {

	@Id
	String login;
    String password;
    String firstName;
    String lastName;
}
