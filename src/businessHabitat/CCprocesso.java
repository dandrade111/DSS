package businessHabitat;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;

public class CCprocesso {
    
    /* Variáveis de instância */
    
    private Integer id;
    private GregorianCalendar data_criacao;
    private GregorianCalendar data_encerramento;
    private Integer id_funcionario;                     // Voluntario que criou o processo;
    private float custo_previsto;
    private float custo_final;
    private Integer id_candidatura;                     // Qual a candidatura que originou este processo
    private HashMap<Integer, Integer> material_usado;
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
                      float cp, 
                      float cf, 
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
                      float cp, 
                      float cf, 
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
                      float cp, 
                      float cf, 
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
                      float cp, 
                      float cf, 
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
                      float cp, 
                      float cf,
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
}
