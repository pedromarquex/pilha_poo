package pilha;

public class Pilha {
	Node pilha = null;

	public void push(int info) {
		if (pilha == null) {
			pilha = new Node();
			pilha.setInfo(info);
			pilha.setAnt(null);
		} else {
			Node aux = new Node();
			aux.setInfo(info);
			aux.setAnt(pilha);
			pilha = aux;
		}
	}

	public void pop() {
		if (pilha == null) {
			pilha = null;
		} else if (pilha.getAnt() == null) {
			pilha = null;
		} else {
			pilha = pilha.getAnt();
		}
	}

	public Node topo() {
		if (pilha == null) {
			return null;
		} else {
		return pilha;
		}
	}
}
