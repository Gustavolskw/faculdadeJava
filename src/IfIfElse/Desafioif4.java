package IfIfElse;
/*DESAFIO 4
Você foi contratado para desenvolver um simulador de sistema de recomendação de 
filmes. O sistema deve solicitar ao usuário algumas informações sobre o filme, sendo: 
nome, duração em  minutos  e  se  possui  cenas  de  violência,  sexo, nudez  ou  drogas 
(perguntar individualmente). 
 
Com base nessas informações, o sistema deve classificar o filme em uma categoria 
específica, levando em consideração os itens apontados pelo usuário. As categorias 
são: 

LIVRE 
-Violência:  Arma  sem  violência;  Morte  sem  Violência;  Ossada  ou 
esqueleto sem violência; Violência Fantasiosa. 
-Sexo e Nudez: Nudez não erótica. 
-Drogas: Consumo moderado ou insinuado de droga lícita. 
 
10 ANOS 
-Não recomendado para menores de 10 (dez) anos 
-Violência: Angústia; Arma com violência; Ato criminoso sem violência; 
-Linguagem depreciativa; Medo ou tensão; Ossada ou esqueleto com 
resquício de ato de violência 
-Sexo e Nudez: Conteúdo educativo sobre sexo. 
-Drogas:  Descrição  do  consumo  de  droga  lícita;  Discussão  sobre  o 
tema drogas; Uso medicinal de droga ilícita. 
 
12 ANOS 
-Não recomendado para menores de 12 (doze) anos 
-Violência: Agressão verbal; Assédio sexual; Ato violento; Ato violento 
contra animal; Bullying; Descrição de violência; -Exposição ao perigo; 
Exposição de cadáver; Exposição de pessoa em situação 
constrangedora ou degradante; -Lesão corporal; Morte derivada de ato 
heróico; Morte natural ou acidental com dor ou violência; Obscenidade; 
Presença de sangue; Sofrimento da vítima; Supervalorização da 
beleza física; Supervalorização do consumo; Violência psicológica. 
-Sexo  e  Nudez:  Apelo  sexual;  Carícia  sexual;  Insinuação  sexual; 
Linguagem chula; Linguagem de conteúdo sexual; Masturbação; 
Nudez velada; Simulação de sexo. 
-Drogas: Consumo de droga lícita; Consumo irregular de medicamento; 
Discussão sobre legalização de droga ilícita; Indução ao uso de droga 
lícita; Menção a droga ilícita. 
 
14 ANOS 
-Não recomendado para menores de 14 (quatorze) anos 
-Violência:  Aborto;  Estigma  ou  preconceito;  Eutanásia;  Exploração 
sexual; Morte intencional; Pena de morte. 
-Sexo  e  Nudez:  Erotização;  Nudez;  Prostituição; Relação  sexual; 
Vulgaridade. 
-Drogas:  Consumo  insinuado  de droga  ilícita;  Descrição  do  consumo 
ou tráfico de droga ilícita. 
 
 
 
16 ANOS 
-Não recomendado para menores de 16 (dezesseis) anos 
-Violência: Ato de pedofilia; Crime de ódio; Estupro ou coação sexual; 
Mutilação;  Suicídio;  Tortura;  Violência  gratuita  ou  banalização  da 
violência. 
-Sexo e Nudez: Relação sexual intensa. 
-Drogas:  Consumo  de  droga  ilícita;  Indução  ao  consumo  de  droga 
ilícita; Produção ou tráfico de droga ilícita. 
 
18 ANOS 
- Não recomendado para menores de 18 (dezoito) anos 
-Violência: Apologia à violência; Crueldade. 
-Sexo e Nudez: Sexo explícito; Situação sexual complexa ou de forte 
impacto. 
-Drogas: Apologia ao uso de droga ilícita.*/

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.*;

public class Desafioif4 {

