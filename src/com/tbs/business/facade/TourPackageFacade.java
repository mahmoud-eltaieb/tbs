package com.tbs.business.facade;

import java.io.Serializable;
import java.util.Date;

import javax.ejb.Local;

import com.tbs.entity.TourPackage;
import com.tbs.general.TBSException;

@Local
public interface TourPackageFacade extends Serializable{
	public TourPackage addNewTourPackage(String tourCode, String vehicleNumberPlate, Date tourDate, String departFrom, String detination) throws TBSException;
}
