
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

public class AppointmentSystemImpl implements AppointmentSystem {

	@Override
	public Set<Appointment> populateData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appointment showVisitorAppointment(Set<Appointment> treeSet,
			int visitorid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appointment> getVisitorsByMonth(Set<Appointment> treeSet,
			int month) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean bookAppointment(Set<Appointment> treeSet, Date date)
			throws AppointmentNotPossibleException {
		// TODO Auto-generated method stub
		return false;
	}

}
