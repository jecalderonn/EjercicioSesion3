public class Correo implements Observer{
    private String correo;


    public Correo(String correo) {
        this.correo = correo;
    }

    @Override
    public void update(String param) {
        System.out.println(correo + ": New podcast has been published, go to: " + param);
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString() {
        return "Correo{" +
                "correo='" + correo + '\'' +
                '}';
    }
}
