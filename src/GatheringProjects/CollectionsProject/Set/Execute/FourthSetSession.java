package GatheringProjects.CollectionsProject.Set.Execute;

/*
    Make a program that contains multiple programing languages with attributes and, then make this program organize the whole elements based in
    different attributes such as name, year, IDE, etc.
 */

import GatheringProjects.CollectionsProject.Set.Domain.FourthSetSessionDomain;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class FourthSetSession {
    public static void main(String[] args) {
        Set<FourthSetSessionDomain> favoriteLanguages = new LinkedHashSet<>();
        favoriteLanguages.add(new FourthSetSessionDomain("Java",1995, "IntelliJ"));
        favoriteLanguages.add(new FourthSetSessionDomain("Python", 1991, "VS Code"));
        favoriteLanguages.add(new FourthSetSessionDomain("C++",1998, "Eclipse"));

        System.out.println("The order of insertion is exactly: ");
        for(FourthSetSessionDomain languageDescriptions : favoriteLanguages){
            System.out.println("Language: "+languageDescriptions.getLanguageName()+"\nYear: "+languageDescriptions.getLanguageYear()+"\nIDE: "+languageDescriptions.getIntegDevEnviro()+"\n=======================================");
        }

        System.out.println("Above, we'll use the year as a parameter to compare between every language inside this list");
        Set<FourthSetSessionDomain> languagesNameOrder = new TreeSet<>(favoriteLanguages);
        for(FourthSetSessionDomain languageOrderIterator : languagesNameOrder){
            System.out.println("Language: "+languageOrderIterator.getLanguageName()+"\nYear: "+languageOrderIterator.getLanguageYear()+"\nIDE: "+languageOrderIterator.getIntegDevEnviro()+"\n=======================================");
        }
    }
}
