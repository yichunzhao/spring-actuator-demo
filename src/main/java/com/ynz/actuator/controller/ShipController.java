package com.ynz.actuator.controller;

import com.ynz.actuator.domain.Ship;
import com.ynz.actuator.exceptions.NotFoundException;
import com.ynz.actuator.repository.ShipRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ShipController {
    private final ShipRepository shipRepository;

    @GetMapping("/ships")
    public ResponseEntity<List<Ship>> findAllShips() {
        List<Ship> ships = new ArrayList<>();
        shipRepository.findAll().forEach(ship -> ships.add(ship));
        return new ResponseEntity(ships, HttpStatus.OK);
    }

    @GetMapping("/ships/{id}")
    public ResponseEntity<Ship> findShipById(@PathVariable("id") int id) {
        Ship found = getShipById(id);
        return new ResponseEntity(found, HttpStatus.FOUND);
    }

    @DeleteMapping("/ships/{id}")
    public ResponseEntity deleteShipById(@PathVariable("id") int id) {
        getShipById(id);
        shipRepository.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    private Ship getShipById(int id) {
        return shipRepository.findById(id).orElseThrow(() -> new NotFoundException("Id: " + id + " is not found."));
    }

}
