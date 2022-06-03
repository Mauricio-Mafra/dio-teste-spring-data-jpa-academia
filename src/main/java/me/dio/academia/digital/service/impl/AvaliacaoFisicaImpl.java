package me.dio.academia.digital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;
import me.dio.academia.digital.repository.AvaliacaoFisicaRepository;
import me.dio.academia.digital.service.IAvaliacaoFisicaService;

public class AvaliacaoFisicaImpl implements IAvaliacaoFisicaService{

    @Autowired
    private AvaliacaoFisicaRepository repository;


    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        // TODO Auto-generated method stub
        AvaliacaoFisica avaliacao = new AvaliacaoFisica();

        avaliacao.setAlunoId(form.getAlunoId());
        avaliacao.setPeso(form.getPeso());
        avaliacao.setAltura(form.getAltua());

        return repository.save(avaliacao);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return repository.findAll();
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }

}
