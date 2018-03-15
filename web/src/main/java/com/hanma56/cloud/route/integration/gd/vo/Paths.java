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
public class Paths {

    private String distance;
    private String duration;
    private String strategy;
    private String tolls;
    private String toll_distance;
    private List<Steps> steps;
    private String restriction;
    private String traffic_lights;
    public void setDistance(String distance) {
         this.distance = distance;
     }
     public String getDistance() {
         return distance;
     }

    public void setDuration(String duration) {
         this.duration = duration;
     }
     public String getDuration() {
         return duration;
     }

    public void setStrategy(String strategy) {
         this.strategy = strategy;
     }
     public String getStrategy() {
         return strategy;
     }

    public void setTolls(String tolls) {
         this.tolls = tolls;
     }
     public String getTolls() {
         return tolls;
     }

    public void setToll_distance(String toll_distance) {
         this.toll_distance = toll_distance;
     }
     public String getToll_distance() {
         return toll_distance;
     }

    public void setSteps(List<Steps> steps) {
         this.steps = steps;
     }
     public List<Steps> getSteps() {
         return steps;
     }

    public void setRestriction(String restriction) {
         this.restriction = restriction;
     }
     public String getRestriction() {
         return restriction;
     }

    public void setTraffic_lights(String traffic_lights) {
         this.traffic_lights = traffic_lights;
     }
     public String getTraffic_lights() {
         return traffic_lights;
     }

}