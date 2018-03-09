public	class	TestaProduto    {
	public	static 	void	main (String args[]){

    Produto testaProduto = new Produto();
    testaProduto.setCodigo(args[0]);
    testaProduto.setDescricao(args[1]);
    testaProduto.setCusto(Double.parseDouble(args[2]));
    testaProduto.setValor(Double.parseDouble(args[3]));

    testaProduto.mostraProduto();

    testaProduto.verificcaMargem();

    testaProduto.verificaMargem();

    }
}
