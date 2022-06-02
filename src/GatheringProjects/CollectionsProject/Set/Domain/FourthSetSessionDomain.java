package GatheringProjects.CollectionsProject.Set.Domain;

public class FourthSetSessionDomain{
    private String LanguageName;
    private int languageYear;
    private String IntegDevEnviro;


    public FourthSetSessionDomain(String ProgLanguage, int yearCreated, String IDEUsed) {
        this.LanguageName = ProgLanguage;
        this.languageYear = yearCreated;
        this.IntegDevEnviro = IDEUsed;
    }

    @Override
    public String toString() {
        return "FourthSetSessionDomain{" +
                "LanguageName='" + LanguageName + '\'' +
                ", languageYear=" + languageYear +
                ", IntegDevEnviro='" + IntegDevEnviro + '\'' +
                '}';
    }

    public String getLanguageName() {
        return LanguageName;
    }

    public void setLanguageName(String languageName) {
        LanguageName = languageName;
    }

    public int getLanguageYear() {
        return languageYear;
    }

    public void setLanguageYear(int languageYear) {
        this.languageYear = languageYear;
    }

    public String getIntegDevEnviro() {
        return IntegDevEnviro;
    }

    public void setIntegDevEnviro(String integDevEnviro) {
        IntegDevEnviro = integDevEnviro;
    }
}
