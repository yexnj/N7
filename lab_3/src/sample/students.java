package sample;

public class students implements Cloneable {
    public String name;
    public int age;
    public String gruppa;
    public int kurs;
    public String kurator;
    public double sredniyball;
    public double[] zachotka;


    public String getName() { return name; }
    public String getGruppa() { return gruppa; }
    public int getKurs() { return kurs; }
    public int getAge() { return age; }
    public double getSredniyball() { return sredniyball; }
    public String getKurator() { return kurator; }

    public students(String name, int age, String gruppa, int kurs, String kurator,double sredniyball) {
        double s=0;
        //for(int i=0; i<zachotka.length;i++){ s=s+zachotka[i];}
        this.name = name;
        this.age = age;
        this.gruppa = gruppa;
        this.kurs = kurs;
        this.kurator = kurator;
        this.sredniyball = sredniyball;
        //this.sredniyball= s/zachotka.length;
    }
}
