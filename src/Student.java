import java.util.ArrayList;

public class Student {
    private String ime;
    private String prezime;
    private int brojIndeksa;
    private int upisaniSemestar;
    private ArrayList<Predmet> predmeti=new ArrayList<Predmet>();
    private int ukupnoEcts=0;
    private Student()

    public Student( String me,String  prezime, int upisaniSemestar,ArrayList<Predmet> predmeti){}

    public String getIme() {
        return ime;
    }


    public void setIme(String ime) {
        this.ime = ime;
    }


    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }


    public ArrayList<Predmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(ArrayList<Predmet> predmeti) {
        this.predmeti = predmeti;
    }


    public int getUkupnoEcts() {
        return ukupnoEcts;
    }

    public void setUkupnoEcts(int ukupnoEcts) {
        this.ukupnoEcts = ukupnoEcts;
    }

    private Student() {
    }
}
