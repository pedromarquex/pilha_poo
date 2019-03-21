package teste;

import org.junit.Assert;
import org.junit.Test;

import pilha.Pilha;

public class TestaPilha {
	@Test
	public void testaPush() {
		Pilha pilha = new Pilha();
		Assert.assertEquals(null, pilha.topo());
		pilha.push(10);
		Assert.assertEquals(10, pilha.topo().getInfo());
		pilha.push(30);
		Assert.assertEquals(30, pilha.topo().getInfo());
	}

	@Test
	public void testaPop() {
		Pilha pilha = new Pilha();
		pilha.pop();
		Assert.assertEquals(null, pilha.topo());
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		Assert.assertEquals(30, pilha.topo().getInfo());
		pilha.pop();
		Assert.assertEquals(20, pilha.topo().getInfo());
		pilha.pop();
		Assert.assertEquals(10, pilha.topo().getInfo());
		pilha.pop();
		Assert.assertEquals(null, pilha.topo());
		pilha.pop();
		Assert.assertEquals(null, pilha.topo());
	}
}
