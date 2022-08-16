/*

qndo vc cria um registro lógico como do aluno vc determina a qntidade de bytes para os campos
no nosso caso vamos usar aluno sendo nome 20bytes, sobrenome 20bytes e pontos 2bytes.
 tendo o resgistro 42 bytes no total.
toda vez q um dado sai da memo (buffer) e vai para arquivo = output
qndo é lido e é levado para memo = input. sendo lentos no processamento

utiliza-se menos acesso de IO para diminuir o tempo de leitura. é gravado por bloco
ex: registro em 42 bytes. ele usa a base binária então acaba reservando 64 (2^6) e tenho perda
de 22 bytes.
se levar 2 registros de 42, uso 84, com 128 (2^7), com perda de 44, então é levado 3 registros já q a perda
será de apenas 2 bytes para uma única gravação.

se eu levar de 4 em 4 para gravas a perda vai ser de 88
se levar de 5 em 5 perda será de vou ter perda de 46
de 6 em 6, perda será de 4bytes.

sendo o mais interessante gravar de 6 em 6 é o ideal pra levar a maior qntidade de byte possível para o resgistro
(fator de bloco), registros ficam na área de buffer até ter 6 registros para levar o máximo possível e não ter 
perda de informação. 

essa velocidade é um requisito não funcional

 */

/*
==================================== 1 ETAPA OUTPUT ========================================
*/

class Aluno	 
{	 
 String pnome;	 
 String unome;	 
 int    pontos;	 
	 
 // construtor	 
 Aluno () {	 
  this("" ,"" ,0);	 
 }	 
	 
   Aluno ( String pnomealuno,	 
   String unomealuno,	 
   int pontosaluno )	 
 {	 
  pnome   = pnomealuno;	 
  unome  = unomealuno;	 
  pontos  = pontosaluno;	 
 }	 
}	
