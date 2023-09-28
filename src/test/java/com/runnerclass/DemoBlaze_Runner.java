package com.runnerclass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.base.DemoBlaze_Base;

public class DemoBlaze_Runner extends DemoBlaze_Base {

	@BeforeClass
	public static void setUp() {
		browserLaunch("chrome");
	}

	@AfterClass
	public static void tearDown() {
		close();
	}

}
