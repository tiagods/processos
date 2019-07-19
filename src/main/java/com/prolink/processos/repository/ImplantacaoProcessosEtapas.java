package com.prolink.processos.repository;

import com.prolink.processos.model.Departamento;
import com.prolink.processos.model.implantacao.ImplantacaoProcesso;
import com.prolink.processos.model.implantacao.ImplantacaoProcessoEtapa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImplantacaoProcessosEtapas extends JpaRepository<ImplantacaoProcessoEtapa,Long> {
    @Query("select count(p) from ImplantacaoProcessoEtapa as p " +
            "where p.processo=:processo and p.etapa.departamento=:departamento " +
            "and p.status='ABERTO' and p.processo.finalizado=false")
    long contarAbertosPorDepartamento(ImplantacaoProcesso processo, Departamento departamento);

    @Query("SELECT a FROM ImplantacaoProcessoEtapa AS a " +
            "WHERE a.processo.finalizado=FALSE AND a.status='ABERTO'")
    List<ImplantacaoProcessoEtapa> listarEtapas();
}
