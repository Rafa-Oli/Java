package ObserverPadroes;

public class AniversarioSurpresa {
public static void main(String[] args) {
	Namorada namorada= new Namorada();
	Porteiro porteiro= new Porteiro();
	porteiro.registrarObservador(namorada);
	
	
	//utilizando lambda
	porteiro.registrarObservador(e -> System.out.println("Surpresa via lambda"));
	
	porteiro.monitorar();
	
}
}
