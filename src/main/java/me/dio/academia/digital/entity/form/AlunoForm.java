package me.dio.academia.digital.entity.form;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  private String nome;

  private String cpf;

  private String bairro;

  private LocalDate dataDeNascimento;

  public String getNome(){
    return nome;
  }

  public String getCpf(){
    return cpf;
  }

  public String getBairro(){
    return bairro;
  }

  public LocalDate getDataDeNascimento(){
    return dataDeNascimento;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public void setCpf(String cpf){
    this.cpf = cpf;
  }

  public void setBairro(String bairro){
    this.bairro = bairro;
  }

  public void setDataDeNascimento(LocalDate dataDeNascimento){
    this.dataDeNascimento = dataDeNascimento;
  }
}
