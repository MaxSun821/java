package com.max.team.service;

import com.max.team.domain.*;
import com.max.team.exception.TeamException;


/**
 * ClassName: NameListService
 * Package: com.max.team.service
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/30 09:52
 * @Version 1.0
 */
public class NameListService {
    private Employee[] employees;

    public NameListService() {
        // 初始化员工数组
        employees = new Employee[Data.EMPLOYEES.length];


        for (int i = 0; i < employees.length; i++) {
            // 提取共性数据
            int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
            String name = Data.EMPLOYEES[i][2];
            int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
            double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);
            Equipment equipment = null;
            double bonus = 0.0;
            // 创建对象
            switch(Integer.parseInt(Data.EMPLOYEES[i][0])) {
                case Data.EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case Data.PROGRAMMER:
                    equipment = getEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case Data.DESIGNER:
                    equipment = getEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                case Data.ARCHITECT:
                    equipment = getEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    int stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;
            }
        }
    }
    private Equipment getEquipment(int i) {
        String modelOrName = Data.EQUIPMENTS[i][1];
        String displayOrTypeOrPrice = Data.EQUIPMENTS[i][2];
        Equipment equipment = null;
        switch (Integer.parseInt(Data.EQUIPMENTS[i][0])) {
            case Data.PC:
                equipment = new PC(modelOrName, displayOrTypeOrPrice);
                break;
            case Data.NOTEBOOK:
                equipment = new NoteBook(modelOrName, Double.parseDouble(displayOrTypeOrPrice));
                break;
            case Data.PRINTER:
                equipment = new Printer(modelOrName, displayOrTypeOrPrice);
                break;
        }
        return equipment;
    }
    public Employee[] getAllEmployee() {
        return employees;
    }
    public Employee getEmployee(int id) throws TeamException{
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getId() == id) {
                return employees[i];
            }
        }
        throw new TeamException("找不到指定员工");
    }

//    public static void main(String[] args) {
//        NameListService nameListService = new NameListService();
//        Employee[] employees1 = nameListService.getAllEmployee();
//        for (int i = 0; i < employees1.length; i++) {
//            System.out.println(employees1[i]);
//        }
//        try {
//            Employee employee = nameListService.getEmployee(13);
//            System.out.println(employee.toString());
//        } catch (TeamException e) {
//            System.out.println(e.getMessage());
//        }
//
//    }
}
