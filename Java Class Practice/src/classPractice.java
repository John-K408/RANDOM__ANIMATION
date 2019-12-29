public class classPractice {
    public static void main(String[]args){
        Aircraft cessna172 = new Aircraft(4,130,56.5,9.5); // creates a new object of type aircraft. The name of the particular object
                                             //is Cessna172.
        //Aircraft piperSaratoga = new Aircraft();//creates a new object of type aircraft whose name is piperSaratoga.
        //Now, we have to tell each aircraft's number of passengers, cruisespeed, fuelcapacity, etc, To do that, call the
        //object, put a dot and type the parameter to assign a value.
       /* cessna172.passenger = 4;
        cessna172.cruiseSpeed = 130;
        cessna172.fuelCapacity = 56.5;
        cessna172.fuelBurnRate = 9.5;*/
        /*Instead of doing the above, we could also create a constructor in the class below that helps us pass the values for
        the variables in a particular object directly. A constructor method should have the same name as the class.
        */

        cessna172.calculateEndurance();



    }
}

class Aircraft{
    //NB: Instance variables are never labelled as static
    int passenger;         //people
    int cruiseSpeed;       //miles per hour
    double fuelCapacity;   //gallons
    double fuelBurnRate;   //gallons per hour
    Aircraft(int p, int c, double fc, double fbr){
        passenger =  p;
        cruiseSpeed = c;
        fuelCapacity = fc ;
        fuelBurnRate = fbr ;
    }
    //Method to calculate aircraft's endurance
    void calculateEndurance(){
        double endurance = fuelCapacity/fuelBurnRate;
        System.out.println(" The endurance of This aircraft is :" + endurance);
        /*
        We use dots when we want to specify something from a particular object. As at when we are writing the method for the
endurance calculation, we haven't specified any object yet. We are just using the template to perform computations. As
such, there is no need to use a dot. You just call the variable you want to use in your computation since they are in the
same class.
         */
    }

}
/*
-NB: The class aircraft is just a template for creating an object of a particular type (the type being the name of the
class).Memory is only allocated to the object when you create it in the main statement. So if I want to create
an aircraft,just as I will specify the type of variable I am creating when creating a variable, ( as in, int or double),
I will specify the type of object I am creating which in this case, is an aeroplane
- When you put a return statement somewhere in a method, when the program gets to the return statement, it stops and
 goes back to where the method was called was called.So anything directly below a return statement in a particular
 method never runs.
*/