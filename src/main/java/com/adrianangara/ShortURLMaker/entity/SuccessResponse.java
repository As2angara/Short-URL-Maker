package com.adrianangara.ShortURLMaker.entity;

public class SuccessResponse {

    //Instance Variables
    private boolean success;

    //Constructors
    public SuccessResponse(boolean success) {
        this.success = success;
    }

    public SuccessResponse() {
    }

    //Getters
    public boolean getSuccess() {return this.success;}

    //Setters
    public void setSuccess(boolean success) {this.success = success;}
}
