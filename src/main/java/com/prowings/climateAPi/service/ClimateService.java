package com.prowings.climateAPi.service;

import com.prowings.climateAPi.entity.Climate;

public interface ClimateService {
	
	public Climate createClimate(Climate climate);

	public Climate getClimateByCity(String city);
	
}
