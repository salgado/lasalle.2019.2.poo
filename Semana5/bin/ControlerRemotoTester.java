
public class ControlerRemotoTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ControleRemoto controle = new ControleRemoto();
		
		controle.ligar();
		controle.play();
		
		controle.maisVolume();
		controle.play();
		
		controle.pause();
		controle.play();
		
	}

}
