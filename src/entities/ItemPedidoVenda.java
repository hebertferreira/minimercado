package entities;

public class ItemPedidoVenda {
	
	private Integer qtde;
	private double preco;
	
	private Produto produto;
	
	public ItemPedidoVenda() {
		
	}
	
	public ItemPedidoVenda(Produto produto, Integer qtde, double preco) {
		this.produto = produto;
		this.qtde = qtde;
		this.preco = preco;
	}

	public Integer getQtde() {
		return qtde;
	}

	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public double subTotal() {
		
		return qtde*preco;
	}
	
	@Override
	public String toString() {
		return getProduto().getNome() + ", R$ " + String.format("%.2f ", preco) + String.format("%d Unidades = ", qtde) + subTotal();
	}
	

}
