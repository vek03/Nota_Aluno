package ex1;

//importa todas as classes contidas em swing e awt
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Victor Cardoso
 * Vek Histories
 */

//sua classe herda da classe JFrame que contém todas as funções de interface
public class Ex1 extends JFrame
{
    //declarando objetos de rotulo
    JLabel rotulo1,rotulo2, rotulo3, rotulo4, exibir;
    //declarando objetos de caixa de texto
    JTextField texto1,texto2, texto3, texto4;
    //declarando objeto botão de finalizar programa
    JButton calcular, limpar;
    
    //método construtor contendo todos os atributos da janela de interface
    public Ex1()
    {
        //função que chama a super classe do JFrame
        super("Calcular Nota");
        
        //Container é uma classe que contem todos os obejtos
        Container tela = getContentPane();
        
        //declara o layout como nulo para poder modificá-lo
        setLayout(null);
        
        //instancia de objetos com os valores predefinidos
        rotulo1 = new JLabel("1°Nota: ");
        rotulo2 = new JLabel("2°Nota: ");
        rotulo3 = new JLabel("3°Nota: ");
        rotulo4 = new JLabel("4°Nota: ");
        exibir = new JLabel("");
        
        //instancia de objetos de caixa de texto com tamanho predefinido
        texto1 = new JTextField(15);
        texto2 = new JTextField(15);
        texto3 = new JTextField(15);
        texto4 = new JTextField(15);
        
        //instancia do objeto botão para sair 
        calcular = new JButton("Calcular");
        limpar = new JButton("Limpar");
        
        //lugar da janela onde será impresso: margem direita, altura(de cima para baixo), tamanho em caracteres, grossura.  
        //legenda local
        rotulo1.setBounds(10,20,80,20);
        rotulo2.setBounds(10,50,80,20);
        rotulo3.setBounds(10,80,80,20);
        rotulo4.setBounds(10,110,80,20);
        
        //resultado local
        exibir.setBounds(10,140,500,20);
        
        //caixa de texto local
        texto1.setBounds(55,20,70,20);
        texto2.setBounds(55,50,70,20);
        texto3.setBounds(55,80,70,20);
        texto4.setBounds(55,110,70,20);
       
        //botões local
        calcular.setBounds(20,180,100,20);
        limpar.setBounds(20,210,100,20);
        
        
        //método para limpar caixas de texto
        limpar.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    exibir.setVisible(false);
                    texto1.setText(null);
                    texto2.setText(null);
                    texto3.setText(null);
                    texto4.setText(null);
                    texto1.requestFocus();//passa o foco para está caixa de texto
                }
            }
        );
        
        //método de soma
        calcular.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    double numero1, numero2, numero3, numero4, result;
                    numero1 = Double.parseDouble(texto1.getText());
                    numero2 = Double.parseDouble(texto2.getText());
                    numero3 = Double.parseDouble(texto3.getText());
                    numero4 = Double.parseDouble(texto4.getText());
                    result = (numero1 + numero2 + numero3 + numero4) / 4;
                    exibir.setVisible(true);
                    exibir.setText("A nota final do aluno é: " + result);
                    
                }
            }
        );
          
        
        //visibilidade do resultado apenas quando calculo for efetuado
        exibir.setVisible(false);
        
        //exibição de tudo
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(exibir);
        
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        
        tela.add(calcular);
        tela.add(limpar);
        
        //declarando o tamanho em que a janela deve abrir
        setSize(200, 300);
        
        //visibilidade da janela
        setVisible(true);
        
        //define o local do monitor em que será aberta a janela
        setLocationRelativeTo(null);
    }
    
    //método main
    public static void main(String[] args) 
    {
        //intância de objeto(classe com os atributos)
        Ex1 app = new Ex1();
        //chamando a janela
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

