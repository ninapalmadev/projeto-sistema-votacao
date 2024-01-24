package com.betrybe.sistemadevotacao;

import java.util.ArrayList;
/**
 * The type Gerenciamento Votação.
 */

public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  private ArrayList<String> cpfsComputados = new ArrayList<String>();

  /**
   * Cadastra pessoa candidata.
   */
  public void cadastrarPessoaCandidata(String nome, int numero) {

  }

  /**
   * Cadastra pessoa eleitora.
   */
  public void cadastrarPessoaEleitora(String nome, String cpf) {

  }

  /**
   * Votar.
   */

  public void votar(String cpfsComputados, int numeroPessoaCandidata) {

  }

  /**
   * Mostrar Resultado.
   */
  public void mostrarResultado() {

  }
}
