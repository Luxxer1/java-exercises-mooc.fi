public class Book {
    private String name;
    private int ageRecommendation;

    public Book(String name, int ageRecommendation) {
        this.name = name;
        this.ageRecommendation = ageRecommendation;
    }

    public String getName() {
        return this.name;
    }

    public int getAgeRecommendation() {
        return this.ageRecommendation;
    }

    @Override
    public String toString() {
       return getName() + "(recommended for " + getAgeRecommendation() + " years-olds or older)";
    }
}
