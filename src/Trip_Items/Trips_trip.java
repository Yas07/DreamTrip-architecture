package Trip_Items;

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.util.Date;
import Trip_DBs.DB_Item;

public class Trips_trip extends DB_Item implements Comparable {
    private Date startDate;
    private Date endDate;
    private ImageView headerImage;
    private ImageView mainImage;
    private Color textColor;

//    private Plan plan;
//    private Places_DB places;
//    private TravelBook travelbook;
//    private PackList packList;


    public Trips_trip(){

    }

    public Trips_trip(String name, Date startDate, Date endDate, Color textColor) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.textColor = textColor;
    }

    public Trips_trip(String name, Date startDate, Date endDate,
                      ImageView headerImage, ImageView mainImage,
                      Color textColor) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.headerImage = headerImage;
        this.mainImage = mainImage;
        this.textColor = textColor;

        //this.packlist = packlist;
        //this.travelbook = new Travelbook(name);
        //this.plan = new Plan();
    }

    public Date getStartDate() {
        return startDate;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Trip_Items.Trips_trip{" +
                "\nname='" + name + '\'' +
                ", \nstartDate=" + startDate +
                ", \nendDate=" + endDate +
                ", \ntextColor=" + textColor +
                "}\n";
    }

    @Override
    public int compareTo(Object o) {
        return name.compareTo((String)o);
    }
}

