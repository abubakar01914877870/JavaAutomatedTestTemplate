package org.exampleTestStepDefinitions;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

public class apiTestStepDefinitions {
    private String accessToken;
    public RestAssured rest;

    @Given("I set base path {string}")
    public void i_set_base_path(String _basePath) {
        this.rest.baseURI = _basePath;
    }

    @Given("I create access token {string} and {string}")
    public void i_create_access_token_and(String _userName, String _password) {
        RequestSpecification request = this.rest.given();
        request.header("Content-Type", "application/json");
        JSONObject requestParams = new JSONObject();
        requestParams.put("username", _userName);
        requestParams.put("password", _password);
        request.body(requestParams);
        Response response = request.post("/auth");
        ResponseBody body = response.getBody();
        this.accessToken = body.jsonPath().getString("token");
    }
    @When("I request for all booking data")
    public void i_request_for_all_booking_data() {
        RequestSpecification request = this.rest.given();
        request.header("Content-Type", "application/json");
    }
    @Then("I check response status should be {string}")
    public void i_check_response_status_should_be(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
