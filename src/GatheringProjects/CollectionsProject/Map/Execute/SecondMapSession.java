package GatheringProjects.CollectionsProject.Map.Execute;
import GatheringProjects.CollectionsProject.Map.Domain.SecondMapSessionDomain;

import java.util.*;

public class SecondMapSession {
    public static void main(String[] args) {
        Map<String, SecondMapSessionDomain> favoriteBooks = new HashMap<>(){{
            put("H.P Lovecraft", new SecondMapSessionDomain("The Call of Ktulu", 450));
            put("Stephen King", new SecondMapSessionDomain("It", 1050));
            put("Tolkien", new SecondMapSessionDomain("Lord of The Rings", 1500));
        }};

        for(Map.Entry<String, SecondMapSessionDomain> eachBook : favoriteBooks.entrySet()){
            System.out.println("Author: "+eachBook.getKey()+"\n Book Description: "+eachBook.getValue().getBookName()+" - "+ eachBook.getValue().getBookPages());
        }
        System.out.println("====================================================");
        Map<String, SecondMapSessionDomain> favoriteBooksInsertOrd = new LinkedHashMap<>(){{
            put("H.P Lovecraft", new SecondMapSessionDomain("The Call of Ktulu", 450));
            put("Stephen King", new SecondMapSessionDomain("It", 1050));
            put("Tolkien", new SecondMapSessionDomain("Lord of The Rings", 1500));
        }};
        for(Map.Entry<String, SecondMapSessionDomain> eachBook : favoriteBooksInsertOrd.entrySet()){
            System.out.println("Author: "+eachBook.getKey()+"\n Book Description: "+eachBook.getValue().getBookName()+" - "+ eachBook.getValue().getBookPages());
        }
        System.out.println("====================================================");
        Map<String, SecondMapSessionDomain> favoriteBooksNameOrd = new TreeMap<>(favoriteBooks);
        for(Map.Entry<String, SecondMapSessionDomain> eachBook : favoriteBooksNameOrd.entrySet()){
            System.out.println("Author: "+eachBook.getKey()+"\n Book Description: "+eachBook.getValue().getBookName()+" - "+ eachBook.getValue().getBookPages());
        }
        System.out.println("====================================================");
        Set<Map.Entry<String, SecondMapSessionDomain>> favoriteBooksTitleOrder = new TreeSet<>(new ComparatorNome());
        favoriteBooksTitleOrder.addAll(favoriteBooks.entrySet());
        for(Map.Entry<String, SecondMapSessionDomain> eachBook : favoriteBooksTitleOrder){
            System.out.println("Author: "+eachBook.getKey()+"\n Book Description: "+eachBook.getValue().getBookName()+" - "+ eachBook.getValue().getBookPages());
        }

    }
}

class ComparatorNome implements Comparator<Map.Entry<String, SecondMapSessionDomain>>{
    @Override
    public int compare(Map.Entry<String, SecondMapSessionDomain> book1, Map.Entry<String, SecondMapSessionDomain> book2) {
        return book1.getValue().getBookName().compareToIgnoreCase(book2.getValue().getBookName());
    }
}
