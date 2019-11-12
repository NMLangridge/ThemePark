import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark() {
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        // declare a new local Array List of IReviewed to return
        // loop thru all attractions
        // if attraction is an 'instanceof' IReviewed, push to the output ArrayList
        // do the same for Stalls
        // return the result ArrayList

        IReviewed iReviewed = new IReviewed();
        for (IReviewed iReviewed : iReviewed) {
            if (result = (iReviewed));
        }
        return result;
    }

}
