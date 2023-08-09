public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int mudarCanal){
        canal = mudarCanal;
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }
}
