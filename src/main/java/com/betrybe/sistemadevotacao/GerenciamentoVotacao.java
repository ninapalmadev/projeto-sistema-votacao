package com.betrybe.sistemadevotacao;

import java.util.ArrayList;
/**
 * The type Gerenciamento Votação.
 */

public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<>();
  private ArrayList<String> cpfsComputados = new ArrayList<>();

  /**
   * Cadastra pessoa candidata.
   */
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      int numeroExiste = pessoaCandidata.getNumero();
      if (numeroExiste == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return;
      }
    }
    PessoaCandidata pessoaCandidata = new PessoaCandidata(nome, numero);
    pessoasCandidatas.add(pessoaCandidata);
  }

  /**
   * Cadastra pessoa eleitora.
   */
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora pessoaEleitora : pessoasEleitoras) {
      String cpfExiste = pessoaEleitora.getCpf();
      if (cpfExiste.equals(cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return;
      }
    }
    PessoaEleitora pessoaEleitora = new PessoaEleitora(nome, cpf);
    pessoasEleitoras.add(pessoaEleitora);
  }

  /**
   * Votar.
   */

  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (cpfsComputados.contains(cpfPessoaEleitora)) {
      System.out.println("Pessoa eleitora já votou!");
    }
    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      if (pessoaCandidata.getNumero() == numeroPessoaCandidata) {
        pessoaCandidata.receberVoto();
      }
    }
    cpfsComputados.add(cpfPessoaEleitora);
  }

  /**
   * Mostrar Resultado.
   */
  public void mostrarResultado() {
    if (cpfsComputados.isEmpty()) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    }

    int porcentagemVotos;
    int totalVotos = cpfsComputados.size();

    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      porcentagemVotos = (pessoaCandidata.getVotos() * 100 / totalVotos);
      System.out.println("Nome: " + pessoaCandidata.getNome() + " - "
          + pessoaCandidata.getVotos() + " votos ( " + porcentagemVotos + "% )");
    }

    System.out.println("Total de votos: " + totalVotos);
  }
}
