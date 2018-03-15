package com.imooc.exception;

import com.imooc.pojo.IMoocJSONResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@RestControllerAdvice
public class IMoocAjaxExceptionHandler {

	@ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest reqest, Exception e) throws Exception {

    	e.printStackTrace();

        return IMoocJSONResult.errorException(e.getMessage());
    }
}