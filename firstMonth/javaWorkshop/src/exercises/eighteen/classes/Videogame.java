package exercises.eighteen.classes;

import exercises.eighteen.interfaces.Delivered;

public class Videogame implements Delivered<Videogame> {
    private String title;
    private String gender;
    private String company;
    private Integer estimatedTime = 10;
    private Boolean isDelivered = false;


    public Videogame() {
    }

    public Videogame(String title, Integer estimatedTime) {
        this.title = title;
        this.estimatedTime = estimatedTime;
    }

    public Videogame(String title, String gender, String company, Integer estimatedTime) {
        this.title = title;
        this.gender = gender;
        this.company = company;
        this.estimatedTime = estimatedTime;
    }

    @Override
    public String toString() {
        return "Videogame{" +
                "title='" + title + '\'' +
                ", gender='" + gender + '\'' +
                ", company='" + company + '\'' +
                ", estimatedTime=" + estimatedTime +
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(Integer estimatedTime) {
        this.estimatedTime = estimatedTime;
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
    public void compareTo(Videogame videogame) {
        System.out.println(this.title + "has around" + this.estimatedTime + " hours");
        System.out.println(videogame.getTitle() + "has around " + videogame.getEstimatedTime() + " hours");
    }
}
