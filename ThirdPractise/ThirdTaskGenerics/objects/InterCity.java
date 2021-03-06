package ThirdPractise.ThirdTaskGenerics.objects;

import ThirdPractise.ThirdTaskGenerics.GeneralClasses.AbstractCarriage;
import ThirdPractise.ThirdTaskGenerics.enums.COMFORT;

public class InterCity extends AbstractCarriage {

    public InterCity(int passengers, int baggage) {
        super(COMFORT.MEDIUM, passengers, baggage);
    }

    @Override
    public String toString() {
        return String.format("This is %s carriage, can handle %d passengers, have %d baggage" +
                " with %s comfortLvl",InterCity.class.getSimpleName(), passengers, baggage, comfortLvl);

    }


}
