package com.tbs.general;

import java.io.Serializable;
import javax.faces.convert.ConverterException;
import com.general.utils.NoLoggedUserException;



public class Constants implements Serializable {

	private static final long serialVersionUID = 1L;
	public static final int ACTIVE = 1;
	public static final String MEMBER_INVALID_EMAIL = "MEMBER_INVALID_EMAIL";
	public static final String MEMBER_INVALID_PASSOWRD = "MEMBER_INVALID_PASSOWRD";
	public static final String EMAIL_ALREADY_EXIST = "EMAIL_ALREADY_EXIST";
	public static final String DATABASE_ERROR_MESSAGE = "DATABASE_ERROR";
	public static final String HOME_PAGE = "home.xhtml"; 
	public static final String USER_ADDED_SUCCESSFULLY = "USER_ADDED_SUCCESSFULLY";
	public static final String ADD_EVENT_EVENT_ADDED_SUCCESSFULLY = "ADD_EVENT_EVENT_ADDED_SUCCESSFULLY";

	public static final TBSException invalidEmail = new TBSException(
			MEMBER_INVALID_EMAIL);
	public static final String DUPLICATED_TOUR_CODE = "DUPLICATED_TOUR_CODE";
	public static final TBSException DUPLICATED_TOUR_CODE_ERROR = new TBSException(
			DUPLICATED_TOUR_CODE);
	
	public static final String RUNTIME_EXCEPTION = "TBS_RUNTIME_EXCEPTION";
	public static final TBSException TBS_RUNTIME_EXCEPTION = new TBSException(
			RUNTIME_EXCEPTION);
	
	public static final String TRAVELLER_CASTING = "TBS_TRAVELLER_CASTING_EXCEPTION";
	public static final TBSException TBS_TRAVELLER_CASTING_EXCEPTION = new TBSException(
			TRAVELLER_CASTING);
	
	public static final TBSException invalidPassword = new TBSException(
			MEMBER_INVALID_PASSOWRD);
	public static final TBSException EMAIL_ALREADY_EXISTS = new TBSException(
			EMAIL_ALREADY_EXIST);
	public static final TBSException DATABASE_ERROR = new TBSException(
			DATABASE_ERROR_MESSAGE);
	public static final String REGISTRATION_PASSWORD_AND_CONFIRMATION_SHOULD_BE_MATCHED = "REGISTRATION_PASSWORD_AND_CONFIRMATION_SHOULD_BE_MATCHED";
	public static final String STORE_FOLDER_NAME = "resources"+"/"+"photos";
	public static final String ICONS_STORE_FOLDER_NAME = "resources"+"/"+"images"+"/weathericons";
	public static final String UNABLE_TO_UPLOAD_IMAGE_MESSAGE = "UNABLE_TO_UPLOAD_IMAGE_MESSAGE";
	public static final TBSException UNABLE_TO_UPLOAD_IMAGE = new TBSException(
			UNABLE_TO_UPLOAD_IMAGE_MESSAGE);
	
	public static final ConverterException CONVERSION_EXCEPTION = new ConverterException();
	
	public static final String GENERAL_MODIFICATES_HAS_BEEN_SAVED = "GENERAL_MODIFICATES_HAS_BEEN_SAVED";
	
	public static final String LOGOUT = "LOGOUT";
	
	public static final String LOGIN_PAGE = "login.xhtml";
	public static final Exception EXCEPTION = new Exception();
	public static final String CURRENT_LOGGED_USER = "CURRENT_LOGGED_USER";
	public static final NoLoggedUserException NO_LOGGED_USER_EXCEPTION = new NoLoggedUserException();
	
	public static final String TOUR_PACKAGE_ADDED_SUCCESSFULLY = "TOUR_PACKAGE_ADDED_SUCCESSFULLY";
	public static final String TOUR_PACKAGE_ADDED_FAILED = "TOUR_PACKAGE_ADDED_FAILED";
	public static final String DEFAULT_IMAGE_NAME = "default_image.png";
	public static final String DOMESTIC_TRAVELLER_ADDED_SUCCESSFULLY = "DOMESTIC_TRAVELLER_ADDED_SUCCESSFULLY";
	public static final String INTERNATIONAL_TRAVELLER_ADDED_SUCCESSFULLY = "INTERNATIONAL_TRAVELLER_ADDED_SUCCESSFULLY";
	public static final String TOUR_SALES_NO_DATA_FOUND = "TOUR_SALES_NO_DATA_FOUND";
	public static final String TOUR_SALES_PLEASE_SELECT_DATA = "TOUR_SALES_PLEASE_SELECT_DATA";
	public static final String TOUR_SALES_ADDED_SUCCESSFULLY = "TOUR_SALES_ADDED_SUCCESSFULLY";
	public static final String DOMESTIC_TELEPHOE_LENGTH_MUST_BE_LESS_THAN_10 = "DOMESTIC_TELEPHOE_LENGTH_MUST_BE_LESS_THAN_10";
}
