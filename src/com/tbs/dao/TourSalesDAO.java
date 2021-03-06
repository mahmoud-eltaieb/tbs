package com.tbs.dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Local;

import com.tbs.entity.DomesticTraveler;
import com.tbs.entity.InternationalTraveler;
import com.tbs.entity.TourPackage;
import com.tbs.entity.TourSales;
import com.tbs.entity.Traveler;
import com.tbs.general.TBSException;


@Local
public interface TourSalesDAO extends Serializable{
	
	public TourSales addNewTourSales(TourSales tourSales) throws TBSException;

	public List<TourSales> getAllTourSales() throws TBSException;
}
