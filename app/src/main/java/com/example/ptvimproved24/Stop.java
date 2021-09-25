package com.example.ptvimproved24;

import java.util.ArrayList;

public class Stop {

    private String suburb;
    private String stopname;
    private int stopid;
    private ArrayList<String> routes;
    private ArrayList<String> times;
    private ArrayList<Departure> departuresObj;
    private ArrayList<Route> routesObj;
    private int distance;
    private int routeType;
    private double stop_latitude;
    private double stop_longitude;

    public Stop(String suburb, int stopid, String stopname, ArrayList<String> routes, ArrayList<String> times) {
        this.suburb = suburb;
        this.stopname = stopname;
        this.stopid = stopid;
        this.routes = routes;
        this.times = times;
    }

    public Stop(String suburb, String stopname, int distance, ArrayList<String> routes, ArrayList<String> times) {
        this.suburb = suburb;
        this.stopname = stopname;
        this.routes = routes;
        this.times = times;
        this.distance = distance;
    }

    public Stop(String suburb, String stopname, int stopid) {
        this.suburb = suburb;
        this.stopname = stopname;
        this.stopid = stopid;
    }

    public Stop (int stopId, String stopName) {
        this.stopid = stopId;
        this.stopname = stopName;
    }

    public Stop (int stopId) {
        this.stopid = stopId;
    }

    public Stop(String suburb, String stopname, int stopid, int routeType, double stop_latitude, double stop_longitude) {
        this.suburb = suburb;
        this.stopname = stopname;
        this.stopid = stopid;
        this.routeType = routeType;
        this.stop_latitude = stop_latitude;
        this.stop_longitude = stop_longitude;
    }

    public Stop(String stopname, int stopid, double stop_latitude, double stop_longitude) {
        this.stopname = stopname;
        this.stopid = stopid;
        this.stop_latitude = stop_latitude;
        this.stop_longitude = stop_longitude;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getStopname() {
        return stopname;
    }

    public void setStopname(String stopname) {
        this.stopname = stopname;
    }

    public int getStopid() {
        return stopid;
    }

    public void setStopid(int stopid) {
        this.stopid = stopid;
    }

    public ArrayList<String> getRoutes() {
        return routes;
    }

    public void setRoutes(ArrayList<String> routes) {
        this.routes = routes;
    }

    public ArrayList<String> getTimes() {
        return times;
    }

    public void setTimes(ArrayList<String> times) {
        this.times = times;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getRouteType() {
        return routeType;
    }

    public void setRouteType(int routeType) {
        this.routeType = routeType;
    }

    public ArrayList<Departure> getDeparturesObj() {
        return departuresObj;
    }

    public void setDeparturesObj(ArrayList<Departure> departuresObj) {
        this.departuresObj = departuresObj;
    }

    public ArrayList<Route> getRoutesObj() {
        return routesObj;
    }

    public void setRoutesObj(ArrayList<Route> routesObj) {
        this.routesObj = routesObj;
    }

    public double getStop_latitude() {
        return stop_latitude;
    }

    public void setStop_latitude(double stop_latitude) {
        this.stop_latitude = stop_latitude;
    }

    public double getStop_longitude() {
        return stop_longitude;
    }

    public void setStop_longitude(double stop_longitude) {
        this.stop_longitude = stop_longitude;
    }
}
