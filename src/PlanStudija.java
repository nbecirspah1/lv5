import java.util.ArrayList;
import java.util.Map;

public class PlanStudija {
    private Map<Integer, ArrayList<Predmet>> obavezniPredmeti;
    private Map<Integer, ArrayList<Predmet>> izborniPredmeti;
    private PlanStudija()

    public Map<Integer, ArrayList<Predmet>> getObavezniPredmeti() {
        return obavezniPredmeti;
    }

    public void setObavezniPredmeti(Map<Integer, ArrayList<Predmet>> obavezniPredmeti) {
        this.obavezniPredmeti = obavezniPredmeti;
    }

    public Map<Integer, ArrayList<Predmet>> getIzborniPredmeti() {
        return izborniPredmeti;
    }

    public void setIzborniPredmeti(Map<Integer, ArrayList<Predmet>> izborniPredmeti) {
        this.izborniPredmeti = izborniPredmeti;
    }
}
