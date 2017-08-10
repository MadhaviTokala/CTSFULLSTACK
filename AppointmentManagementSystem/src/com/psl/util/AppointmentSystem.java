
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



package com.psl.util;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import com.psl.bean.Appointment;
import com.psl.exception.AppointmentNotPossibleException;

public interface AppointmentSystem {

	Set<Appointment> populateData();//discard appointments before the present date and arrange them in the ascending order of there date 
	Appointment  showVisitorAppointment(Set<Appointment> treeSet,int visitorid);
	List<Appointment> getVisitorsByMonth(Set<Appointment> treeSet,int month);//this will show the appointments for a given month for july=7
	boolean bookAppointment(Set<Appointment> treeSet,Date date) throws AppointmentNotPossibleException;
	//determine whether appointment is possible for given date only one appointment for a given day if day not available throw exception.
	
	
	
}
