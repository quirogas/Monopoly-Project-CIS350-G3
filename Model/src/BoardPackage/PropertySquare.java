package BoardPackage;

import GamePackage.Player;

/********************************************************************
 * The PropertySquare class is a BoardSquare class that defines the
 * BoardSquares that are properties. It tracks variables related to
 * properties such as the price of purchase and the rent cost of
 * landing on this BoardSquare.
 *
 * @author David Baas
 * @version 2/11/2018
 ********************************************************************/
public class PropertySquare extends BoardSquare{

    /**An int to hold the price of the property*/
    private final int price;

    /**An int to hold the property's mortgage value*/
    private final int mortgageValue;

    /**An int to hold the cost of rent w/ no houses.*/
    private final int baseRent;

    /**An int to hold the cost of rent w/ one house*/
    private final int oneHouseRent;

    /**An int to hold the cost of rent w/ two houses*/
    private final int twoHouseRent;

    /**An int to hold the cost of rent w/ three houses*/
    private final int threeHouseRent;

    /**An int to hold the cost of rent w/ four houses*/
    private final int fourHouseRent;

    /**An int to hold the cost of rent w/ a hotel*/
    private final int hotelRent;

    /**An int to track how many houses are on the property*/
    private int numHouses;

    /**A boolean flag to track if the property is mortgaged*/
    private boolean isMortgaged;

    /**A Player variable to track what player owns this property*/
    private Player owner;

    /**An int to track the cost of purchasing one house for this property*/
    private final int houseCost;

    /**An int to track the cost of purchasing one hotel for this property*/
    private final int hotelCost;

    /******************************************************************
     * The constructor creates a Property and sets all the attributes
     * related to the property.
     * @param name the name of the PropertySquare
     * @param price the price of the property
     * @param mortgageValue The mortgage value of the property.
     * @param baseRent The rent cost of the property.
     * @param oneHouseRent The rent cost of the property w/ one house.
     * @param twoHouseRent The rent cost of the property w/ two houses.
     * @param threeHouseRent The rent cost of the property w/ three houses.
     * @param fourHouseRent The rent cost of the property w/ four houses.
     * @param hotelRent The rent cost of the property w/ a hotel.
     * @param numHouses The number of houses on the property.
     * @param houseCost The cost of adding a house to the property.
     * @param hotelCost The cost of adding a hotel to the property.
     *****************************************************************/
    public PropertySquare(String name, int price, int mortgageValue,
                          int baseRent, int oneHouseRent,
                          int twoHouseRent, int threeHouseRent,
                          int fourHouseRent, int hotelRent,
                          int numHouses, int houseCost,
                          int hotelCost) {
        super(name);

        this.price = price;
        this.mortgageValue = mortgageValue;

        this.baseRent = baseRent;
        this.oneHouseRent = oneHouseRent;
        this.twoHouseRent = twoHouseRent;
        this.threeHouseRent = threeHouseRent;
        this.fourHouseRent = fourHouseRent;
        this.hotelRent = hotelRent;

        this.numHouses = numHouses;
        isMortgaged = false;
        owner = null;


        this.houseCost = houseCost;
        this.hotelCost = hotelCost;
    }

    /******************************************************************
     * The getPrice method returns the price of this property.
     *
     * @return the price of the property.
     *****************************************************************/
    public int getPrice() {
        return price;
    }

    /******************************************************************
     * The getMortgageValue method returns the value of mortgaging
     * this property.
     *
     * @return the mortgage value of the property.
     *****************************************************************/
    public int getMortgageValue() {
        return mortgageValue;
    }

    /******************************************************************
     * The getBaseRent method returns the cost of rent for this property
     *
     * @return The base rent of the property.
     *****************************************************************/
    public int getBaseRent() {
        return baseRent;
    }

    /******************************************************************
     * The getOneHouseRent method returns the cost of rent with one
     * house on the property.
     *
     * @return oneHouseRent The cost of rent w/ one house on the
     * property.
     *****************************************************************/
    public int getOneHouseRent() {
        return oneHouseRent;
    }

    /******************************************************************
     * The getTwoHouseRent method returns the cost of rent with two
     * houses on the property.
     *
     * @return twoHouseRent The cost of rent w/ two houses on the
     * property.
     *****************************************************************/
    public int getTwoHouseRent() {
        return twoHouseRent;
    }

    /******************************************************************
     * The getThreeHouseRent method returns the cost of rent with three
     * houses on the property.
     *
     * @return threeHouseRent The cost of rent w/ three houses on the
     * property.
     *****************************************************************/
    public int getThreeHouseRent() {
        return threeHouseRent;
    }

    /******************************************************************
     * The getFourHouseRent method returns the cost of rent with four
     * houses on the property.
     *
     * @return fourHouseRent The cost of rent w/ three houses on the
     * property.
     *****************************************************************/
    public int getFourHouseRent() {
        return fourHouseRent;
    }

    /******************************************************************
     * The getHotelRent method returns the cost of rent with a hotel
     * on the property.
     *
     * @return hotelRent The cost of rent w/ three houses on the
     * property.
     *****************************************************************/
    public int getHotelRent() {
        return hotelRent;
    }

    /******************************************************************
     * The getNumHouses method returns how many houses are on this
     * property.
     *
     * @return numHouses the number of houses on the property.
     *****************************************************************/
    public int getNumHouses() {
        return numHouses;
    }

    /******************************************************************
     * The setNumHouses method sets the number of houses on the
     * property.
     *
     * @param numHouses the number of houses for this property.
     *****************************************************************/
    public void setNumHouses(int numHouses) {
        this.numHouses = numHouses;
    }

    /******************************************************************
     * The isMortgaged method returns weather the property is
     * mortgaged or not.
     *
     * @return true if the property is mortgaged, false otherwise.
     *****************************************************************/
    public boolean isMortgaged() {
        return isMortgaged;
    }

    /******************************************************************
     * The setMortgaged method sets the mortgage flag.
     *
     * @param mortgaged the mortgage status this property is being set
     *                  to.
     *****************************************************************/
    public void setMortgaged(boolean mortgaged) {
        isMortgaged = mortgaged;
    }

    /******************************************************************
     * The getOwner method returns the Player who owns this property or
     * null if the bank owns the property.
     *
     * @return owner the Player who owns the property or null if the
     * bank owns the property.
     *****************************************************************/
    public Player getOwner() {
        return owner;
    }

    /******************************************************************
     * The setOwner method sets the Player who owns this property.
     * set the input to null if the bank should own the property.
     *
     * @param owner the Player who will own the property.
     *****************************************************************/
    public void setOwner(Player owner) {
        this.owner = owner;
    }

    /******************************************************************
     * The getHouseCost method returns the cost of purchasing a house
     * on this property.
     *
     * @return houseCost the cost of purchasing a house on this property.
     *****************************************************************/
    public int getHouseCost() {
        return houseCost;
    }

    /******************************************************************
     * The getHotelCost method returns the cost of purchasing a Hotel
     * on this property.
     *
     * @return hotelCost the cost of purchasing a Hotel on this property.
     *****************************************************************/
    public int getHotelCost() {
        return hotelCost;
    }
}
