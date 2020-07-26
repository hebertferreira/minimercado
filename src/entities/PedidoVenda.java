package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.PedidoStatus;

public class PedidoVenda {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataCriacao;
	private PedidoStatus status;
	
	private Cliente cliente;
	
	private List<ItemPedidoVenda> itempedidovenda = new ArrayList<ItemPedidoVenda>();
	
	public PedidoVenda() {
		
	}

	public PedidoVenda(Date dataCriacao, PedidoStatus status, Cliente cliente) {
		this.dataCriacao = dataCriacao;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public PedidoStatus getStatus() {
		return status;
	}

	public void setStatus(PedidoStatus status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void adicionarItemPedido(ItemPedidoVenda item) {
		itempedidovenda.add(item);
	}

	public void removeItemPedido(ItemPedidoVenda item) {
		itempedidovenda.remove(item);
	}
	
	public double total() {
		
		double soma = 0.00;
		
		for(ItemPedidoVenda it : itempedidovenda) {
			soma = soma + it.subTotal();
		}
		return soma;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Data Criacao: ");
		sb.append(sdf.format(dataCriacao)+"\n");
		sb.append("Status Pedido: ");
		sb.append(status+"\n");
		sb.append("Cliente: ");
		sb.append(cliente+"\n");
		sb.append("Itens do Pedido: \n");
		for(ItemPedidoVenda item : itempedidovenda) {
			sb.append(item+"\n");
		}
		sb.append("Total do Pedido: R$ ");
		sb.append(String.format("%.2f",total()));
		
		return sb.toString();
		
	}
}
