package com.bipool.services.login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginService {
	
    @RequestMapping("/doLogin")
    public String doLogin(@RequestParam(value="name", defaultValue="World") String name) {
    	System.out.println(name);
        //return controller.getGreetings();
    	return name;
    }

}
