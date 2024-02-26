package com.karla.errores.springbooterrores;

import java.util.Date;

public class Error {
    private String messsage;
    private String error;
    private int status;
    private Date date;
    
    public String getMesssage() {
        return messsage;
    }
    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }



}
