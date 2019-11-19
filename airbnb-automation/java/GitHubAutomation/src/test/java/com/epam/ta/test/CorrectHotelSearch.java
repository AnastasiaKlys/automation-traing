package com.epam.ta.test;

import com.epam.ta.model.HotelSearchOption;
import com.epam.ta.page.HomePage;
import com.epam.ta.service.HotelSearchOptionCreator;
import org.testng.Assert;
import org.testng.annotations.Test;



public class CorrectHotelSearch extends CommonConditions{
    @Test
    public void checkCorrectDataOnHotelPage(){
        HotelSearchOption hotelSearchOption = HotelSearchOptionCreator.withCorrectDestination();
        String flatCityName = new HomePage(driver)
                .correctSearch(hotelSearchOption.getDestination())
                .openInformation()
                .cityName();
        Assert.assertEquals(hotelSearchOption.getDestination(), flatCityName);
    }

}
