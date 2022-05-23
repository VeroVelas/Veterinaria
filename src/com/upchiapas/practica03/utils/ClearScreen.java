package com.upchiapas.practica03.utils;

public class ClearScreen {
    public void ClearConsole(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        /*
        try{
            String operatingSystem = System.getProperty("os.name");

            if(operatingSystem.contains("Windows")){
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            }
        }catch(Exception e){
            System.out.println(e);
        }*/
    }
}
