package com.tbs.dao;

import javax.ejb.Local;

import com.tbs.entity.DomesticTraveller;
import com.tbs.entity.InternationalTraveller;
import com.tbs.entity.Traveller;


@Local
public interface DomesticTravellerDAO {
	
	public DomesticTraveller addDomesticTraveller(DomesticTraveller domesticTraveller);
}
