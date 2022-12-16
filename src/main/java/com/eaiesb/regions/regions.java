package com.eaiesb.regions;

import org.springframework.data.annotation.Id;

import lombok.Data;
@Data
public class regions {
	
	@Id
	public String id;
	
	private String regionId;
	private String regionName;
	
	
	


}
