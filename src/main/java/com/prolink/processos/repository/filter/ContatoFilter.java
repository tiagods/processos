package com.prolink.processos.repository.filter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.prolink.processos.model.negocio.Contato.ContatoTipo;
import com.prolink.processos.model.negocio.Contato.PessoaTipo;
import com.prolink.processos.model.negocio.NegocioCategoria;
import com.prolink.processos.model.negocio.NegocioLista;
import com.prolink.processos.model.negocio.NegocioMalaDireta;
import com.prolink.processos.model.negocio.NegocioNivel;
import com.prolink.processos.model.negocio.NegocioOrigem;
import com.prolink.processos.model.negocio.NegocioServico;
import com.prolink.processos.model.Usuario;

public class ContatoFilter {
	private PessoaTipo pessoaTipo;
	private ContatoTipo contatoTipo;
	private NegocioLista lista;
	private NegocioCategoria categoria;
	private NegocioMalaDireta malaDireta;
	private NegocioNivel nivel;
	private NegocioOrigem origem;
	private NegocioServico servico;
	private Usuario atendente;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Calendar dataInicial;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Calendar dataFinal;
	
	private String dtInicial;
	private String dtFinal;
	
	private String nome;
	/**
	 * @return the pessoaTipo
	 */
	public PessoaTipo getPessoaTipo() {
		return pessoaTipo;
	}
	/**
	 * @param pessoaTipo the pessoaTipo to set
	 */
	public void setPessoaTipo(PessoaTipo pessoaTipo) {
		this.pessoaTipo = pessoaTipo;
	}
	/**
	 * @return the contatoTipo
	 */
	public ContatoTipo getContatoTipo() {
		return contatoTipo;
	}
	/**
	 * @param contatoTipo the contatoTipo to set
	 */
	public void setContatoTipo(ContatoTipo contatoTipo) {
		this.contatoTipo = contatoTipo;
	}
	/**
	 * @return the lista
	 */
	public NegocioLista getLista() {
		return lista;
	}
	/**
	 * @param lista the lista to set
	 */
	public void setLista(NegocioLista lista) {
		this.lista = lista;
	}
	/**
	 * @return the categoria
	 */
	public NegocioCategoria getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(NegocioCategoria categoria) {
		this.categoria = categoria;
	}
	/**
	 * @return the malaDireta
	 */
	public NegocioMalaDireta getMalaDireta() {
		return malaDireta;
	}
	/**
	 * @param malaDireta the malaDireta to set
	 */
	public void setMalaDireta(NegocioMalaDireta malaDireta) {
		this.malaDireta = malaDireta;
	}
	/**
	 * @return the nivel
	 */
	public NegocioNivel getNivel() {
		return nivel;
	}
	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(NegocioNivel nivel) {
		this.nivel = nivel;
	}
	/**
	 * @return the origem
	 */
	public NegocioOrigem getOrigem() {
		return origem;
	}
	/**
	 * @param origem the origem to set
	 */
	public void setOrigem(NegocioOrigem origem) {
		this.origem = origem;
	}
	/**
	 * @return the servico
	 */
	public NegocioServico getServico() {
		return servico;
	}
	/**
	 * @param servico the servico to set
	 */
	public void setServico(NegocioServico servico) {
		this.servico = servico;
	}
	/**
	 * @return the atendente
	 */
	public Usuario getAtendente() {
		return atendente;
	}
	/**
	 * @param atendente the atendente to set
	 */
	public void setAtendente(Usuario atendente) {
		this.atendente = atendente;
	}
	/**
	 * @return the dataInicial
	 */
	public Calendar getDataInicial() {
		return this.dataInicial;
		//return parse(dataInicial,dtInicial);
	}
	
	private Calendar parse(Calendar calendar, String valor) {
		try {
			Date data = new SimpleDateFormat("dd/MM/yyyy").parse(valor);
			calendar = Calendar.getInstance();
			calendar.setTime(data);
			return calendar;
		} catch (ParseException |NullPointerException e) {
			return null;
		}
	}
	/**
	 * @param dataInicial the dataInicial to set
	 */
	public void setDataInicial(Calendar dataInicial) {
		this.dataInicial = dataInicial;
	}
	/**
	 * @return the dataFinal
	 */
	public Calendar getDataFinal() {
		return this.dataFinal;
		//return parse(dataFinal,dtFinal);
	}
	/**
	 * @param dataFinal the dataFinal to set
	 */
	public void setDataFinal(Calendar dataFinal) {
		this.dataFinal = dataFinal;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the dtInicial
	 */
	public String getDtInicial() {
		return dtInicial;
	}
	/**
	 * @param dtInicial the dtInicial to set
	 */
	public void setDtInicial(String dtInicial) {
		this.dtInicial = dtInicial;
	}
	/**
	 * @return the dtFinal
	 */
	public String getDtFinal() {
		return dtFinal;
	}
	/**
	 * @param dtFinal the dtFinal to set
	 */
	public void setDtFinal(String dtFinal) {
		this.dtFinal = dtFinal;
	}		
}
