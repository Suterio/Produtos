public	class	TestaProduto    {
	public	static 	void	main (String args[]){

    Produto testaProduto = new Produto();
    
    
    testaProduto.mostraProduto();
    
    Produto testaProduto2 = new Produto("C4321","Produto1");
    
    testaProduto2.mostraProduto();
    Produto testaProduto3 = new Produto("CB12351","Produto5",7000.00,700.00);
    
    testaProduto3.mostraProduto();
    

    }
}
