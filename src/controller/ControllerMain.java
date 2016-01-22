package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.ViewMain;
import model.ModelMain;
import view.ViewMessage;

public class ControllerMain implements ActionListener{
    ViewMain viewMain;
    ViewMessage viewMessage;
    ModelMain modelMain;
    
    public ControllerMain(ViewMain viewMain,ViewMessage viewMessage,ModelMain modelMain){
        this.viewMain = viewMain;
        this.viewMessage = viewMessage;
        this.modelMain = modelMain;
        //this.viewMain.jmiMessage.addActionListener(this);
         this.viewMain.jmFile.addActionListener(this);
        initView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewMain.jmFile)
            jmiMessageActionPerformed();
    }
    
    public void jmiMessageActionPerformed(){
        this.viewMain.setContentPane(viewMessage);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
    
    private void initView(){
        this.viewMain.setTitle("Hello MVC Panel");
        this.viewMain.setLocationRelativeTo(null);
        this.viewMain.setVisible(true);
    }
}