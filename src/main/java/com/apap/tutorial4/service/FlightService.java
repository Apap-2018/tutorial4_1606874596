package com.apap.tutorial4.service;

import com.apap.tutorial4.model.FlightModel;
import com.apap.tutorial4.model.PilotModel;

import java.util.List;

public interface FlightService {
    void addFlight(FlightModel flight);
    FlightModel getFlightDetailByFlightNumber(String flightNumber);
    List<FlightModel> getAllFlights();
    void deleteFlight(FlightModel flight);
    void updateFlight (FlightModel flight, String flightNumber);

}
