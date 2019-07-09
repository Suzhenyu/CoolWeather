package io.github.suzhenyu.coolweather.db;

import org.litepal.crud.LitePalSupport;

public class County extends LitePalSupport {

    private int id;

    private String countyName;

    private String weatherID;

    private int cityID;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setWeatherID(String weatherID) {
        this.weatherID = weatherID;
    }

    public String getWeatherID() {
        return weatherID;
    }

}
