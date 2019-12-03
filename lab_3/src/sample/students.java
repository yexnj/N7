package sample;

public class students implements Cloneable {
    public String name;
    public int age;
    public String gruppa;
    public int kurs;
    public String kurator;
    public double sredniyball;
    public double[] zachotka;
    !!!//короче в этой зачетке надо нахуярить всяких оценочек и добавить возможность редактировать их спс
    //всю эту инфу затолкать в контрол.информ
    //продублируй эту контрол.информ кнопку только в дубликате добавь как раз таки возможность изменять информацию
    //у меня типо прога как для студента так и для деканата спс только вот я не реализовала еще разный вход
    //поэтому пускай будет еще одна кнопка


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
