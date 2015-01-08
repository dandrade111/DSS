package businessHabitat;

import exceptions.EquipaJaExisteException;
import exceptions.MaterialJaExisteException;
import exceptions.MaterialNaoExisteException;
import exceptions.TarefaJaExisteException;
import exceptions.TarefaNaoExisteoException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Objects;

public class CCprocesso {
    
    /* Variáveis de instância */
    
    private Integer id;
    private GregorianCalendar data_criacao;
    private GregorianCalendar data_encerramento;
    private Integer id_funcionario;                     // Voluntario que criou o processo;
    private double custo_previsto;
    private double custo_final;
    private Integer id_candidatura;                     // Qual a candidatura que originou este processo
    private HashMap<Integer, Integer> material_usado;   // <id do material, quantidade>
    private HashMap<Integer, CCtarefaProcesso> tarefas;
    private ArrayList<Integer> equipas;
    
    /* Construtor */
    
    public CCprocesso() {
        this.id = 0;
        this.data_criacao = new GregorianCalendar();
        this.data_encerramento = new GregorianCalendar();
        this.id_funcionario = 0;
        this.custo_previsto = 0;
        this.custo_final = 0;
        this.id_candidatura = 0;
        this.material_usado = new HashMap<>();
        this.tarefas = new HashMap<>();
        this.equipas = new ArrayList<>();
    }
    
    // Processo simples, sem tarefas, material ou equipas
    public CCprocesso(Integer i,
                      GregorianCalendar dc, 
                      GregorianCalendar de, 
                      Integer bi, 
                      double cp, 
                      double cf, 
                      Integer idc) {
        this.id = i;
        this.data_criacao = (GregorianCalendar) dc.clone();
        this.data_encerramento = (GregorianCalendar) de.clone();
        this.id_funcionario = bi;
        this.custo_previsto = cp;
        this.custo_final = cf;
        this.id_candidatura = idc;
        this.material_usado = new HashMap<>();
        this.tarefas = new HashMap<>();
        this.equipas = new ArrayList<>();
    }
    
    // Processo com material
    public CCprocesso(Integer i,
                      GregorianCalendar dc, 
                      GregorianCalendar de, 
                      Integer bi, 
                      double cp, 
                      double cf, 
                      Integer idc, 
                      HashMap<Integer, Integer> m) {
        this.id = i;
        this.data_criacao = (GregorianCalendar) dc.clone();
        this.data_encerramento = (GregorianCalendar) de.clone();
        this.id_funcionario = bi;
        this.custo_previsto = cp;
        this.custo_final = cf;
        this.id_candidatura = idc;
        this.material_usado = new HashMap<>(m);
        this.tarefas = new HashMap<>();
        this.equipas = new ArrayList<>();
    }
    
    // Processo com tarefas
    public CCprocesso(Integer i,
                      GregorianCalendar dc, 
                      GregorianCalendar de, 
                      Integer bi, 
                      double cp, 
                      double cf, 
                      HashMap<Integer, CCtarefaProcesso> t,
                      Integer idc) {
        this.id = i;
        this.data_criacao = (GregorianCalendar) dc.clone();
        this.data_encerramento = (GregorianCalendar) de.clone();
        this.id_funcionario = bi;
        this.custo_previsto = cp;
        this.custo_final = cf;
        this.id_candidatura = idc;
        this.material_usado = new HashMap<>();
        this.tarefas = new HashMap<>(t);
        this.equipas = new ArrayList<>();
    }
    
    // Processo com equipas
    public CCprocesso(Integer i,
                      GregorianCalendar dc, 
                      GregorianCalendar de, 
                      Integer bi, 
                      double cp, 
                      double cf, 
                      Integer idc,
                      ArrayList<Integer> e) {
        this.id = i;
        this.data_criacao = (GregorianCalendar) dc.clone();
        this.data_encerramento = (GregorianCalendar) de.clone();
        this.id_funcionario = bi;
        this.custo_previsto = cp;
        this.custo_final = cf;
        this.id_candidatura = idc;
        this.material_usado = new HashMap<>();
        this.tarefas = new HashMap<>();
        this.equipas = new ArrayList<>(e);
    }
    
    // Processo com tudo
    public CCprocesso(Integer i,
                      GregorianCalendar dc, 
                      GregorianCalendar de, 
                      Integer bi, 
                      double cp, 
                      double cf,
                      Integer idc,
                      HashMap<Integer, Integer> m,
                      HashMap<Integer, CCtarefaProcesso> t,
                      ArrayList<Integer> e) {
        this.id = i;
        this.data_criacao = (GregorianCalendar) dc.clone();
        this.data_encerramento = (GregorianCalendar) de.clone();
        this.id_funcionario = bi;
        this.custo_previsto = cp;
        this.custo_final = cf;
        this.id_candidatura = idc;
        this.material_usado = new HashMap<>(m);
        this.tarefas = new HashMap<>(t);
        this.equipas = new ArrayList<>(e);
    }
    
