package org.intu.tss.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScriptController {
	
    @RequestMapping("run-script-request")
    public String createRunScriptRequest(HttpServletRequest request) {
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
    	
    	
        return "{}";
    }
    
}