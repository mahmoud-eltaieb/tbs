package com.tbs.dao;

import java.io.Serializable;

import javax.ejb.Local;

import com.tbs.entity.DomesticTraveller;
import com.tbs.entity.InternationalTraveller;
import com.tbs.entity.Traveller;
import com.tbs.general.TBSException;


@Local
public interface TravellerDAO extends Serializable{
	
	public Traveller addTraveller(Traveller traveller);
	
	public Traveller addDomesticTraveller(DomesticTraveller domesticTraveller) throws TBSException;
	
	public Traveller addInternationalTraveller(InternationalTraveller internationalTraveller) throws TBSException;
}
