public enum  MxFast {
    SLOW("30 km/h",30),
    NORMAL("90 km/h",90),
    FAST("150 km/h",150)
    ;

    private final String opis;
    private final int v
            ;

    private MxFast(String opis,int v) {
        this.opis = opis;
        this.v =v;
    }

    public int getV() {
        return v;
    }

    public String getOpis() {
        return opis;
    }



    public void printFast(){
        System.out.println(this.opis + " " + v);
    }
}
