package it.sogei.svildep.interrogazioneservice.dto;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto extends Dto {
	
	private String username;
	private String role;
	
}
