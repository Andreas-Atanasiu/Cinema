package domain;

public class Film {

    private Integer idFilm;
    private String titluFilm;
    private Integer anFilm;
    private double pretFilm;
    private boolean inProgram;

    public Film(Integer idFilm, String titluFilm, Integer anFilm, double pretFilm, boolean inProgram) {
        this.idFilm = idFilm;
        this.titluFilm = titluFilm;
        this.anFilm = anFilm;
        this.pretFilm = pretFilm;
        this.inProgram = inProgram;
    }

    public Integer getIdFilm() {
        return idFilm;
    }

    public String getTitluFilm() {
        return titluFilm;
    }

    public Integer getAnFilm() {
        return anFilm;
    }

    public double getPretFilm() {
        return pretFilm;
    }

    public boolean isInProgram() {
        return inProgram;
    }

    public void setIdFilm(Integer idFilm) {
        this.idFilm = idFilm;
    }

    public void setTitluFilm(String titluFilm) {
        this.titluFilm = titluFilm;
    }

    public void setAnFilm(Integer anFilm) {
        this.anFilm = anFilm;
    }

    public void setPretFilm(double pretFilm) {
        this.pretFilm = pretFilm;
    }

    public void setInProgram(boolean inProgram) {
        this.inProgram = inProgram;
    }

    @Override
    public String toString() {
        return "Film{" +
                "idFilm=" + idFilm +
                ", titluFilm='" + titluFilm + '\'' +
                ", anFilm=" + anFilm +
                ", pretFilm=" + pretFilm +
                ", inProgram=" + inProgram +
                '}';
    }
}