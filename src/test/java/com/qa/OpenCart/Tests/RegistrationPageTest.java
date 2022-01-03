package com.qa.OpenCart.Tests;

import com.qa.OpenCart.Base.BaseTest;
import com.qa.OpenCart.Utils.Constants;
import com.qa.OpenCart.Utils.ExcelUtil;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

public class RegistrationPageTest extends BaseTest {

    @BeforeClass
    public void setUpRegister(){
    rp=lp.navigateToRegsterPage();
}
public String getRandomNumber(){
    Random randomGenerator = new Random();
    String email="testautomation."+randomGenerator.nextInt(100)+"@gmail.com";
    return email;
}
@DataProvider
public Object[][] getRegisterData(){
    Object regData[][]=ExcelUtil.getTestData(Constants.REGISTER_SHEET);
    return regData;
}
@Test(dataProvider = "getRegisterData")
    public void fillInDetails(String firstname,String lastname,String phone,String password,String subscribe){

    rp.accountRegistration(firstname,lastname,getRandomNumber(),phone,password,subscribe);


}

}
