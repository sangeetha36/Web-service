package com.lti.rest;

public class PNR {

	  private String date;
	  private int pnrNo;
	  private  int trainNo;
	  
	  private Status status;

	  public static enum Status{
		   RAC,WAITING,CONFIRMED;
	  }

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPnrNo() {
		return pnrNo;
	}

	public void setPnrNo(int pnrNo) {
		this.pnrNo = pnrNo;
	}

	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
}
