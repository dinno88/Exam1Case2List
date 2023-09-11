package edu.satraining.exam1.case2.client;

import edu.satraining.exam1.case2.controller.Controller;

public class Executor {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.readData();
        controller.showData();
        controller.addData();
        controller.editData();
        controller.deleteData();
    }
}