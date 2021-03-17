package it.sogei.svildep.interrogazioneservice.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class UserDto extends Dto {
	
	private String username;
	private String role;
	
}
