/**
 *
 * @author Gustavo Jorge Geres
 * Sistema de Transito
 * 10/10/2024
 */
import java.io.IOException;
import javax.swing.JOptionPane;
public class PrincipalClass {
    public static void main(String[] args) throws IOException{
        Estatistica[] estatistica = new Estatistica[5]; 
        EstatisticasMethods estat = new EstatisticasMethods();
        int opc = 0 ;
        while (opc!=9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastro Estatística \n2 - Consulta por quantidade de acidentes \n3 - Consulta por estatísticas de acidentes \n4 - Acidentes acima da média das 10 cidades \n9 - Finaliza"));
            switch (opc) {
                case 1 : 
                    estatistica = estat.CadastroTransito(estatistica);
                break;
                case 2 : 
                    estat.PQtdAcidentes(estatistica);
                break;
                case 3 :
                    estat.PMaiorMenor(estatistica);
                break;
                case 4 :
                    estat.PAcima(estatistica);
                break;
                case 9 : 
                    JOptionPane.showMessageDialog(null,"FINALIZADO ");
                break;
                default: 
                    JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
            }
        }
    }
}
