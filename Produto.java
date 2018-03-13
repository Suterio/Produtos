public	class	Produto   {
    private String codigo = "";
    private String descricao = "";
    private double custo = 0.00;
    private double valor = 0.00 ;

    public Produto(){}
    
    public Produto(String c, String d ){
        this.codigo = c;
        this.descricao = d;  
    }
    
   
    public Produto(String c, String d, double cs, double v ){
        this.codigo = c;
        this.descricao = d;
        this.custo = cs;
        this.valor = v;    
        if(!this.verificaMargem()){
            throw new IllegalArgumentException("Margem inválida");
        }
        

    }
    

    public String getCodigo(){
            return this.codigo;
    }
    public void setCodigo(String novoCodigo){
            codigo = novoCodigo;
    } 
    public String getDescricao(){
            return this.descricao;
    }

    public void setDescricao(String novaDescricao){
            descricao = novaDescricao;
    }
    public double getCusto(){
            return this.custo;
    } 

    public void setCusto(double novoCusto){
            custo = novoCusto;
    }

    public double getValor(){
            return this.valor;
    }
    
    public void setValor(double novoValor){
            valor = novoValor;
    }


    public void mostraProduto(){
        System.out.println("Código: " +this.codigo);
        System.out.println("Descricao: " +this.descricao);
        System.out.println("Custo: " +this.custo);
        System.out.println("Valor: " +this.valor);
    }


    public void verificcaMargem(){
        double valorMargem = (this.custo * 1.20);
        if(this.valor >= valorMargem){
            System.out.println("Margem maior ou igual a 20 %");
        } else {
            System.out.println("Margem menor do que 20 %");
        }
    }

    public boolean verificaMargem(){
        double valorMargem = (this.custo*1.20);
        if(this.valor >= valorMargem){
            return true;
        } else{
            return false;
        }
   
    }
}
