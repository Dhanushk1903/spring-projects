package com.main.dto;

public class RoomDTO {
	private int rid;
	private String roomType;
	private long rent;
	private int noofRooms;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public long getRent() {
		return rent;
	}
	public void setRent(long rent) {
		this.rent = rent;
	}
	public int getNoofRooms() {
		return noofRooms;
	}
	public void setNoofRooms(int noofRooms) {
		this.noofRooms = noofRooms;
	}
	


	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.roomType+this.noofRooms+this.rent;
	}
	
}
