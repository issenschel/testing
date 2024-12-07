package tests.userTests;

import model.userModel.UserResponseModel;
import model.userModel.ResponseModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class GetUserTest extends BaseTest {

    @Test
    public void getUserByUser() {
        UserResponseModel model = USER_API.getUserByUserName("danyagusarovtop1");
        Assert.assertEquals(model.getUsername(), "danyagusarovtop1");
    }

    @Test
    public void getLogin() {
        ResponseModel model = USER_API.getLogin("danyagusarovtop1","danyagusarovtop1");
        Assert.assertEquals(model.getCode(), "200");
    }


    @Test
    public void getLogout() {
        ResponseModel model = USER_API.getLogout();
        Assert.assertEquals(model.getCode(), "200");
    }


}
