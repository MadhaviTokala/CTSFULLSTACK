
/*
 * Author :Snehal Patil,Nagpur
 * Email  :snehalpatil2011@gmail.com
 * 
 * Disclaimer :The projects questions does not have any resemblance
 *  			with the actual exam.Though they are on the same pattern 
 *  			that I have experienced in practice assignmets.It contains the ".rtf file" 
 *  			which describes the problem statement .
 *  
 *  In case of violation of Any privacy or rights please inform
 *  
 *  
 *                "Practice makes a man perfect.................... and women too"
 */



package com.psl.exception;

public class AppointmentNotPossibleException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7529323974500736888L;

	@Override
	public String getMessage() {
		System.out.println("Can not arrange the appointment on the given date !");
		return super.getMessage();
	}

}
