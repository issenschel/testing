package tests.userTests;

import model.userModel.ResponseModel;
import model.userModel.UserRequestModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class PostUserTest extends BaseTest {

    @Test
    public void postCreateListUser() {
        UserRequestModel userRequestModel = new UserRequestModel(
                595959595995595L,"danyagusarovtop1","string","string","string","danyagusarovtop1","string",0);
        List<UserRequestModel> usersList = new ArrayList<>();
        usersList.add(userRequestModel);
        ResponseModel model = USER_API.postCreateListUser(usersList);
        Assert.assertEquals(model.getCode(), "200");
    }

    @Test
    public void postCreateUser() {
        UserRequestModel userRequestModel = new UserRequestModel(
                5959595959955952L,"danyagusarovtop1","string","string",
                "string","danyagusarovtop1","string",0);
        ResponseModel model = USER_API.postCreateUser(userRequestModel);
        Assert.assertEquals(model.getCode(), "200");
    }

}
