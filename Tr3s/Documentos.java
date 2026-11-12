package Tr3s;

public class Documentos {

    String archivo;
    String Usuario;
    int hojas=0;

    public Documentos()
    {

    }
    public Documentos(String archivo,String Usuario, int hojas) {
        this.archivo = archivo;
        this.Usuario = Usuario;
        this.hojas = hojas;
    }
    public String getArchivo()
    {
        return archivo;
    }
    public void setArchivo(String archivo)
    {
        this.archivo = archivo;
    }
    public String getUsuario()
    {
        return Usuario;
    }
    public void setUsuario(String usuario)
    {
        Usuario = usuario;
    }
    public int getHojas()
    {
        return hojas;
    }
    public void setHojas(int hojas)
    {
        this.hojas = hojas;
    }

    @Override
    public String toString() {
        return "archivo= '" + archivo + '\'' + ", Usuario='" + Usuario + '\'' + ", hojas=" + hojas;
    }
}
