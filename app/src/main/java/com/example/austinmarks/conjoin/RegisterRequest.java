package com.example.austinmarks.conjoin;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "http://conjoin.netne.net/register.php";
    private Map<String, String> params;

    public RegisterRequest(String name, String username, int age, String password, String passwordC, String email, Response.Listener<String>listener){

        super(Method.POST, REGISTER_REQUEST_URL, listener, null);

        params = new HashMap<>();
        params.put("name", name);
        params.put("username", username);
        params.put("age", age + "");
        params.put("password", password);
        params.put("passwordC" , passwordC);
        params.put("email", email);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }


}
