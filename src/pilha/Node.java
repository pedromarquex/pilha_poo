package pilha;

public class Node {
	private int info;
	private Node ant;

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public Node getAnt() {
		return ant;
	}

	public void setAnt(Node ant) {
		this.ant = ant;
	}
}
