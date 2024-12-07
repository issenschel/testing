package tests.userTests;

import model.userModel.ResponseModel;
import model.userModel.UserRequestModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class PutUserTest extends BaseTest {

    @Test
    public void putChangeUser() {
        UserRequestModel userRequestModel = new UserRequestModel(
                595959595995595L,"danyagusarovtop1","string23","string23","string","danyagusarovtop1","string",0);
        ResponseModel model = USER_API.putChangeUser("danyagusarovtop123",userRequestModel);
        Assert.assertEquals(model.getCode(), "200");
    }


}
