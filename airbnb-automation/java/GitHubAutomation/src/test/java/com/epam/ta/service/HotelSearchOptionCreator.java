package com.epam.ta.service;

import com.epam.ta.model.HotelSearchOption;

public class HotelSearchOptionCreator {
    public static final String TEST_DATA_HOTEL_SEARCH_CRITERIA_DESTINATION = "testdata.hotelSearchCriteria.destination";


    public static HotelSearchOption withCorrectDestination() {
        return new HotelSearchOption(TestDataReader.getTestData(TEST_DATA_HOTEL_SEARCH_CRITERIA_DESTINATION));

    }
}
