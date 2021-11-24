import java.util.ArrayList;


public class Predmet {
    private String naziv;
  private boolean obavezni;
   private int ectsKredit;
  private ArrayList<Student> upisaniStudenti=new ArrayList<>();
  private Predmet();

  public Predmet(String naziv, int ECTS, boolean obavezni){}
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getEctsKredit() {
        return ectsKredit;
    }

    public void setEctsKredit(int ectsKredit) {
        this.ectsKredit = ectsKredit;
    }

    public boolean isObavezni() {
        return obavezni;
    }

    public void setObavezni(boolean obavezni) {
        this.obavezni = obavezni;
    }

    public ArrayList<Student> getUpisaniStudenti() {
        return upisaniStudenti;
    }

    public void setUpisaniStudenti(ArrayList<Student> upisaniStudenti) {
        this.upisaniStudenti = upisaniStudenti;
    }
    void ispisiStudentaSaPredmeta(Student s, Predmet p){}
    void dodajStudenta(Student s){}
}
