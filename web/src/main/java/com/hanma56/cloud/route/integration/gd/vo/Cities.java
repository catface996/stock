/**
  * Copyright 2017 bejson.com 
  */
package com.hanma56.cloud.route.integration.gd.vo;
import java.util.List;

/**
 * Auto-generated: 2017-08-16 21:10:38
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Cities {

    private String name;
    private String citycode;
    private String adcode;
    private List<Districts> districts;
    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setCitycode(String citycode) {
         this.citycode = citycode;
     }
     public String getCitycode() {
         return citycode;
     }

    public void setAdcode(String adcode) {
         this.adcode = adcode;
     }
     public String getAdcode() {
         return adcode;
     }

    public void setDistricts(List<Districts> districts) {
         this.districts = districts;
     }
     public List<Districts> getDistricts() {
         return districts;
     }

}