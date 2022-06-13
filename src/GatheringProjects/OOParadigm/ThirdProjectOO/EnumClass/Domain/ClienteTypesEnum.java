package GatheringProjects.OOParadigm.ThirdProjectOO.EnumClass.Domain;

public enum ClienteTypesEnum {
    PESSOA_JURIDICA (0, "My history"),
    PESSOA_FISICA (1, "My perspective");

    private int indexForKind;
    private String resumeTitle;

    ClienteTypesEnum(int indexForKind, String resumeTitle) {
        this.indexForKind = indexForKind;
        this.resumeTitle = resumeTitle;
    }

    public static ClienteTypesEnum checkTitleResume(String TitleDesired){
        for(ClienteTypesEnum Title : values()){
            if(Title.getResumeTitle().equalsIgnoreCase(TitleDesired)){
                return Title;
            }
        }
        return null;
    }

    public int getIndexForKind() {
        return indexForKind;
    }

    public String getResumeTitle() {
        return resumeTitle;
    }
}
