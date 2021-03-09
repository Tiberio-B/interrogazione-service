package it.sogei.svildep.istanzaservice.dto;

import it.sogei.svildep.istanzaservice.model.User;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto extends Dto<User> {
	
	private String username;
	private String role;
	
}