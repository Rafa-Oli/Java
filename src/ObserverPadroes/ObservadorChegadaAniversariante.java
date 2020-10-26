package ObserverPadroes;
//so tem um unico metodo, pode ser uma interface funcional

@FunctionalInterface
public interface ObservadorChegadaAniversariante {
 public void chegou(EventoChegadaAniversariante evento);
}
