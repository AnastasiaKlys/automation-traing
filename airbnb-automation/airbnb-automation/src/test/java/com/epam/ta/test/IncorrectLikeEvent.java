package com.epam.ta.test;

import com.epam.ta.model.HotelSearchOption;
import com.epam.ta.page.HomePage;
import com.epam.ta.service.HotelSearchOptionCreator;
import com.epam.ta.test.CommonConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.epam.ta.util.StringUtils.ALERT_MESSAGE_REGISTRATION;
import static com.epam.ta.util.StringUtils.CITY_DESTINATION;

public class IncorrectLikeEvent extends CommonConditions {
    @Test
    public void likeOnlyRegistrationUser(){

        String messageRegistration = new HomePage(driver)
                .correctSearch(CITY_DESTINATION)
                .likeFlat();
        Assert.assertEquals(ALERT_MESSAGE_REGISTRATION,messageRegistration);

    }
}
