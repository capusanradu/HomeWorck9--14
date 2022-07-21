package HomeWorcks.LaZi.home14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteService {

    List<Quote> quoteList = new ArrayList<>();

    public List<String> getAllQuotes() {
        List<String> allQuatoes = new ArrayList<>();
        for (int i = 0; i < quoteList.size(); i++) {
            allQuatoes.add(quoteList.get(i).getQuote());
        }
        return allQuatoes;
    }

    public List<Quote> getQuotesForAuthour(String author) {
        List<Quote> quotesForAuthor = new ArrayList<>();
        for (int i = 0; i < quoteList.size(); i++) {
            if (quoteList.get(i).getAuthour().equals(author)) {
                quotesForAuthor.add(quoteList.get(i));
            }

        }
        return quotesForAuthor;
    }

    public List<String> getAthours(){
        List<String> authorsList = new ArrayList<>();
        for(int i = 0; i < quoteList.size(); i++){
            authorsList.add(quoteList.get(i).getAuthour());
        }
        return authorsList;
    }

    public void setFavorites(int id){
        for(int i =0; i < quoteList.size(); i++){
            if(quoteList.get(i).getId() == id){
                quoteList.get(i).setFavourite(true);
            }
        }
    }

    public List<Quote> getFavorites(){
        List<Quote> favoriteList = new ArrayList<>();
        for(int i =0; i < quoteList.size(); i++){
            if(quoteList.get(i).isFavourite() == true){
                favoriteList.add(quoteList.get(i));
            }
        }
        return favoriteList;
    }

    public String getRandomQuote(){
        Random random = new Random();
        int a = random.nextInt(quoteList.size());
        String line;
        line = quoteList.get(a).getQuote();
        return line;
    }

}
