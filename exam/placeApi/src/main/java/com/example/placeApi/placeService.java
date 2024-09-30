package com.example.placeApi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class placeService {
    public List<placeModel> getAllPlaces() {
        List<placeModel> places = new ArrayList<>();
        placeModel place1 = new placeModel();
        place1.setName("Hanoi");
        place1.setImageUrl("https://images.app.goo.gl/RoD23yQ5ooRm2Xtb9");
        places.add(place1);
        placeModel place2 = new placeModel();
        place2.setName("Saigon");
        place2.setImageUrl("https://images.app.goo.gl/iK49a4ijNk2tUSCB8");
        places.add(place2);
        return places;
    }
}
