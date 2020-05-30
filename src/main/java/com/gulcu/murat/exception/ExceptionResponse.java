package com.gulcu.murat.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionResponse {

	private Integer errorCode;
	private String errorMessage;
	private Date date;
}
