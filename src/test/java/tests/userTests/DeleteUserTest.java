package tests.userTests;

import model.userModel.ResponseModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class DeleteUserTest extends BaseTest {

    @Test
    public void deleteUser() {
        ResponseModel model = USER_API.deleteUser("danyagusarovtop1");
        Assert.assertEquals(model.getCode(), "200");
    }

}
