package org.mmp.patientmodule.tests;


import org.testng.Assert;

import java.util.HashMap;

import org.mmp.methods.BaseClass;
import org.mmp.methods.MMPUtil;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ScheduleAppointmentTest extends BaseClass {
	

  
  @Parameters({"url","username","password"})
	@Test
	public void TC_001_validateScheduleAppointment(String url,String username,String password,String drName)
	{
	   MMPUtil mmpUtil = new MMPUtil(driver);
		mmpUtil.lauchBrowser(url);
		mmpUtil.login(username, password);
		HashMap<String,String> expectedHMap = mmpUtil.bookAppointment(drName);
		HashMap<String,String> actualHMap = mmpUtil.fetchPatientData();
		Assert.assertEquals(actualHMap, expectedHMap);
	}
  @Parameters({"url","username","password","drName"})
	@Test
	public void TC_003_validateScheduleAppointment(String url,String username,String password,String drName)
	{

		MMPUtil mmpUtil = new MMPUtil(driver);
		mmpUtil.lauchBrowser(url);
		mmpUtil.login(username, password);
		HashMap<String,String> expectedHMap = mmpUtil.bookAppointment(drName,10);
		HashMap<String,String> actualHMap = mmpUtil.fetchPatientData();
		Assert.assertEquals(actualHMap, expectedHMap);
		 
	}
  }

