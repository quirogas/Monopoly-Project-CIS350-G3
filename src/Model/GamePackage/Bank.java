package Model.GamePackage;


import Model.BoardPackage.OwnableSquare;

import java.util.ArrayList;

/****************************************************************************************************************
 * The bank class is responsible of keeping track of the game's houses, player montages, and also perform
 * certain transactions.
 *
 * @author Santiago Quiroga
 * @version 2/13/2018
 ***************************************************************************************************************/
public class Bank {
    /* Number of houses */
    private int numHouses;

    /* Number of Hotels */
    private int numHotels;

    /* List of properties owned */
    private ArrayList<OwnableSquare> propertiesOwned;

    /* List of properties mortgaged */
    private ArrayList<OwnableSquare> propertiesMortgaged;

    /**
     *  This constructor initializes the bank with a specific set of properties,
     *  and uses the size of properties tocompute the size of the properties that can be mortgaged.
     * @param listOfProperties
     */
    public Bank(ArrayList<OwnableSquare> listOfProperties) {
        /** initialises all variables */
        propertiesOwned = listOfProperties;
        propertiesMortgaged = new ArrayList<>(listOfProperties.size());
        numHotels = 32;
        numHouses = 12;
    }

    /****************************************************************************************************************
     * This method will return a specific property, based of its ID.
     *
     * @param property
     ***************************************************************************************************************/
    public OwnableSquare giveProperty(OwnableSquare property) {
        //removes and returns the specific property.
        return propertiesOwned.remove(property.getPOSITION());
    }

    /****************************************************************************************************************
     * This method will store the given property into the list of owned properties.
     *
     * @param property
     ***************************************************************************************************************/
    public void receiveProperty(OwnableSquare property) {
        //Sets the owner of the property to null since to show.
        property.setOwner(null);

        //Adds the property to its list.
        propertiesOwned.add(property);
    }

    /****************************************************************************************************************
     * Subtracts the 1 from the numhouses
     ***************************************************************************************************************/
    public void giveHouse() {
        numHouses--;
    }

    /****************************************************************************************************************
     * Subtracts one from the numHotels
     ***************************************************************************************************************/
    public void giveHote() {
        numHotels--;
    }

    /****************************************************************************************************************
     * Adds to the numHouses
     ***************************************************************************************************************/
    public void receiveHouse() {
        numHouses++;
    }

    /****************************************************************************************************************
     * Adds to the numHotels
     ***************************************************************************************************************/
    public void receiveHotel() {
        numHotels++;
    }

    /****************************************************************************************************************
     * Returns the numHouses
     *
     * @return
     ***************************************************************************************************************/
    public int getNumHouses() {
        return numHouses;
    }

    /****************************************************************************************************************
     * Sets the numHouses
     *
     * @param numHouses
     ***************************************************************************************************************/
    public void setNumHouses(int numHouses) {
        this.numHouses = numHouses;
    }

    /****************************************************************************************************************
     * Returns the number of hotels.
     *
     * @return
     ***************************************************************************************************************/
    public int getNumHotels() {
        return numHotels;
    }

    /****************************************************************************************************************
     * Sets the number of hotels.
     *
     * @param numHotels
     ***************************************************************************************************************/
    public void setNumHotels(int numHotels) {
        this.numHotels = numHotels;
    }

    /****************************************************************************************************************
     * Returns the  list of properties owned.
     *
     * @return
     ***************************************************************************************************************/
    public ArrayList<OwnableSquare> getPropertiesOwned() {
        return propertiesOwned;
    }

    /****************************************************************************************************************
     * Sets the current properties owned.
     *
     * @param propertiesOwned
     ***************************************************************************************************************/
    public void setPropertiesOwned(ArrayList<OwnableSquare> propertiesOwned) {
        this.propertiesOwned = propertiesOwned;
    }

    /****************************************************************************************************************
     * Returns the list of mortgaged properties
     *
     * @return
     ***************************************************************************************************************/
    public ArrayList<OwnableSquare> getPropertiesMortgaged() {
        return propertiesMortgaged;
    }

    /****************************************************************************************************************
     * Set the list of properties owned
     *
     * @param propertiesMortgaged
     ***************************************************************************************************************/
    public void setPropertiesMortgaged(ArrayList<OwnableSquare> propertiesMortgaged) {
        this.propertiesMortgaged = propertiesMortgaged;
    }
}
