package Pseudocodigo3;
import java.util.Scanner;

		public class trabalhosenac
		
		{
			public static void main(String[] args) {
			    Scanner tc = new Scanner(System.in);
			    
		        float qnt_acao, vlr_acao, porc_taxa, tgasto, vlr_comissao, op_venda, vlr_venda, vlr_venda_total, porc_taxa_venda, vlr_comissao_venda, total_lucro;
		    
		        System.out.println("Quantas a��es voc� comprou? ");
		        qnt_acao = tc.nextFloat();
		        
		        System.out.println("Quanto vc pagou por a��o: ");
		        vlr_acao = tc.nextFloat();
		        
		        System.out.println("Quantos % � a taxa do corretor: ");
		        porc_taxa = tc.nextFloat();
		        
		        tgasto = qnt_acao*vlr_acao;
		        vlr_comissao = (tgasto*porc_taxa)/100;
		        
		        System.out.println("Voc� vendeu as a��es? [SIM: 1/NAO: 2]");
		        op_venda = tc.nextFloat();
		        
		        
		            if (op_venda == 1) {
		                System.out.println("Qual valor vc vendeu cada a��o: ");
		                vlr_venda = tc.nextFloat();
		                
		                vlr_venda_total = vlr_venda*qnt_acao;
		                
		                System.out.println("Digite a nova porcentagem que o corretor ir� receber: ");
		                porc_taxa_venda = tc.nextFloat();
		                vlr_comissao_venda = (vlr_venda_total*porc_taxa_venda)/100;
		                
		                total_lucro = vlr_venda_total - (tgasto + vlr_comissao_venda + vlr_comissao);
		                
		                System.out.println("\n_____________________________________________________________________________________");    
		                System.out.println("A quantia a quantia que vc pagou pela compra das a��es foi de: R$"+ tgasto + " reais!");
		                System.out.println("A comiss�o do corretor pelas vendas das a��es foi de: R$"+ vlr_comissao + " reais!");
		                System.out.println("_____________________________________________________________________________________");
		                System.out.println("Voc� vendeu cada a��o por R$"+ vlr_venda + " reais!");
		                System.out.println("Voc� vendeu todas as a��es por R$"+ vlr_venda_total + " reais!");
		                System.out.println("A comiss�o do corretor nas vendas das a��es foi de R$"+ vlr_comissao_venda + " reais!");
		                System.out.println("_____________________________________________________________________________________");
		                System.out.println("O seu lucro total foi de R$"+ total_lucro + " reais!");
		            }
		            
		            if (op_venda == 2) {
		            	System.out.println("Voc� n�o vendeu a��es, por isso os resultados n�o foram computados!");
		            }
		            
		            if ((op_venda != 1) && (op_venda != 2)) {
		            	System.out.println("Valor inv�lido, reinicie o programa!");
		            }
		            
			}
		}