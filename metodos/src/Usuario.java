public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTV smartTV = new SmartTV();

        System.out.println("TV está ligada: " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar();

        System.out.println("Estado da TV: " + smartTV.ligada);

        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.diminuirCanal();

        System.out.println("Canal atual: " + smartTV.canal);
        
        smartTV.mudarCanal(40);
        System.out.println("Canal atual: " + smartTV.canal);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();

        System.out.println("Volume atual: " + smartTV.volume);
    }
}
