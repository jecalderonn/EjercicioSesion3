// sujeto concreto
public class MailPromos extends Subject{

    private String podcast;


    public void addPromo(String link){

        this.podcast = link;

        System.out.println("Nueva Promo por los siguientes 2 días");

        this.notifiy();
    }

    public String getPodcast() {
        return podcast;
    }

    @Override
    public void notifiy() {
        observers.forEach(observer -> observer.update(this.podcast));
    }

    public void removeByName(String correo){
        this.removeObserver(observers.stream()
                .filter(observer -> observer instanceof Correo && ((Correo) observer).getCorreo().equals(correo))
                .findFirst()
                .get());
    }

}
