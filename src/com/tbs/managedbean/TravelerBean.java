package com.tbs.managedbean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.general.utils.WebUtils;
import com.tbs.business.manage.Manageable;
import com.tbs.entity.DomesticTraveler;
import com.tbs.entity.InternationalTraveler;
import com.tbs.general.Constants;
import com.tbs.general.TBSException;

@ManagedBean
@ViewScoped
public class TravelerBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	Manageable manage;

	private String firstName;

	private String lastName;
	
	private String residentialAddress;
	
	private String contactTelephone;

	private String emailAddress;
	
	//for domestic traveller
	private String photoIdentificationType;
	
	private String photoIdentificationIssuer;
	
	private String photoIdentificationNumber;

	//for international traveller
	private String passportNumber;
	
	private String passportCountry;
	
	private String visaNumber;
	
	private boolean domesticFlag=true;
	private boolean internationalFlag;
	
	private String travelerType="domestic";
	
	@PostConstruct
	public void init(){
		domesticFlag=true;
		internationalFlag=false;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public String getContactTelephone() {
		return contactTelephone;
	}

	public void setContactTelephone(String contactTelephone) {
		this.contactTelephone = contactTelephone;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhotoIdentificationType() {
		return photoIdentificationType;
	}

	public void setPhotoIdentificationType(String photoIdentificationType) {
		this.photoIdentificationType = photoIdentificationType;
	}

	public String getPhotoIdentificationIssuer() {
		return photoIdentificationIssuer;
	}

	public void setPhotoIdentificationIssuer(String photoIdentificationIssuer) {
		this.photoIdentificationIssuer = photoIdentificationIssuer;
	}

	public String getPhotoIdentificationNumber() {
		return photoIdentificationNumber;
	}

	public void setPhotoIdentificationNumber(String photoIdentificationNumber) {
		this.photoIdentificationNumber = photoIdentificationNumber;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getPassportCountry() {
		return passportCountry;
	}

	public void setPassportCountry(String passportCountry) {
		this.passportCountry = passportCountry;
	}

	public String getVisaNumber() {
		return visaNumber;
	}

	public void setVisaNumber(String visaNumber) {
		this.visaNumber = visaNumber;
	}
	

	public String getTravelerType() {
		return travelerType;
	}

	public void setTravelerType(String travelerType) {
		if(travelerType.equals("domestic")){
			this.domesticFlag=true;
			this.internationalFlag=false;
		}
		else if(travelerType.equals("international")){
			this.domesticFlag=false;
			this.internationalFlag=true;
		}
		this.travelerType = travelerType;
	}
	

	public boolean isDomesticFlag() {
		return domesticFlag;
	}

	public boolean isInternationalFlag() {
		return internationalFlag;
	}

	public void addNewTraveller(){
		
		try {
			
			DomesticTraveler domesticTraveller=null;
			InternationalTraveler internationalTraveller=null;
			
			if(travelerType.equals("domestic")){
				if(contactTelephone.length()<=10){
					domesticTraveller = manage.addDomesticTraveller(firstName, lastName, residentialAddress, contactTelephone, emailAddress, photoIdentificationType, photoIdentificationIssuer, photoIdentificationNumber);
					WebUtils.fireInfoMessage(Constants.DOMESTIC_TRAVELLER_ADDED_SUCCESSFULLY);
				}
				else
					WebUtils.fireInfoMessage(Constants.DOMESTIC_TELEPHOE_LENGTH_MUST_BE_LESS_THAN_10);
			
			}
			else if(travelerType.equals("international")){
				
				internationalTraveller = manage.addInternationalTraveller(firstName, lastName, residentialAddress, contactTelephone, emailAddress, passportNumber, passportCountry, visaNumber);
				WebUtils.fireInfoMessage(Constants.INTERNATIONAL_TRAVELLER_ADDED_SUCCESSFULLY);
			}
				
			
			//TourPackage tourPackage = tourPackageFacade.addNewTourPackage(tourCode, vehicleNumberPlate, tourDate, departFrom, destination);
			resetAttributes();
			
			
		} catch (TBSException e) {

			WebUtils.fireErrorMessage(e.getMessageKey());
		}
	}
	
	public void resetAttributes(){
		this.firstName="";
		this.lastName="";
		this.residentialAddress="";
		this.contactTelephone="";
		this.emailAddress="";
		this.photoIdentificationType="";
		this.photoIdentificationIssuer="";
		this.photoIdentificationNumber="";
		this.passportNumber="";
		this.passportCountry="";
		this.visaNumber="";
		
	}
}
