package testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.Library;
import page.LoginPage;
import reusablefunctions.SeleniumUtilities;


public class Clickon extends Library{
	@BeforeTest
    public void stratUp() {
        launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");

    }
    

}
