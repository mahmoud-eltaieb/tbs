package com.tbs.dao;

import javax.ejb.Local;

import com.tbs.entity.DomesticTraveller;
import com.tbs.entity.InternationalTraveller;
import com.tbs.entity.Traveller;


@Local
public interface TravellerDAO {
	
	public Traveller addTraveller(Traveller traveller);
	
	public DomesticTraveller addDomesticTraveller(DomesticTraveller domesticTraveller);
	
	public InternationalTraveller addInternationalTraveller(InternationalTraveller internationalTraveller);
}
