package com.kodilla.exception.test;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class FlightRunner {

    private Map<String, Boolean> flightMap;

    public FlightRunner() {
        flightMap = new HashMap<>();
        flightMap.put("BXP", true);
        flightMap.put("WAW", true);
        flightMap.put("SZY", false);
        flightMap.put("GDN", false);
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException{
        String departureAirport = flight.getDepartureAirport();
        String arrivalAirport = flight.getArrivalAirport();

        if(!flightMap.containsKey(departureAirport) || !flightMap.containsKey(arrivalAirport)){
            return false;
        }

        boolean isArrivalAvailable = flightMap.get(arrivalAirport);
        boolean isDepartureAvailable = flightMap.get(departureAirport);

        if(!isArrivalAvailable || !isDepartureAvailable){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        FlightRunner flightRunner = new FlightRunner();
        Flight flight1 = new Flight("BXP", "FLY");
        Flight flight2 = new Flight("BXP", "WAW");
        Flight flight3 = new Flight("WAW", "SZY");

        //Airport does not exists in flightMap
        try {
            flightRunner.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }

        //Both departure and arrival airports have true values in flightmap
        try {
            flightRunner.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }

        //One airport have true value in flightmap and other have false value in flightmap
        try {
            flightRunner.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
