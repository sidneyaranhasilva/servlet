package br.com.sidney.dao;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import br.com.sidney.modelo.Contato;

public class JDBCInsere {

	public static void main(String[] args) throws SQLException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		ContatoDao dao = new ContatoDao();
		List<Contato> contatos = dao.getLista();
		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Data de Nascimento: "
					+ sdf.format(contato.getDataNascimento().getTime()) + "\n");
		}

		System.out.println("-------------por nome--------------");

		List<Contato> contatosNome = dao.getListaByNome("C");
		for (Contato contato : contatosNome) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Data de Nascimento: "
					+ sdf.format(contato.getDataNascimento().getTime()) + "\n");
		}

		System.out.println("-------------por id--------------");

		List<Contato> contatosId = dao.getListaById(3L);
		for (Contato contato : contatosId) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Data de Nascimento: "
					+ sdf.format(contato.getDataNascimento().getTime()) + "\n");
			
			
			
		}

	}
}
