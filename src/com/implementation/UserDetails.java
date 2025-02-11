package com.implementation;

public class UserDetails {
    int userId;
    String userName;
    int userAge;
    String userAddress;
    long userPhoneNumber;
    String userDepartment;

    public UserDetails() {

    }

    public UserDetails(int userId,String userName, int userAge, String userAddress, long userPhoneNumber, String userDepartment) {
        this.userId=userId;
        this.userName = userName;
        this.userAge = userAge;
        this.userAddress = userAddress;
        this.userPhoneNumber = userPhoneNumber;
        this.userDepartment = userDepartment;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public long getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(long userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserDepartment() {
        return userDepartment;
    }

    public void setUserDepartment(String userDepartment) {
        this.userDepartment = userDepartment;
    }
}
