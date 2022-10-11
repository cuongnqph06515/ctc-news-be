package com.spring.news.ExceptionHandler;

import com.spring.news.helper.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ApiResponse ISEException(Exception ex, WebRequest webRequest){
        return new ApiResponse(10000, ex.getLocalizedMessage());
    }

    @ExceptionHandler(IndexOutOfBoundsException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiResponse IOOBException(Exception ex, WebRequest webRequest){
        return new ApiResponse(101000, "ĐỐI TƯỢNG KHÔNG TỒN TẠI!");
    }
}

