package exercises.eighteen.classes;

import exercises.eighteen.interfaces.Delivered;

public class Serie implements Delivered<Serie> {
    private String title;
    private String gender;
    private String creator;
    private Integer numberOfSeasons = 3;
    private Boolean isDelivered = false;

    public Serie() {
    }

    public Serie(String title, String creator) {
        this.title = title;
        this.creator = creator;
    }

    public Serie(String title, String gender, String creator, Integer numberOfSeasons) {
        this.title = title;
        this.gender = gender;
        this.creator = creator;
        this.numberOfSeasons = numberOfSeasons;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "title='" + title + '\'' +
                ", gender='" + gender + '\'' +
                ", creator='" + creator + '\'' +
                ", numberOfSeasons=" + numberOfSeasons +
                ", isDelivered=" + isDelivered +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Integer getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(Integer numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    @Override
    public void deliver() {
        this.isDelivered = true;
    }

    @Override
    public void refund() {
        this.isDelivered = false;
    }

    @Override
    public boolean isDelivered() {
        return this.isDelivered;
    }

    @Override
    public void compareTo(Serie serie) {
        System.out.println(this.title + "has " + this.numberOfSeasons);
        System.out.println(serie.getTitle() + "has " + serie.getNumberOfSeasons());
    }
}
