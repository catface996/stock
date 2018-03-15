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
public class Route {

    private String origin;
    private String destination;
    private String taxi_cost;
    private List<Paths> paths;
    public void setOrigin(String origin) {
         this.origin = origin;
     }
     public String getOrigin() {
         return origin;
     }

    public void setDestination(String destination) {
         this.destination = destination;
     }
     public String getDestination() {
         return destination;
     }

    public void setTaxi_cost(String taxi_cost) {
         this.taxi_cost = taxi_cost;
     }
     public String getTaxi_cost() {
         return taxi_cost;
     }

    public void setPaths(List<Paths> paths) {
         this.paths = paths;
     }
     public List<Paths> getPaths() {
         return paths;
     }

}