    public static void main(String[] args) {

        String message[] = { "Uso de ato Violento, Armas ou Crime", "Uso de Linuagem Ofensiva.",
                "Cenas de Sexo ou Descriçao de Ato Sexual", "Uso de Drogas, trafico ou manfatura" };
        String topicos[] = { "Violência", "Linguagem", "Sexo", "Drogas" };
        int indicacao;
        // Mensagem de Boas Vindas
        JOptionPane.showMessageDialog(null, "Seja bem Vindo ao Software de Classificaçao de indicadores de filmes!",
                "Boas Vindas!", JOptionPane.PLAIN_MESSAGE);
        // Requisiçao do nome do Filme
        String filme = JOptionPane.showInputDialog(null, "Digite nome do Seu filme.", "Filme",
                JOptionPane.INFORMATION_MESSAGE);
        // Questionario para gerar Clasificação
        indicacao = classificacao(message, topicos);
        // Mostra o Indicador de idade
        showIndication(indicacao);
    }

    public static void showIndication(int indicacao) {

        if (indicacao >= 29) {
            ImageIcon imageIcon1 = new ImageIcon(
                    new ImageIcon("src/img/18anos.png").getImage().getScaledInstance(30, 30,
                            Image.SCALE_DEFAULT));
            JOptionPane.showMessageDialog(null, "18 ANOS \r\n" + //
                    "- Não recomendado para menores de 18 (dezoito) anos \r\n" + //
                    "-Violência: Apologia à violência; Crueldade. \r\n" + //
                    "-Sexo e Nudez: Sexo explícito; Situação sexual complexa ou de forte \r\n" + //
                    "impacto. \r\n" + //
                    "-Drogas: Apologia ao uso de droga ilícita.", "clasificaçao indicativa",
                    JOptionPane.INFORMATION_MESSAGE, imageIcon1);
        } else if (indicacao >= 13) {
            ImageIcon imageIcon1 = new ImageIcon(
                    new ImageIcon("src/img/16anos.png").getImage().getScaledInstance(30, 30,
                            Image.SCALE_DEFAULT));
            JOptionPane.showMessageDialog(null, "16 ANOS \r\n" + //
                    "-Não recomendado para menores de 16 (dezesseis) anos \r\n" + //
                    "-Violência: Ato de pedofilia; Crime de ódio; Estupro ou coação sexual; \r\n" + //
                    "Mutilação;  Suicídio;  Tortura;  Violência  gratuita  ou  banalização  da \r\n" + //
                    "violência. \r\n" + //
                    "-Sexo e Nudez: Relação sexual intensa. \r\n" + //
                    "-Drogas:  Consumo  de  droga  ilícita;  Indução  ao  consumo  de  droga \r\n" + //
                    "ilícita; Produção ou tráfico de droga ilícita.", "clasificaçao indicativa",
                    JOptionPane.INFORMATION_MESSAGE, imageIcon1);
        } else if (indicacao >= 9) {
            ImageIcon imageIcon1 = new ImageIcon(
                    new ImageIcon("src/img/14anos.png").getImage().getScaledInstance(30, 30,
                            Image.SCALE_DEFAULT));
            JOptionPane.showMessageDialog(null, "14 ANOS \r\n" + //
                    "-Não recomendado para menores de 14 (quatorze) anos \r\n" + //
                    "-Violência:  Aborto;  Estigma  ou  preconceito;  Eutanásia;  Exploração \r\n" + //
                    "sexual; Morte intencional; Pena de morte. \r\n" + //
                    "-Sexo  e  Nudez:  Erotização;  Nudez;  Prostituição; Relação  sexual; \r\n" + //
                    "Vulgaridade. \r\n" + //
                    "-Drogas:  Consumo  insinuado  de droga  ilícita;  Descrição  do  consumo \r\n" + //
                    "ou tráfico de droga ilícita. ", "clasificaçao indicativa",
                    JOptionPane.INFORMATION_MESSAGE, imageIcon1);
        } else if (indicacao >= 5) {
            ImageIcon imageIcon1 = new ImageIcon(
                    new ImageIcon("src/img/12anos.png").getImage().getScaledInstance(30, 30,
                            Image.SCALE_DEFAULT));
            JOptionPane.showMessageDialog(null, "12 ANOS \r\n" + //
                    "-Não recomendado para menores de 12 (doze) anos \r\n" + //
                    "-Violência: Agressão verbal; Assédio sexual; Ato violento; Ato violento \r\n" + //
                    "contra animal; Bullying; Descrição de violência; -Exposição ao perigo; \r\n" + //
                    "Exposição de cadáver; Exposição de pessoa em situação \r\n" + //
                    "constrangedora ou degradante; -Lesão corporal; Morte derivada de ato \r\n" + //
                    "heróico; Morte natural ou acidental com dor ou violência; Obscenidade; \r\n" + //
                    "Presença de sangue; Sofrimento da vítima; Supervalorização da \r\n" + //
                    "beleza física; Supervalorização do consumo; Violência psicológica. \r\n" + //
                    "-Sexo  e  Nudez:  Apelo  sexual;  Carícia  sexual;  Insinuação  sexual; \r\n" + //
                    "Linguagem chula; Linguagem de conteúdo sexual; Masturbação; \r\n" + //
                    "Nudez velada; Simulação de sexo. \r\n" + //
                    "-Drogas: Consumo de droga lícita; Consumo irregular de medicamento; \r\n" + //
                    "Discussão sobre legalização de droga ilícita; Indução ao uso de droga \r\n" + //
                    "lícita; Menção a droga ilícita. ", "clasificaçao indicativa",
                    JOptionPane.INFORMATION_MESSAGE, imageIcon1);
        } else if (indicacao >= 2) {
            ImageIcon imageIcon1 = new ImageIcon(
                    new ImageIcon("src/img/10anos.png").getImage().getScaledInstance(30, 30,
                            Image.SCALE_DEFAULT));
            JOptionPane.showMessageDialog(null, "10 ANOS \r\n" + //
                    "-Não recomendado para menores de 10 (dez) anos \r\n" + //
                    "-Violência: Angústia; Arma com violência; Ato criminoso sem violência; \r\n" + //
                    "-Linguagem depreciativa; Medo ou tensão; Ossada ou esqueleto com \r\n" + //
                    "resquício de ato de violência \r\n" + //
                    "-Sexo e Nudez: Conteúdo educativo sobre sexo. \r\n" + //
                    "-Drogas:  Descrição  do  consumo  de  droga  lícita;  Discussão  sobre  o \r\n" + //
                    "tema drogas; Uso medicinal de droga ilícita. \r\n" + //
                    " ", "clasificaçao indicativa",
                    JOptionPane.INFORMATION_MESSAGE, imageIcon1);
        } else if (indicacao < 2) {
            ImageIcon imageIcon1 = new ImageIcon(
                    new ImageIcon("src/img/livre.png").getImage().getScaledInstance(30, 30,
                            Image.SCALE_DEFAULT));
            JOptionPane.showMessageDialog(null, "LIVRE \n" + //
                    "-Violência:  Arma  sem  violência;  Morte  sem  Violência;  Ossada  ou \n" + //
                    "esqueleto sem violência; Violência Fantasiosa. \n" + //
                    "-Sexo e Nudez: Nudez não erótica. \n" + //
                    "-Drogas: Consumo moderado ou insinuado de droga lícita. ", "clasificaçao indicativa",
                    JOptionPane.INFORMATION_MESSAGE, imageIcon1);
        }
    }

    public static int classificacao(String message[], String topicos[]) {
        int indicacaoDeIdade = 0;
        for (int i = 0; i < 4; i++) {
            Object[] options = { "Baixo", "Moderado", "Médio", "Alto", "Extremo", "Livre" };

            Object classeDeIdade = JOptionPane.showOptionDialog(null,
                    message[i], topicos[i],
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, options, options[0]);
            if (classeDeIdade.equals(0)) {
                // baixo
                indicacaoDeIdade += 1;
            } else if (classeDeIdade.equals(1)) {
                // moderado
                indicacaoDeIdade += 3;
            } else if (classeDeIdade.equals(2)) {
                // medio
                indicacaoDeIdade += 4;
            } else if (classeDeIdade.equals(3)) {
                // alto
                indicacaoDeIdade += 5;
            } else if (classeDeIdade.equals(4)) {
                // extremo
                indicacaoDeIdade += 10;
            } else if (classeDeIdade.equals(5)) {
                // livre
                indicacaoDeIdade += 0;
            }
        }
        return indicacaoDeIdade;
    }
}