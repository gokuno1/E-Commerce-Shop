package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.ArchiveUser;

public interface ArchiveUserRepository extends JpaRepository<ArchiveUser, Integer>{
	
	@Query(value = "SELECT user_id, mobile_no,sapcode, PASSWORD, username, createdByService, \r\n" + 
			"createdDate, updatedByService, updatedByUser, updatedDate, createdByUser, EMAIL, ENABLED, ACCOUNT_EXPIRED,\r\n" + 
			"CREDENTIALS_EXPIRED, ACCOUNT_LOCKED, deviceId, FIRST_NAME, LAST_NAME, IS_PARENT, LOCATION, \r\n" + 
			"DEVICE_FCM_WEBTOKEN, DEVICE_FCM_IOSTOKEN, DEVICE_FCM_ANDROIDTOKEN, UBS_VALUE, IMAGE, \r\n" + 
			"HOME_ADDRESS1, WORK_ADDRESS2, WORK_ADDRESS3, WORK_ADDRESS_PIN, HOME_ADDRESS2, HOME_ADDRESS3, HOME_ADDRESS_PIN,WORK_ADDRESS1, \r\n" + 
			"POPUPFLAG, COMPANY_NAME, PROFILE_IMAGE, IMEI, PASSWORD_VALIDITY, POPUPFLAG_UPDATEDDATE, OU_CG,NOW() FROM userservice.user\r\n" + 
			"WHERE \r\n" + 
			"sapcode IN (SELECT sapcode FROM SAPCODE_MOBILENO_MAPPING WHERE member_status='BLOCKED');\r\n" + 
			"")
	public ArchiveUser saveIntoArchiveTable();
}
