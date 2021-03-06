package com.fat246.servicecar.beans;

import cn.bmob.v3.BmobObject;

/**
 * Created by Administrator on 2016/5/21.
 */
public class Car extends BmobObject {

    private String Car_Num;
    private String User_Tel;
    private String Car_RackNum;
    private String Car_EngineNum;
    private String Car_Nick;
    private String Car_ModelType;

    //各种指标
    private Double Car_Gas;
    private Double Car_EngineStatus;
    private Double Car_SpeedStatus;
    private Double Car_LightStatus;
    private Double Car_Mileage;

    private Double Mileage_Times;

    public void setCar_Gas(Double gas) {
        this.Car_Gas = gas;
    }

    public void setCar_EngineStatus(Double engin) {
        this.Car_EngineStatus = engin;
    }

    public void setCar_SpeedStatus(Double speed) {
        this.Car_SpeedStatus = speed;
    }

    public void setCar_LightStatus(Double light) {
        this.Car_LightStatus = light;
    }

    public void setCar_Mileage(Double mileage) {
        this.Car_Mileage = mileage;
    }

    public Car(String Car_Num, String Car_RackNum, String Car_EngineNum, Double Car_Mileage,
               String Car_Nick, String Car_ModelType, String User_Tel, Double Car_Gas,
               Double Car_EngineStatus, Double Car_SpeedStatus, Double Car_LightStatus) {
        super();

        this.Car_Num = Car_Num;
        this.Car_RackNum = Car_RackNum;
        this.Car_EngineNum = Car_EngineNum;
        this.Car_Mileage = Car_Mileage;
        this.Car_Nick = Car_Nick;
        this.Car_ModelType = Car_ModelType;
        this.User_Tel = User_Tel;

        this.Car_Gas = Car_Gas;
        this.Car_EngineStatus = Car_EngineStatus;
        this.Car_SpeedStatus = Car_SpeedStatus;
        this.Car_LightStatus = Car_LightStatus;

        this.Mileage_Times = 0.0;
    }

    //get
    public String getCar_Num() {
        return this.Car_Num;
    }

    public String getCar_RackNum() {
        return this.Car_RackNum;
    }

    public String getCar_EngineNum() {
        return this.Car_EngineNum;
    }

    public String getCar_Nick() {
        return this.Car_Nick;
    }

    public Double getCar_Mileage() {
        return this.Car_Mileage;
    }

    public String getCar_ModelType() {
        return this.Car_ModelType;
    }

    public String getUser_Tel() {
        return this.User_Tel;
    }

    public Double getCar_Gas() {
        return this.Car_Gas;
    }

    public Double getCar_EngineStatus() {
        return this.Car_EngineStatus;
    }

    public Double getCar_SpeedStatus() {
        return this.Car_SpeedStatus;
    }

    public Double getCar_LightStatus() {
        return this.Car_LightStatus;
    }

    public Double getMileage_Times() {
        return this.Mileage_Times;
    }

    public void setMileage_Times(Double mileage) {
        this.Mileage_Times = mileage;
    }

    public void updateTimes(){this.Mileage_Times++;}
}
