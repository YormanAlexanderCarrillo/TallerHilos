package co.edu.uptc.Modelo;

public class Shift {
    private static int id =0;
    private String procedure;
    private String idCc;
    public Shift(String procedure,String idCc) {
        this.procedure = procedure;
        this.idCc = idCc;
        id +=1;
    }

    public int getId() {
        return id;
    }
    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public String getIdCc() {
        return idCc;
    }

    public void setIdCc(String idCc) {
        this.idCc = idCc;
    }
}
