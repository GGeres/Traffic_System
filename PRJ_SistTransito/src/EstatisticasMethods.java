import javax.swing.JOptionPane;
import java.io.*;
public class EstatisticasMethods {
    public Estatistica[ ] CadastroTransito(Estatistica[] estatistica) throws IOException{
        int x;
        String fileName = "ArquivoEstatistica.txt";
        BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName));
        for(x = 0; x < 5; x++){
            estatistica[x] = new Estatistica();
        }
        for(x = 0; x < 5; x++){
            estatistica[x].CodCidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da cidade"));
                gravar.write(Integer.toString(estatistica[x].CodCidade)); 
                gravar.newLine();
            estatistica[x].CityName = JOptionPane.showInputDialog("Digite o nome da cidade");
                gravar.write(estatistica[x].CityName);
                gravar.newLine();
            estatistica[x].QtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes nessa cidade"));
                gravar.write(Integer.toString(estatistica[x].QtdAcidentes));
                gravar.newLine();
        }
        System.out.println("GRAVACAO FEITA COM SUCESSO ");
        gravar.close();
        return estatistica;
    }
    
    /*public PQTDAcidentes{
    
    }*/
    public void PMaiorMenor(Estatistica[] estatistica) throws IOException{
	Estatistica[] aux = new Estatistica[1];
        int OptBigLess;
        int x;
        String fileName = "ArquivoEstatistica.txt";
        BufferedReader read = new BufferedReader(new FileReader(fileName));
        
        for(x = 0; x < 4; x++){
            estatistica[x].CodCidade = Integer.parseInt(read.readLine());
            estatistica[x].CityName = read.readLine();
            estatistica[x].QtdAcidentes = Integer.parseInt(read.readLine());
        }
        int B = 0;
        int L = (10^100);
	OptBigLess = Integer.parseInt(JOptionPane.showInputDialog("1 - Cidade com Maior índice "
                                                                    + "\n2 - Cidade com menor índice"));
	switch (OptBigLess){
            case 1:                
                    for(x = 0; x < 4; x++){
                        if(estatistica[x].QtdAcidentes > B){
                            B = estatistica[x].QtdAcidentes;
                            aux[0] = estatistica[x];
                           
                        }    
                    }
                    JOptionPane.showMessageDialog(null,
                                Integer.toString(aux[0].CodCidade)+
                                "\n"+(aux[0].CityName)+
                                "\n"+Integer.toString(aux[0].QtdAcidentes));
                    break;
            case 2:                
                    for(x = 0; x < 4; x++){
                        if(estatistica[x].QtdAcidentes < L){
                            L = estatistica[x].QtdAcidentes;
                            aux[0] = estatistica[x];
                        }
                    }
                    JOptionPane.showMessageDialog(null,
                            Integer.toString(aux[0].CodCidade)+
                            "\n"+(aux[0].CityName)+
                            "\n"+Integer.toString(aux[0].QtdAcidentes));
                    break;       
        }                
    }
    
    public void PQtdAcidentes(Estatistica[] estatistica) throws IOException{
        
        int i;
        String fileName = "ArquivoEstatistica.txt";
        BufferedReader read = new BufferedReader(new FileReader(fileName));
        for(i = 0; i < 4; i++){
            estatistica[i].CodCidade = Integer.parseInt(read.readLine());
            estatistica[i].CityName = read.readLine();
            estatistica[i].QtdAcidentes = Integer.parseInt(read.readLine());
        }
        for(i = 0; i < 4; i++){
            if(estatistica[i].QtdAcidentes >= 100 && estatistica[i].QtdAcidentes <= 500){
                JOptionPane.showMessageDialog(null,
                                Integer.toString(estatistica[i].CodCidade)+
                                "\n"+(estatistica[i].CityName)+
                                "\n"+Integer.toString(estatistica[i].QtdAcidentes));
            }
        }
    } 
    
    public void PAcima(Estatistica[] estatistica) throws IOException{
        int i;
        int soma = 0;
        int media;
        String fileName = "ArquivoEstatistica.txt";
        BufferedReader read = new BufferedReader(new FileReader(fileName));
        for(i = 0; i < 4; i++){
            estatistica[i].CodCidade = Integer.parseInt(read.readLine());
            estatistica[i].CityName = read.readLine();
            estatistica[i].QtdAcidentes = Integer.parseInt(read.readLine());
        }
        for(i = 0; i < 4; i++){
            soma = estatistica[i].QtdAcidentes + soma;
        }
        media = soma/i;
        for(i = 0; i < 4; i++){
            if(estatistica[i].QtdAcidentes >= media){
                System.err.println("A cidade "+estatistica[i].CityName+" teve acidentes acima da média.");
            }
        }
    }
}
