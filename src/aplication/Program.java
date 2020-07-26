package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedidoVenda;
import entities.PedidoVenda;
import entities.Produto;
import entities.enums.PedidoStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Cliente cliente;
		PedidoVenda pedidoVenda;
		
		System.out.print("Insira o nome do cliente: ");
		String nome = sc.nextLine();
		
		System.out.print("Insira o email do cliente: ");
		String email = sc.nextLine();
		
		System.out.print("Insira a data do nascimento do cliente: ");
		String niver = sc.nextLine();
		
		cliente = new Cliente(sdf.parse(niver), nome, email);
		
		System.out.println("--------------------------------------");
		System.out.println(cliente);
		
		System.out.println("Digite o status do pedido de venda");
		PedidoStatus pedidoStatus = PedidoStatus.valueOf(sc.next());
		
		System.out.println("Insira a quantidade de itens do pedido:");
		int np = sc.nextInt();
		
		pedidoVenda = new PedidoVenda(new Date(), pedidoStatus, cliente);
		
		for(int x = 1; x <= np; x++) {
			Produto p;
			ItemPedidoVenda itpv;
						
			System.out.printf("Digite o nome do #%d produto: ", x);
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			
			System.out.printf("Agora digite o valor do #%d produto: ", x);
			Double valorUnitario = sc.nextDouble();
			
			System.out.printf("Agora digite quantidade de  %s colocará na sacola:  ",nomeProduto);
			int qtde = sc.nextInt();
			
			p = new Produto(nomeProduto, valorUnitario);
			itpv = new ItemPedidoVenda(p, qtde, valorUnitario);
			
			pedidoVenda.adicionarItemPedido(itpv);
			
		}
		
			System.out.println("--------------------------------------");
			System.out.println(pedidoVenda);
				
		
		
		sc.close();
	}
}
