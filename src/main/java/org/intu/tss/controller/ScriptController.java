package org.intu.tss.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.intu.tss.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScriptController {
	
    @RequestMapping("run-script-request")
    @ResponseBody
    public HashMap<String, User> createRunScriptRequest(@RequestBody User user, HttpServletRequest request) {
    	Logger logger = LoggerFactory.getLogger(ScriptController.class);
    	logger.info("run script");
    	logger.info("request");
    	
    	try {
            Process ps = Runtime.getRuntime().exec("d:\\1.bat");
            InputStream in = ps.getInputStream();
            in.close();
            ps.waitFor();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    	
    	user.setAge(123);
    	HashMap<String, User> hm = new HashMap<String, User>();
    	hm.put("user", user);
    	
        return hm;
    }
    
}