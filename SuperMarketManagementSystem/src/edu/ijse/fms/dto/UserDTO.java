/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.fms.dto;

/**
 *
 * @author Gnanod
 */
public class UserDTO extends SuperDTO{
    private String userName;
    private String userId;
    private String userType;
    private String userGender;
    private String userPassword;
    private String userTelNumber;
    private String userAddress;

    public UserDTO() {
    }

    public UserDTO(String userName, String userId, String userType, String userGender, String userPassword, String userTelNumber, String userAddress) {
        this.userName = userName;
        this.userId = userId;
        this.userType = userType;
        this.userGender = userGender;
        this.userPassword = userPassword;
        this.userTelNumber = userTelNumber;
        this.userAddress = userAddress;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the userType
     */
    public String getUserType() {
        return userType;
    }

    /**
     * @param userType the userType to set
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * @return the userGender
     */
    public String getUserGender() {
        return userGender;
    }

    /**
     * @param userGender the userGender to set
     */
    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    /**
     * @return the userPassword
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * @param userPassword the userPassword to set
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * @return the userTelNumber
     */
    public String getUserTelNumber() {
        return userTelNumber;
    }

    /**
     * @param userTelNumber the userTelNumber to set
     */
    public void setUserTelNumber(String userTelNumber) {
        this.userTelNumber = userTelNumber;
    }

    /**
     * @return the userAddress
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * @param userAddress the userAddress to set
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    
   
}