    //GET
    
    public Integer getId(){
        return this.id;
    }
 
    public GregorianCalendar getData_criacao(){
        return this.data_criacao;
    }

    public GregorianCalendar getData_encerramento(){
        return this.data_encerramento;
    } 
    
    public Integer getId_funcionario(){
        return this.id_funcionario;
    }  
    
    public double getCusto_previsto(){
        return this.custo_previsto;
    } 

    public double getCusto_final(){
        return this.custo_final;
    }
    
    public Integer getId_candidatura(){
        return this.id_candidatura;
    }

    public HashMap<Integer, Integer> getMaterial_usado() {
        return this.material_usado;
    }
    
    public Integer getQtdMaterial_usado(Integer id) throws MaterialNaoExisteException {
        if (this.material_usado.containsKey(id))
            return this.material_usado.get(id);
        else
            throw new MaterialNaoExisteException();
    }
    
    public HashMap<Integer, CCtarefaProcesso> getTarefas() {
        return this.tarefas;
    }
    
    public CCtarefaProcesso getTarefa(Integer id) throws TarefaNaoExisteoException {
        if (this.tarefas.containsKey(id))
            return this.tarefas.get(id);
        else
            throw new TarefaNaoExisteoException();
    }
    
    public ArrayList<Integer> getEquipas() {
        return this.equipas;
    }

//SET
    
    public void setId(Integer id){
        this.id = id;
    }
 
    public void setData_criacao(GregorianCalendar data_criacao){
        this.data_criacao =data_criacao;
    }

    public void setData_encerramento(GregorianCalendar data_encerramento){
        this.data_encerramento = data_encerramento;
    } 
    
    public void setId_funcionario(Integer id_funcionario){
        this.id_funcionario = id_funcionario;
    }  
    
    public void setCusto_previsto(double custo_previsto){
        this.custo_previsto = custo_previsto;
    } 

    public void setCusto_final(double custo_final){
        this.custo_final = custo_final;
    }
    
    public void setId_candidatura(Integer id_candidatura){
        this.id_candidatura = id_candidatura;
    }

    public void setMaterial_usado(HashMap<Integer, Integer> material_usado) {
        this.material_usado = new HashMap<>(material_usado);
    }

    public void setTarefas(HashMap<Integer, CCtarefaProcesso> tarefas) {
        this.tarefas = new HashMap<>(tarefas);
    }

    public void setEquipas(ArrayList<Integer> equipas) {
        this.equipas = new ArrayList<>(equipas);
    }
    
    /* Adds */
    
    public void addMaterial(Integer id, Integer qtd) throws MaterialNaoExisteException {
        if (this.containsMaterial(id))
            this.material_usado.put(id, id + this.getQtdMaterial_usado(id));
        else
            this.material_usado.put(id, id);
    }
    
    public void addMateriais(HashMap<Integer, Integer> m) throws MaterialNaoExisteException {
        for (Entry<Integer, Integer> e : m.entrySet())
            this.addMaterial(e.getKey(), e.getValue());
    }
    
    public void addEquipa(Integer id) throws EquipaJaExisteException {
        if (this.containsEquipa(id))
            throw new EquipaJaExisteException();
        else
            this.equipas.add(id);
    }
    
    public void addEquipas(ArrayList<Integer> ids) throws EquipaJaExisteException {
        for(Integer i : ids)
            this.addEquipa(i);
    }
    
    public void addTarefa(CCtarefaProcesso tp) throws TarefaJaExisteException {
        if (this.containsTarefa(tp.getId_tarefa()))
            throw new TarefaJaExisteException();
        else
            this.tarefas.put(tp.getId_tarefa(), tp);
    }
    
    public void addTarefas(HashMap<Integer, CCtarefaProcesso> m) throws TarefaJaExisteException {
        for (Entry<Integer, CCtarefaProcesso> e : m.entrySet())
            this.addTarefa(e.getValue());
    }
    
    /* Contains */
    
    public Boolean containsEquipa(Integer id) {
        Boolean contem = false;
        for (Integer i : this.equipas)
            if (i.equals(id))
                contem = true;
        return contem;
    }
    
    public Boolean containsTarefa(Integer id) {
        return this.tarefas.containsKey(id);
    }
    
    public Boolean containsMaterial(Integer id) {
        return this.material_usado.containsKey(id);
    }
}

