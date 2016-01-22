/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import view.*;
import model.*;
import controller.*;

public class Main {

    private static ViewMain viewMain;
    private static ModelMain modelMain;
    private static ControllerMain controllerMain;
    
    private static ViewMessage viewMessage;
    private static ModelMessage modelMessage;
    private static ControllerMessage controllerMessage;

    public static void main(String[] args) {
       viewMessage = new ViewMessage();
       modelMessage = new ModelMessage();
       controllerMessage = new ControllerMessage(viewMessage, modelMessage);
       
       viewMain = new ViewMain();
       modelMain = new ModelMain();
       controllerMain = new ControllerMain(viewMain,viewMessage , modelMain);
    }
}