package GatheringProjects.CollectionsProject.Set.Domain;

import java.util.Objects;

public class SecondSetSessionDomain implements Comparable<SecondSetSessionDomain> {
    private String NameShow;
    private String Genre;
    private int episodeTime;


    public SecondSetSessionDomain(String NameShow, String GenreShow, int episodeShowTime){
        this.NameShow = NameShow;
        this.Genre = GenreShow;
        this.episodeTime = episodeShowTime;
    }

    @Override
    public String toString() {
        return "SecondSetSessionDomain{" +
                "NameShow='" + NameShow + '\'' +
                ", Genre='" + Genre + '\'' +
                ", episodeTime=" + episodeTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SecondSetSessionDomain that = (SecondSetSessionDomain) o;
        return episodeTime == that.episodeTime && NameShow.equals(that.NameShow) && Genre.equals(that.Genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NameShow, Genre, episodeTime);
    }

    public String getNameShow() {
        return NameShow;
    }

    public void setNameShow(String nameShow) {
        NameShow = nameShow;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public int getEpisodeTime() {
        return episodeTime;
    }

    public void setEpisodeTime(int episodeTime) {
        this.episodeTime = episodeTime;
    }

    @Override
    public int compareTo(SecondSetSessionDomain serie) {
        return Integer.compare(this.getEpisodeTime(), serie.getEpisodeTime());
    }
}

