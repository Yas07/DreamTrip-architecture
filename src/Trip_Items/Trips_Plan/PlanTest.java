package Trip_Items.Trips_Plan;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class PlanTest {

    @AfterEach
    void tearDown() {
    }

    @Test
    void plan() {
        Plan plan = new Plan();

        PlanPoint planPoint1 = new PlanPoint("Cafe", null, null,
                null, null, "At puzata hata");
        planPoint1.setTime(2018, 4, 22, 18, 55);

        PlanPoint planPoint2 = new PlanPoint("Cafe", null, null,
                null, null, "At puzata hata");
        planPoint2.setTime(2017, 4, 22, 18, 55);

        PlanPoint planPoint3 = new PlanPoint("Cafe", null, null,
                null, null, "At puzata hata");
        planPoint3.setTime(2018, 3, 22, 16, 30);

        plan.put(planPoint1);
        plan.put(planPoint2);
        plan.put(planPoint3);

        // check is values are sorted properly
        {
            Collection<PlanPoint> c = plan.values();
            Calendar cal = Calendar.getInstance();
            cal.set(0, 0,0, 0, 0);
            for (PlanPoint i : c) {
                assertTrue(cal.compareTo(i.getCalendar()) < 0);
                cal  = i.getCalendar();
                System.out.println(cal.getTime());
            }
        }
    }
}