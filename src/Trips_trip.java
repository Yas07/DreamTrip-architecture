

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.util.Date;

class Trips_trip{
    private String title;
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

    public Trips_trip(String title, Date startDate, Date endDate, Color textColor) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.textColor = textColor;
    }

    public Trips_trip(String title, Date startDate, Date endDate,
                      ImageView headerImage, ImageView mainImage,
                      Color textColor) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.headerImage = headerImage;
        this.mainImage = mainImage;
        this.textColor = textColor;

        //this.packlist = packlist;
        //this.travelbook = new Travelbook(title);
        //this.plan = new Plan();
    }

    public Date getStartDate() {
        return startDate;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Trips_trip{" +
                "\ntitle='" + title + '\'' +
                ", \nstartDate=" + startDate +
                ", \nendDate=" + endDate +
                ", \ntextColor=" + textColor +
                "}\n";
    }
}

