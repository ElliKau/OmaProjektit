package ERP_Example.model;

public class Varasto {
    private String nimi;
    private static Varasto myVarasto = null;

    private Varasto() {
    }

    private Varasto(String nimi) {
        this.nimi = nimi;
    }


    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    // Singleton-malli
    //jokaista oliota vaan yksi kappale
    public static Varasto getVarasto(String nimi){
        if ( myVarasto == null){
            myVarasto = new Varasto(nimi);
        }
        return myVarasto;
    }


}
