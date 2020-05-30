package com.gulcu.murat.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
    public final ResponseEntity<?> handleExceptions(Exception ex, WebRequest request) {
		System.out.println("Exception");
        ExceptionResponse exceptionResponse = new ExceptionResponse(1000,ex.getMessage(),new Date());
        return new ResponseEntity<>(exceptionResponse , HttpStatus.EXPECTATION_FAILED);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public final ResponseEntity<ExceptionResponse> illegalArgumentException(Exception ex, WebRequest request) {
    	System.out.println("IllegalArgumentException");
        ExceptionResponse exceptionResponse = new ExceptionResponse(1000,ex.getMessage(),new Date());
        return new ResponseEntity<ExceptionResponse>(exceptionResponse , HttpStatus.EXPECTATION_FAILED);
    }
    
    @ExceptionHandler(EntityNotFoundException.class)
    public final ResponseEntity<ExceptionResponse> entityNotFoundException(Exception ex, WebRequest request) {
    	System.out.println("EntityNotFoundException");
        ExceptionResponse exceptionResponse = new ExceptionResponse(1000,ex.getMessage(),new Date());
        return new ResponseEntity<ExceptionResponse>(exceptionResponse , HttpStatus.EXPECTATION_FAILED);
    }
    
    @ExceptionHandler(RuntimeException.class)
    public final ResponseEntity<ExceptionResponse> runtimeException(Exception ex, WebRequest request) {
    	System.out.println("RuntimeException");
        ExceptionResponse exceptionResponse = new ExceptionResponse(1000,ex.getMessage(),new Date());
        return new ResponseEntity<ExceptionResponse>(exceptionResponse , HttpStatus.EXPECTATION_FAILED);
    }
}
