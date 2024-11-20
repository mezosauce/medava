package edu.uc.cs3003.medava;

public abstract class Medicine implements Shippable{

    //Private val that is updated from constructor indirectly from user
    private String mMedicineName;
    
    //Constructor
    public Medicine(String medicineName){
        mMedicineName = medicineName;
    }
    
    //Getter 
    public String getMedicineName() {
        return mMedicineName;

      }
      //Logic functionality of Pharmacy simulation
    public boolean isTemperatureRangeAcceptable(Double lowTemperature, Double highTemperature) {
        if (this.minimumTemperature() <= lowTemperature &&
                highTemperature <= this.maximumTemperature()) {
            return true;
        }
        return false;
    }
    //Methods used by function ^^^^^ for the this.function operation
    public double minimumTemperature() {
        return 0.0;
    }

    public double maximumTemperature() {
        return 100.0;
    }
    //TOBE overridden
    public abstract MedicineSchedule getSchedule();
}