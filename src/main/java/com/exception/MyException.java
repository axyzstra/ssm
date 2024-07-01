package com.exception;

import com.common.ResponseResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyException {

    @ExceptionHandler
    @ResponseBody
    public ResponseResult handlerException(Exception e) {
        return new ResponseResult("500", e.getMessage());
    }

}
