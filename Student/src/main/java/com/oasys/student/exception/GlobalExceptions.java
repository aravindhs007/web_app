package com.oasys.student.exception;





import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class GlobalExceptions {
@ExceptionHandler(NameNotFoundException.class)
public ResponseEntity<Object> namehandler(NameNotFoundException m1){
	return new ResponseEntity<>(m1.getMessage(),HttpStatus.NOT_FOUND);
}
}
