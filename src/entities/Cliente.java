package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome;
	private String email;
	private Date niver;
	
	
	public Cliente() {
	}


	public Cliente(Date niver, String nome, String email) {
		this.niver = niver;
		this.nome = nome;
		this.email = email;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getNiver() {
		return niver;
	}


	public void setNiver(Date niver) {
		this.niver = niver;
	}
	
	public String toString() {
		
		return "Nome: "+ nome + "(" + String.format(sdf.format(niver)) + ")"+"\nEmail: "+email+"\n";
	}
	

}
