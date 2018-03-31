package Trip_Items.Trips_Plan;

import Trip_Items.Places.Place;

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.sql.Time;
import java.text.DateFormat;
import java.util.Date;

public class PlanPoint implements Comparable {

    private String          _title;
    private Color           _colorBlock;
    private ImageView       _icon;
    private Place           _place;
    private Date            _date;
    private Time            _time;
    private String          _otherDetails;

    public PlanPoint(String _title, Color _colorBlock,
                     ImageView _icon, Place _place,
                     Date _date, Time _time, String _otherDetails) {
        this._title = _title;
        this._colorBlock = _colorBlock;
        this._icon = _icon;
        this._place = _place;
        this._date = _date;
        this._time = _time;
        this._otherDetails = _otherDetails;
    }


    @Override
    public int compareTo(Object o) {
        PlanPoint p = (PlanPoint)o;
        int result = _date.compareTo(p._date);
        if (result != 0) {
            return result;
        } else {
            return _time.compareTo(p._time);
        }
    }
}
