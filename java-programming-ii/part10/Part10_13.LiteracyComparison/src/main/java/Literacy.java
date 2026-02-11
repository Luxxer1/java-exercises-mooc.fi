public class Literacy implements Comparable<Literacy> {
    private String sex;
    private String country;
    private int year;
    private Double literacyPercent;

    public Literacy(String sex, String country, int year, Double literacyPercent) {
        this.sex = sex;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }

    public double getLiteracyPercent() {
        return literacyPercent;
    }

    @Override
    public String toString() {
        return country + " (" + year + "), " + sex + ", " + literacyPercent;
    }

    @Override
    public int compareTo(Literacy literacy) {
        return Double.compare(getLiteracyPercent(), literacy.getLiteracyPercent());
    }
}
