
/*
 *COMP 1020		SECTION A03
 *INSTRUCTOR:	Dr. Andrea Bunt
 *NAME:			Raj Rathod
 *ASSIGNMENT:	Assignment 4
 *QUESTION:		Phase 3
 *PURPOSE:		This program will create a linked list
 */public class CarNode {
    private Car data;
    private CarNode link;

    //constructor
    public CarNode(Car initData, CarNode initLink)
    {
        data = initData;
        link = initLink;
    }

    //this will return the data
    public Car getData()
    {
        return data;
    }

    //tis will return the link of the data
    public CarNode getLink()
    {
        return link;
    }

    //this will set the data of the car
    public void setData(Car data)
    {
        this.data = data;
    }


    //this method will set the link of the node
    public void setLink(CarNode link)
    {
        this.link = link;
    }
}
