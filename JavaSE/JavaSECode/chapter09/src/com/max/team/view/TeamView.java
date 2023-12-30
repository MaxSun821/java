package com.max.team.view;

import com.max.team.domain.Employee;
import com.max.team.domain.Programmer;
import com.max.team.exception.TeamException;
import com.max.team.service.NameListService;
import com.max.team.service.TeamService;

/**
 * ClassName: TeamView
 * Package: com.max.team.view
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/30 15:13
 * @Version 1.0
 */
public class TeamView {
    private NameListService nameListService;
    private TeamService teamService;

    public TeamView() {
        nameListService = new NameListService();
        teamService = new TeamService();
    }
    public void enterMainMenu() {
        boolean flag = true;
        char ret = '0';
        do {
            if(ret != '1') {
                listAllEmployees();
            }
            System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：");
            char c = TSUtility.readMenuSelection();
            switch(c) {
                case '1':
                    ret = '1';
                    getTeam();
                    break;
                case '2':
                    ret = '2';
                    addMember();
                    break;
                case '3':
                    ret = '3';
                    deleteMember();
                    break;
                case '4':
                    ret = '4';
                    System.out.print("是否选择退出(Y/N)：");
                    char c1 = TSUtility.readConfirmSelection();
                    if(c1 == 'Y') {
                        flag = false;
                    }
                    break;
            }
        } while(flag);

    }
    public void listAllEmployees() {
        Employee[] allEmployee = nameListService.getAllEmployee();
        System.out.println("-----------------------游戏开发团队调度系统----------------------");
        System.out.println("ID\t姓名\t\t年龄\t工资\t\t职位\t\t状态\t\t奖金\t\t股票\t\t领用设备");
        for (int i = 0; i < allEmployee.length; i++) {
            System.out.println(allEmployee[i]);
        }
        System.out.println("-------------------------------------------------------------");
    }
    public void getTeam() {
        Programmer[] team = teamService.getTeam();
        System.out.println("-------------------团队成员列表------------------");
        System.out.println("TDI/ID\t姓名\t\t年龄\t工资\t\t职位\t\t奖金\t\t股票");
        for (int i = 0; i < team.length; i++) {
            System.out.println(team[i].getMemberId() + "/" + team[i].getId() + "\t\t" + team[i].teamString());
        }
        System.out.println("-----------------------------------------------");
    }
    public void addMember() {
        System.out.println("---------添加成员----------");
        System.out.print("请输入要添加的员工ID：");
        int id = TSUtility.readInt();
        try {
            Employee employee = nameListService.getEmployee(id);
            teamService.addMember(employee);
            System.out.println("添加成功");
            TSUtility.readReturn();
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }
    public void deleteMember() {
        System.out.println("-------------删除成员-------------");
        System.out.print("请输入要删除员工的ID：");
        int memberId = TSUtility.readInt();
        try {
            teamService.removeMember(memberId);
            System.out.println("删除成功");
            TSUtility.readReturn();
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        TeamView teamView = new TeamView();
        teamView.enterMainMenu();
    }
}
