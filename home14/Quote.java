package HomeWorcks.LaZi.home14;

public class Quote {

    private static int id;
    private String Authour;
    private String Quote;
    private boolean favourite;

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public Quote(int id, String authour, String quote) {
        this.id = id;
        Authour = authour;
        Quote = quote;

    }

    public int getId() {
        return id;
    }

    public String getAuthour() {
        return Authour;
    }

    public String getQuote() {
        return Quote;
    }

    public boolean isFavourite() {
        return favourite;
    }
}
