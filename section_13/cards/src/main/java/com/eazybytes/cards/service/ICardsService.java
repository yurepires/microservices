package com.eazybytes.cards.service;

import com.eazybytes.cards.dto.CardsDto;

public interface ICardsService {

    /**
     * This method will create a new card for the given mobile number
     *
     * @param mobileNumber - Mobile Number of the Customer
     */
    void createCard(String mobileNumber);

    /**
     * This method will fetch the card details for the given mobile number
     *
     * @param mobileNumber - Mobile Number of the Customer
     */
    CardsDto fetchCard(String mobileNumber);

    /**
     * This method will update the card details for the given card
     *
     * @param cardsDto - contains the card information
     * @return boolean value indicating the success of the operation
     */
    boolean updateCard(CardsDto cardsDto);

    /**
     * @param mobileNumber - Input MobileNumber
     * @return boolean indicating if the delete of card details is successful or not
     */
    boolean deleteCard(String mobileNumber);

}
