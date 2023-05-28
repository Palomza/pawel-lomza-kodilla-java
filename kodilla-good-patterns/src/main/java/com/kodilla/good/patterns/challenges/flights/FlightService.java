package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    private List<Flight> flights;

    public FlightService() {
        this.flights = new ArrayList<>();
    }

    public void addFlight(String departureCity, String arrivalCity) {
        flights.add(new Flight(departureCity, arrivalCity));
    }

    public List<Flight> getFlightsFromCity(String city) {
        return flights.stream()
                .filter(flight -> flight.getDepartureCity().equals(city))
                .collect(Collectors.toList());
    }

    public List<Flight> getFlightsToCity(String city) {
        return flights.stream()
                .filter(flight -> flight.getArrivalCity().equals(city))
                .collect(Collectors.toList());
    }

    public List<Flight> getFlightsViaCity(String fromCity, String viaCity, String toCity) {
        List<Flight> fromToViaFlights = flights.stream()
                .filter(flight -> flight.getDepartureCity().equals(fromCity) && flight.getArrivalCity().equals(viaCity))
                .collect(Collectors.toList());

        List<Flight> viaToDestFlights = flights.stream()
                .filter(flight -> flight.getDepartureCity().equals(viaCity) && flight.getArrivalCity().equals(toCity))
                .collect(Collectors.toList());

        return fromToViaFlights.stream()
                .flatMap(flight1 -> viaToDestFlights.stream()
                        .map(flight2 -> new Flight(flight1.getDepartureCity(), flight2.getArrivalCity())))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        FlightService flightService = new FlightService();

        flightService.addFlight("Warszawa", "Gdańsk");
        flightService.addFlight("Warszawa", "Wrocław");
        flightService.addFlight("Warszawa", "Katowice");
        flightService.addFlight("Wrocław", "Kraków");
        flightService.addFlight("Wrocław", "Katowice");
        flightService.addFlight("Kraków", "Katowice");

        String city1 = "Warszawa";
        String city2 = "Wrocław";
        String city3 = "Katowice";


        System.out.println("\nDisplays flights from " + city1 + ":");
        List<Flight> flightsFromCity = flightService.getFlightsFromCity("Warszawa");
        for(Flight flight : flightsFromCity) {
            System.out.println(flight.getDepartureCity() + " to " + flight.getArrivalCity());
        }

        System.out.println("\nDisplays flights to " + city3 + ":");
        List<Flight> flightsToCity = flightService.getFlightsToCity("Katowice");
        for(Flight flight : flightsToCity) {
            System.out.println(flight.getDepartureCity() + " to " + flight.getArrivalCity());
        }

        System.out.println("\nDisplays flights from " + city1 + " via " + city2 + " to " + city3 + ":");
        List<Flight> flightsThroughCity = flightService.getFlightsViaCity("Warszawa", "Wrocław", "Katowice");
        for(Flight flight : flightsThroughCity) {
            System.out.println(flight.getDepartureCity() + " to " + flight.getArrivalCity() + " via " + city2);
        }

    }
}
