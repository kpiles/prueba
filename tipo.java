package pry_prueba_tercer_parcial;
public class tipo {
    private String tipoLacteo;
    private String tipoCereal;
    private String tipoVerduras;

    public tipo(String tipoLacteo, String tipoCereal, String tipoVerduras) {
        this.tipoLacteo = tipoLacteo;
        this.tipoCereal = tipoCereal;
        this.tipoVerduras = tipoVerduras;
    }

    public String getTipoLacteo() {
        return tipoLacteo;
    }

    public void setTipoLacteo(String tipoLacteo) {
        this.tipoLacteo = tipoLacteo;
    }

    public String getTipoCereal() {
        return tipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }

    public String getTipoVerduras() {
        return tipoVerduras;
    }

    public void setTipoVerduras(String tipoVerduras) {
        this.tipoVerduras = tipoVerduras;
    }

    @Override
    public String toString() {
        return "tipo= {" + "tipoLacteo= " + tipoLacteo + ", tipoCereal= " + tipoCereal + ", tipoVerduras= "  + tipoVerduras + '}';
    }
}
